package Controle;
public class BinaryTree<T extends Comparable<T>> {
    private TreeNode<T> raiz;

    public void inserir(T info) {
        if (this.isEmpty() == true) {
            this.raiz = new TreeNode<>(info);
            System.out.println("Cadastro realizado com sucesso.");
        }
        else {
            inserirNode(info);
        }
    }

    private void inserirNode(T info) {
        TreeNode<T> novo;
        TreeNode<T> aux;
        int compara;
        novo = new TreeNode<>(info);
        aux = this.raiz;
        while (aux != null) {
            compara = aux.getInfo().compareTo(info);
            if (compara == 0) {
                System.out.println("Cadastro realizado anteriormente. Tente outro código de verificação.");
                return;
            }
            else if (compara > 0) {
                if (aux.getEsq() == null) {
                    aux.setEsq(novo);
                    break;
                }
                aux = aux.getEsq();
            }
            else {
                if (aux.getDir() == null) {
                    aux.setDir(novo);
                    break;
                }
                aux = aux.getDir();
            }
        }
        System.out.println("Cadastro realizado com sucesso.");
    }

    public void exibeOrdemCresc() {
        TreeNode<T> aux;
        aux = this.raiz;
        percorrerEmOrdem(aux);
    }

    private void percorrerEmOrdem(TreeNode<T> aux) {
        if (aux != null) {
            percorrerEmOrdem(aux.getEsq());
            System.out.println(aux.getInfo());
            System.out.println();
            percorrerEmOrdem(aux.getDir());
        }
    }

    public T buscaTreeNode(T info) {
        TreeNode<T> aux;
        int compara;
        aux = this.raiz;
        while (aux != null) {
            compara = aux.getInfo().compareTo(info);
            if (compara == 0) {
                return aux.getInfo();
            }
            else if (compara > 0) {
                if (aux.getEsq() == null) {
                    return null;
                }
                aux = aux.getEsq();
            }
            else {
                if (aux.getDir() == null) {
                    return null;
                }
                aux = aux.getDir();
            }
        }
        return null;
    }

    public boolean isEmpty() {
        if (this.raiz == null) {
            return true;
        }
        return false;
    }
}