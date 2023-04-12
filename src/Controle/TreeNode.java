package Controle;
class TreeNode<T extends Comparable<T>> {
    private T info;
    private TreeNode<T> esq;
    private TreeNode<T> dir;

    TreeNode(T novoInfo) {
        this.info = novoInfo;
    }

    T getInfo() {
        return this.info;
    }

    TreeNode<T> getEsq() {
        return this.esq;
    }

    TreeNode<T> getDir() {
        return this.dir;
    }

    void setInfo(T novoInfo) {
        this.info = novoInfo;
    }

    void setEsq(TreeNode<T> novoEsq) {
        this.esq = novoEsq;
    }

    void setDir(TreeNode<T> novoDir) {
        this.dir = novoDir;
    }
}