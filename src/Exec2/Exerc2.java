package Exec2;

import java.util.Scanner;

public class Exerc2 {
    public static void main(String args[]){
        System.out.println("entre com a altura da lata de óleo: ");
        Scanner s = new Scanner (System.in);
        float alt=s.nextFloat();
        System.out.println("entre com o raio da lata de óleo: ");
        float raio = s.nextFloat();
        Double volume = 3.141559* (raio*raio)*alt;
        System.out.println("Resultado: "+volume);
    }
}
