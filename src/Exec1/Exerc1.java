package Exec1;

import java.util.Scanner;

public class Exerc1 {
    public static void main(String arg[]){
        System.out.println("Entre com o valor da conta:");
        Scanner s = new Scanner(System.in);
        double conta=s.nextDouble();
        double resultado = conta * 1.1;
        System.out.println("Resultado: "+resultado);
    }


}
