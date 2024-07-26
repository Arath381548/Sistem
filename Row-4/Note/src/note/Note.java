package note;
import java.util.Scanner;
public class Note {
    public static void main(String[] args) {
        Scanner g= new Scanner(System.in);
        int select,numero,numero2;
        String pal;
        String l = "";
        for (int i = 0; i < 40; i++) {
            l += "-";
        }

        System.out.println(l);
        System.out.println("Menu de seleccion");
        System.out.println(l);
        System.out.println("1.Determinar si un numero es Primo\n2.Maximo comun divisor de 2 numeros\n3.Determinar si es palindromo");
        System.out.println("4.Cambiar texto a mayusculas\n5.Cambiar un caracter de un texto\n6.Calcular la raiz cuadrada");
        System.out.println(l);
        System.out.print("Ingresa el No. de la operacion: ");
        select=g.nextInt();
        System.out.println(l);
        
        switch (select) {
            case 1:
                System.out.println("1.Determinar si un numero es Primo");
                System.out.print("Ingresa Numero: ");
                numero=g.nextInt();
                boolean p= act1(numero);
                System.out.println("Que "+numero+" resultara ser primo es: "+p);
                break;
            case 2:
                System.out.println("Maximo comun divisor de 2 numeros");
                System.out.print("Ingresa Numero 1: ");
                numero=g.nextInt();
                System.out.print("Ingresa Numero 2: ");
                numero2=g.nextInt();
                int r=act2(numero, numero2);
                System.out.print("Maximo comun divisor: "+r);
                break;
            case 3:
                System.out.println("Determinar si es palindromo");
                System.out.print("Ingresa palabra: ");
                pal=g.next();
                String b=act3(pal);
                System.out.println("La palabra: "+pal+" "+b);
                break;
            case 4:
                System.out.println("Cambiar texto a mayusculas");
                act4(g);
                break;
            case 5:
                System.out.println("Cambiar un caracter de un texto");
                System.out.print("Ingresa palabra: ");
                String f = g.next();
                String c = act5(g, f);
                System.out.println("Palabra cambiada: "+c);
                break;
            case 6:
                System.out.println("Calcular la raiz cuadrada");
                System.out.print("Ingresa Numero : ");
                double y=g.nextInt();
                double m=act6(y);
                System.out.println("La raiz de "+y+" es "+m);
                break;

            default:
                break;
        }
    }

    public static boolean act1(int n){
        boolean re;
        int c=0,x=1;
        while (x<=n) { 
            if(n%x==0){
                c++;
            }
            x++;
        }
        if(c==2){
            re=true;
        }
        else{
            re=false;
        }
        return re;
    }
    public static int act2(int n1,int n2){
        while (n2 != 0) {
            int r = n2;
            n2 = n1 % n2;
            n1 = r;
        }
        return n1;
    }
    public static String act3(String a){
        String z, rev="";
        for(int x=a.length()-1;x>=0;x--){
            rev+=a.charAt(x);
        }
        if(a.equals(rev)){
            z="Es un palindromo";
        }
        else{
            z="No es palindromo";
        }
        
        return z;
    }

    public static void act4(Scanner g){
        int c=0;
        boolean sp = false;
        do{
            System.out.print("Ingresa palabra: ");
            String pal = g.nextLine();
            
            for (int i = 0; i < pal.length(); i++) {
                if (Character.isWhitespace(pal.charAt(i))) {
                    c += 1;
                    sp = true;
                    break;
                }
            }
            if(c>=1){
                System.out.println("Palabra: " + pal.toUpperCase() + "Estas utilizando " + c+" espacios\nSaliendo por poner espacios");
            }
            else{
                System.out.println("Palabra: " + pal.toUpperCase() );
            }
        }while (!sp);
    }
    public static String act5(Scanner g,String a){
        String w,e,r;
        System.out.print("Ingresa letra a cambiar: ");
        e=g.next();
        System.out.print("Ingresa nueva letra: ");
        r=g.next();
        w=a.replace(e, r);
        return w;
    }
    public static double act6(double x){
        x=Math.sqrt(x);
        return x;
    }
}
