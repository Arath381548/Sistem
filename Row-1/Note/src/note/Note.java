
package note;
import java.util.Scanner;
public class Note {

    public static void main(String[] args) {
        Scanner n =new Scanner(System.in);
        double a,b,c,d,r;
        String x,y;
        String l = "";
        for (int i = 0; i < 30; i++) {
            l += "-";
        }
        do { 
            System.out.println(l);
            System.out.println("------ Elige Operacion  ------");
            System.out.println(l);
            System.out.println("1- Area de rectangulo");
            System.out.println("2- Promedio de 3 No.");
            System.out.println("3- Indice Masa Corporal");
            System.out.println("4- Salario neto de empleado");
            System.out.println(l);
            System.out.println("Ingresa el numero de la accion");
            System.out.println(l);
            y= n.next();
            switch (y) {
                case "1" -> {
                    System.out.println(l);
                    System.out.println("Area de rectangulo");
                    System.out.println(l);
                    System.out.print("Dame Base: ");
                    a= n.nextDouble();
                    System.out.print("Dame Altura: ");
                    b= n.nextDouble();
                    System.out.println(l);
                    r=(a*b)/2;
                    System.out.println("El area es: "+ r);
                }
                case "2" -> {
                    System.out.println(l);
                    System.out.println("Promedio de 3 No.");
                    System.out.println(l);
                    System.out.print("Dame Calificacion 1: ");
                    a= n.nextDouble();
                    System.out.print("Dame Calificacion 2: ");
                    b= n.nextDouble();
                    System.out.print("Dame Calificacion 3: ");
                    c= n.nextDouble();
                    System.out.println(l);
                    r=(a+b+c)/3;
                    r=Math.round(r * 100.0) / 100.0;
                    System.out.println("El Promedio es: "+ r);
                }
                case "3" -> {
                    System.out.println(l);
                    System.out.println("Indice Masa Corporal");
                    System.out.println(l);
                    System.out.print("Dame Peso: ");
                    a= n.nextDouble();
                    System.out.print("Dame Altura: ");
                    b= n.nextDouble();
                    System.out.println(l);
                    r=a/(b*b);
                    r=Math.round(r * 100.0) / 100.0;
                    System.out.println("El IMC es: "+ r);
                    break;
                }
                case "4" -> {
                    System.out.println(l);
                    System.out.println("Salario neto de empleado");
                    System.out.println(l);
                    System.out.print("Dame Salario en Bruto: ");
                    a= n.nextDouble();
                    System.out.print("Dame el Impuestos (%): ");
                    b= n.nextDouble();
                    System.out.print("Dame la deduccion adicional: ");
                    c= n.nextDouble();
                    System.out.println(l);
                    d=a*(b/100);
                    r=((a-d)-c);
                    System.out.println(r);
                    break;
                }
                default -> {
                    System.out.println(l);
                    System.out.println("Operacion invalida");
                    break;
                }    
            }
            System.out.println(l);
            System.out.println("Salir preciona -x-");
            System.out.println(l);
            x = n.next();
        } while (!x.equals("x"));
        n.close();

    }
    
}
