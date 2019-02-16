package Exec4;

import java.util.Scanner;

public class Exerc4 {
    public static void main(String args[]){
        System.out.println("entre com um número");
         Scanner s = new Scanner(System.in);
         Double num = s.nextDouble();
         if(0 <= num && num <= 100){
           System.out.println("Número está compreendido entre 0 e 100");
         }
         else{
             System.out.println("Número não está compreendido entre 0 e 100");
         }
    }
}
