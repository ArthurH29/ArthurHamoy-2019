package Exec3;

import java.util.Scanner;

public class Exerc3 {
    public static void main(String args[]){
            System.out.println("Entre com o salario bruto: ");
            Scanner s = new Scanner(System.in);
            Double sb = s.nextDouble();
            System.out.println("Entre com a prestação: ");
            Double prest = s.nextDouble();
            Double perset = sb * 0.3;
            if (prest <= perset ) {
                System.out.println("Impestimo concedido");
            }
            else {
                System.out.println("Impestimo não concedido");
            }

    }
}
