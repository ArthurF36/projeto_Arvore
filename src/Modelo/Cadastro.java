package Modelo;

import Controle.BinaryTree;
import Controle.Produto;
import Visualizacao.Caracteristicas;

public class Cadastro {
    private final BinaryTree<Produto> arvore;

    public Cadastro() {
        arvore = new BinaryTree<>();
    }

    public void cadrastInserir(Produto inserInfo) {
        arvore.inserir(inserInfo);
    }

    public void exibeCadastros() {
        if (arvore.isEmpty() == true) {
            System.out.println("Não existe nenhuma informação cadastrada.");
        }
        else {
            System.out.println("Informação(ões) registrada(s):");
            arvore.exibeOrdemCresc();
        }
    }

    public void exibeInfo(String codigo) {
        Produto buscExib;
        if (arvore.isEmpty() == true) {
            System.out.println("Não existe nenhuma informação cadastrada.");
        }
        else {
            buscExib = buscaArvore(codigo);
            if (buscExib == null) {
                System.out.println("Item procurado não está cadastrado.");
            }
            else {
                System.out.println(buscExib);
            }
        }
    }

    public void alteraPreco(String codigo) {
        Produto buscPreco;
        Caracteristicas caract = new Caracteristicas();
        if (arvore.isEmpty() == true) {
            System.out.println("Não existe nenhuma informação cadastrada.");
        }
        else {
            buscPreco = buscaArvore(codigo);
            if (buscPreco == null) {
                System.out.println("Item procurado não está cadastrado.");
            }
            else {
                caract.informaPreco(buscPreco);
                System.out.println("Alterção realizada.");
            }
        }
    }

    public void alteraEstoq(String codigo) {
        Produto buscEstoq;
        Caracteristicas caract = new Caracteristicas();
        if (arvore.isEmpty() == true) {
            System.out.println("Não existe nenhuma informação cadastrada.");
        }
        else {
            buscEstoq = buscaArvore(codigo);
            if (buscEstoq == null) {
                System.out.println("Item procurado não está cadastrado.");
            }
            else {
                caract.informaEstoq(buscEstoq);
                System.out.println("Alterção realizada.");
            }
        }
    }

    private Produto buscaArvore(String buscCod) {
        Produto busca = new Produto(buscCod);
        busca = arvore.buscaTreeNode(busca);
        return busca;
    }
}