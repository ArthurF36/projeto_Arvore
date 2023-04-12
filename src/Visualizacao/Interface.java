package Visualizacao;

import java.util.Scanner;
import Controle.Produto;
import Modelo.Cadastro;

public class Interface {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        Cadastro cadastro = new Cadastro();
        Produto produto;
        Caracteristicas caract = new Caracteristicas();
        char opMenu;
        String codigo, descricao;
        menuProdutos();
        do {
            System.out.println();
            System.out.println("Menu de produtos.");
            System.out.println("Digite 6 para exibir o menu novamente.");
            System.out.print("Informe a sua opção desejada: ");
            opMenu = in.next().charAt(0);
            if (opMenu == '1') {
                System.out.print("Informe o código do produto: ");
                codigo = input.nextLine();
                System.out.print("Informe a sua descrição: ");
                descricao = input.nextLine();
                produto = new Produto(codigo, descricao);
                caract.informaPreco(produto);
                caract.informaEstoq(produto);
                cadastro.cadrastInserir(produto);
            }
            else if (opMenu == '2') {
                cadastro.exibeCadastros();
            }
            else if (opMenu == '3') {
                System.out.print("Informe o código do produto que deseja exibir: ");
                codigo = input.nextLine();
                cadastro.exibeInfo(codigo);
            }
            else if (opMenu == '4') {
                System.out.print("Informe o código do produto que deseja alterar: ");
                codigo = input.nextLine();
                cadastro.alteraPreco(codigo);
            }
            else if (opMenu == '5') {
                System.out.print("Informe o código do produto que deseja alterar: ");
                codigo = input.nextLine();
                cadastro.alteraEstoq(codigo);
            }
            else if (opMenu == '6') {
                menuProdutos();
            }
            else if (opMenu == '0') {
                System.out.println("Fim do programa.");
            }
            else {
                System.out.println("Opção inválida.");
            }
        }while (opMenu != '0');
    }

    public static void menuProdutos() {
        System.out.println("Opções para a manipulação de produtos:");
        System.out.println("1 - Inserir um novo produto.");
        System.out.println("2 - Exibir todos os produtos cadastrados.");
        System.out.println("3 - Exibir as informações de um único produto.");
        System.out.println("4 - Alterar o preço de um produto");
        System.out.println("5 - Alterar a quantidade do estoque de um produto.");
        System.out.println("0 - Sair do programa.");
    }
}