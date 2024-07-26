package note;
import java.util.Scanner;
public class Note {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        double a,b,c,r;
        int e,p;
        String x,y;

        String l = "";
        for (int i = 0; i < 47; i++) {
            l += "-";
        }
        do { 
            System.out.println(l);
            System.out.println("--------------  Elige Operacion  --------------");
            System.out.println(l);
            System.out.println("1- Calculadora de Calificaciones Finales");
            System.out.println("2- Verificar edad para votar");
            System.out.println("3- Evaluacion de Calificaciones con Letras");
            System.out.println("4- Calcular Precio con Descuento");
            System.out.println("5- Determinar la estación del año");
            System.out.println("6- Convertidor de grados");
            System.out.println("7- Conversor de monedas");
            System.out.println(l);
            System.out.println("Ingresa el numero de la accion");
            System.out.println(l);
            y= n.next();
            switch (y) {
                case "1" -> {
                    System.out.println(l);
                    System.out.println("Calculadora de Calificaciones Finales");
                    System.out.println(l);
                    System.out.println("Porcentajes (Valores del 0 al 100)\n-Parcial: 40%\n-Proyecto: 30%\n-Examen final: 30%");
                    System.out.println(l);

                    do {
                        System.out.print("Dame la calificacion del Parcial: ");
                        a = n.nextDouble();
                    } while (a < 0 || a > 100);
                    do {
                        System.out.print("Dame la calificacion del Proyecto: ");
                        b = n.nextDouble();
                    } while (b < 0 || b > 100);
                    do {
                        System.out.print("Dame la calificacion del Examen: ");
                        c = n.nextDouble();
                    } while (c < 0 || c > 100);
                    System.out.println(l);
                    a=a*4/100;
                    b=b*3/100;
                    c=c*3/100;
                    r=(a+b+c)*10;
                    System.out.println("La calificacion final es de: "+r);
                    break;
                }
                case "2" -> {
                    System.out.println(l);
                    System.out.println("Verificar edad para votar");
                    System.out.println(l);
                    System.out.print("Dame tu edad: ");
                    e = n.nextInt();
                    if(e>=18 && e<=122){
                        System.out.println(l);
                        System.out.println("Con "+ e +" de edad: Tiene edad para votar");
                        break;
                    }
                    else if(e>=0 && e<=17){
                        System.out.println(l);
                        System.out.println("Con "+ e +" de edad: Aun no puedes votar");
                        break;
                    }
                    else{
                        System.out.println(l);
                        System.out.println("Tener "+ e +" de edad: No es posible");
                        break;
                    }
                }
                case "3" -> {
                    System.out.println(l);
                    System.out.println("Evaluacion de Calificaciones con Letras");
                    System.out.println(l);
                    System.out.print("Dame la calificacion(0 al 100): ");
                    e = n.nextInt();
                    if(e>=90 && e<=100){
                        System.out.println(l);
                        System.out.println("Con calificacion de "+ e +" : Tiene A");
                        break;
                    }
                    if(e>=80 && e<=89){
                        System.out.println(l);
                        System.out.println("Con calificacion de "+ e +" : Tiene B");
                        break;

                    }
                    if(e>=70 && e<=79){
                        System.out.println(l);
                        System.out.println("Con calificacion de "+ e +" : Tiene C");
                        break;

                    }
                    if(e>=60 && e<=69){
                        System.out.println(l);
                        System.out.println("Con calificacion de "+ e +" : Tiene D");
                        break;

                    }
                    if(e>=0 && e<=59){
                        System.out.println(l);
                        System.out.println("Con calificacion de "+ e +" : Tiene F");
                        break;

                    }
                    else{
                        System.out.println(l);
                        System.out.println("TENER "+ e +" DE CALIFICACION NO ES POSIBLE!!!");
                        break;
                    }
                }
                case "4" -> {
                    System.out.println(l);
                    System.out.println("Calcular Precio con Descuento");
                    System.out.println(l);
                    System.out.print("Dame Precio del producto: ");
                    e = n.nextInt();
                    if(e<=100){
                        System.out.println(l);
                        System.out.println("Con el precio de "+ e +" :NO se tienen descuento");
                        break;
                    }
                    if(e>100 && e<=200){
                        System.out.println(l);
                        System.out.println("Con el precio de "+ e +" :Tiene 10% de descuento");
                        break;
                    }
                    if(e>200 && e<=500){
                        System.out.println(l);
                        System.out.println("Con el precio de "+ e +" :Tiene 20% de descuento");
                        break;
                    }
                    if(e>500){
                        System.out.println(l);
                        System.out.println("Con el precio de "+ e +" :Tiene 25% de descuento");
                        break;
                    }
                }
                case "5" -> {
                    System.out.println(l);
                    System.out.println("Determinar la estación del año");
                    System.out.println(l);
                    System.out.println("Lista de meses:\n1.-Enero\n2.-Febrero\n3.-Marzo\n4.-Abril\n5.-Mayo\n6.-Junio\n7.-Julio\n8.-Agosto\n9.-Septiembre\n10.-Octubre\n11.-Noviembre\n12.-Diciembre");
                    System.out.println(l);
                    System.out.print("Dame el numero del mes:");
                    e = n.nextInt();
                    if(e==12 || e==1 || e==2){
                        System.out.println(l);
                        System.out.println("La estación del año es: Invierno");
                        break;
                    }
                    if(e==3 || e==4 || e==5){
                        System.out.println(l);
                        System.out.println("La estación del año es: Primavera");
                        break;
                    }
                    if(e==6 || e==7 || e==8){
                        System.out.println(l);
                        System.out.println("La estación del año es: Verano");
                        break;
                    }
                    if(e==9 || e==10 || e==11){
                        System.out.println(l);
                        System.out.println("La estación del año es: Otoño");
                        break;
                    }
                    else{
                        System.out.println(l);
                        System.out.println("Error al ingresar el mes");
                        break;
                    }
                }
                case "6" -> {
                    System.out.println(l);
                    System.out.println("Convertidor de grados");
                    System.out.println(l);
                    System.out.println("Selecciona a que deseas convertir\n1.Fahrenheit\n2.Kelvin");
                    System.out.print("Ingresa No. de la operacion: ");
                    e = n.nextInt();
                    System.out.println(l);
                    if(e==1){
                        System.out.print("Dame Grados Celsius:");
                        a = n.nextDouble();
                        System.out.println(l);
                        r=(a*9/5)+32;
                        System.out.println(a+"°C es equivalente a "+r+"°F");
                        break;
                        
                    }
                    if(e==2){
                        System.out.print("Dame Grados Celsius:");
                        a = n.nextDouble();
                        System.out.println(l);
                        r=a+273.15;
                        System.out.println(a+"°C es equivalente a "+r+"°K");
                        break;
                    }
                    else{
                        System.out.println("Error al ingresar No. de la operacion");
                        break;
                    }

                }
                case "7" -> {
                    System.out.println(l);
                    System.out.println("Conversor de monedas");
                    System.out.println(l);
                    System.out.print("Ingresa No. de pesos a convertir: ");
                    a = n.nextDouble();
                    System.out.println("Ingresa el numero de la moneda");
                    System.out.println( "1.-Dólar (USD)\n2.-Euro (EUR)\n3.-Bath (THB)\n4.-Yen (JPY)\n5.-Won (KRW)\n6.-Dólar Australiano (AUD)\n7.-Sol (PEN)\n8.-Dólar Canadiense (CAD)\n9.-Bolívar (VES)\n10.-Peso Argentino (ARS)");
                    p = n.nextInt();
                    switch (p) {
                        case 1 -> {
                            r=a*0.055371;
                            System.out.println("Con "+a+" Pesos Tienes "+r+" en Dólar");
                            break;
                        }
                        case 2 -> {
                            r=a*0.0508383;
                            System.out.println("Con "+a+" Pesos Tienes "+r+" en Euro");
                            break;
                        }
                        case 3 -> {
                            r=a*2.00984;
                            System.out.println("Con "+a+" Pesos Tienes "+r+" en Bath");
                            break;
                        }
                        case 4 -> {
                            r=a*8.72207;
                            System.out.println("Con "+a+" Pesos Tienes "+r+" en Yen");
                            break;
                        }
                        case 5 -> {
                            r=a*76.9122;
                            System.out.println("Con "+a+" Pesos Tienes "+r+" en Won");
                            break;
                        }
                        case 6 -> {
                            r=a*0.0828535;
                            System.out.println("Con "+a+" Pesos Tienes "+r+" en Dólar Australiano");
                            break;
                        }
                        case 7 -> {
                            r=a*0.207443;
                            System.out.println("Con "+a+" Pesos Tienes "+r+" en Sol");
                            break;
                        }
                        case 8 -> {
                            r=a*0.0761006;
                            System.out.println("Con "+a+" Pesos Tienes "+r+" en Dólar Canadiense");
                            break;
                        }
                        case 9 -> {
                            r=a*2.02434;
                            System.out.println("Con "+a+" Pesos Tienes "+r+" en Bolívar");
                            break;
                        }
                        case 10 -> {
                            r=a*51.1607;
                            System.out.println("Con "+a+" Pesos Tienes "+r+" en Peso Argentino");
                            break;
                        }
                        default -> {
                            System.out.println("Error al ingresar la moneda");
                            break;
                        }
                    }
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
                // case "8" -> {
                //     System.out.println(l);
                //     System.out.println("Brindar información");
                //     System.out.println(l);
                //     break;
                // }

/*
 *         String l = "";
        for (int i = 0; i < 45; i++) {
            l += "-";
        }
        do { 
            System.out.println(l);
            System.out.println("-------------  Elige Operacion  -------------");
            System.out.println(l);
            System.out.println("1- Calculadora de Calificaciones Finales");
            System.out.println("2- Verificar edad para votar");
            System.out.println("3- Evaluacion de Calificaciones con Letras");
            System.out.println("4- Calcular Precio con Descuento");
            System.out.println("5- Determinar la estación del año");
            System.out.println("6- Convertidor de grados");
            System.out.println("7- Conversor de monedas");
            System.out.println("8- Brindar información");
            System.out.println(l);
            System.out.println("Ingresa el numero de la accion");
            System.out.println(l);
            y= n.next();
            switch (y) {
                case "1" -> {
                    System.out.println(l);
                    System.out.println("Calculadora de Calificaciones Finales");
                    System.out.println(l);
                    System.out.print("Dame la calificacion del examen: 111");
                    a=n.nextDouble();
                            //Parciales: 40%
                            //Proyecto: 30%
                            //Examen final: 30%

                    break;
                }
                case "2" -> {
                    System.out.println(l);
                    System.out.println("Verificar edad para votar");
                    System.out.println(l);
                    break;
                }
                case "3" -> {
                    System.out.println(l);
                    System.out.println("Evaluacion de Calificaciones con Letras");
                    System.out.println(l);
                    break;
                }
                case "4" -> {
                    System.out.println(l);
                    System.out.println("Calcular Precio con Descuento");
                    System.out.println(l);
                    break;
                }
                case "5" -> {
                    System.out.println(l);
                    System.out.println("Determinar la estación del año");
                    System.out.println(l);
                    break;
                }
                case "6" -> {
                    System.out.println(l);
                    System.out.println("Convertidor de grados");
                    System.out.println(l);
                    break;
                }
                case "7" -> {
                    System.out.println(l);
                    System.out.println("Conversor de monedas");
                    System.out.println(l);
                    break;
                }
                case "8" -> {
                    System.out.println(l);
                    System.out.println("Brindar información");
                    System.out.println(l);
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
 */