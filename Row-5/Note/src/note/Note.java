
package note;

import java.util.Arrays;
import java.util.Scanner;

public class Note {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String x;
        int select,g,par=0,imp=0;
        int[] p1=new int[10];
        int[] p2=new int[5];
        int[] p3=new int[8];
        int[] p4=new int[6];
        int[] p=new int[6];

        
        System.err.println("Elije que quieres Hacer\n");
        System.out.println("1.Contar números pares e impares\n2.Suma de Elementos");
        System.out.println("3.Encontrar número Mayor y Menor\n4.Invertir Elementos\n");

        System.err.println("Ingresa Numero");
        select=s.nextInt();
        switch (select) {
            case 1:
                System.out.println("\nContar números pares e impares\n");
                for (int idx = 0; idx < p1.length; idx++) {
                    System.out.print("Ingresa numero: ");
                    g=s.nextInt();
                    p1[idx]=g;
                    if(g%2==0){
                        par++;
                    }
                    else{
                        imp++;
                    }
                }
                System.out.println("Numeros Ingresados: " +Arrays.toString(p1));
                System.out.println("Los Numeros Ingresados tienen: "+par+" Numeros pares, "+imp+" Numeros impares");

                break;
            case 2:
                System.out.println("\nSuma de Elementos\n");
                for (int idx = 0; idx < p2.length; idx++) {
                    System.out.print("Ingresa numero: ");
                    g=s.nextInt();
                    p2[idx]=g;
                    par+=g;
                    
                }
                System.out.println("Numeros Ingresados: " +Arrays.toString(p2));
                System.out.println("La suma de los Numeros Ingresados : "+par);
                break;
            case 3:
                System.out.println("\nEncontrar número Mayor y Menor\n");
                for (int idx = 0; idx < p3.length; idx++) {
                    System.out.print("Ingresa numero: ");
                    g=s.nextInt();
                    p3[idx]=g;
                    
                }
                System.out.println("Numeros Ingresados: " +Arrays.toString(p3));
                Arrays.sort(p3);
                System.out.println("Numeros Menor: " +p3[0]);
                System.out.println("Numeros Mayor: " +p3[p3.length-1]);
                break;
            case 4:
                System.out.println("\nInvertir Elementos\n");
                for (int idx = 0; idx < p4.length; idx++) {
                    System.out.print("Ingresa numero: ");
                    g=s.nextInt();
                    p4[idx]=g;
                    
                }
                System.out.println("Numeros Ingresados: " +Arrays.toString(p4));
                for (int idx = 0; idx < p.length; idx++) {
                    g=p4[idx];
                    p[p.length-1-idx]=g;
                    
                }
                System.out.println("Numeros Ingresados Invertido: " +Arrays.toString(p));
                break;
        
            default:
                break;
        }

    }

}
