package Visualizacao;

import java.util.Scanner;
import java.util.InputMismatchException;
import Controle.Produto;

public class Caracteristicas {
    Scanner in = new Scanner(System.in);
    public void informaPreco(Produto produPrec) {
        double preco = 0;
        do {
            try {
                System.out.print("Informe o seu preço: ");
                preco = in.nextDouble();
                if (preco <= 0) {
                    System.out.println("Preço inválido. Informe um valor maior que zero.");
                }
            }
            catch (InputMismatchException erroDouble) {
                in.next();
                System.out.println("Valor inválido. É necessário informar um caractere numérico.");
            }
        }while (preco <= 0);
        produPrec.setPreco(preco);
    }

    public void informaEstoq(Produto produEst) {
        int qntEst = -1;
        do {
            try {
                System.out.print("Informe a sua quantidade em estoque: ");
                qntEst = in.nextInt();
                if (qntEst < 0) {
                    System.out.println("Quantidade inválida. Informe um valor maior ou igual a zero.");
                }
            }
            catch (InputMismatchException erroInt) {
                in.next();
                System.out.println("Valor inválido. É necessário informar um caractere numérico.");
            }
        }while (qntEst < 0);
        produEst.setEstoq(qntEst);
    }
}