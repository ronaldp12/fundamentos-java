import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {
        inicio();
    }

    public static void inicio(){
        Scanner scanner = new Scanner(System.in);
        String menu, menu2, menu3;
        int opcion,opcion2,opcion3, continuar;
        do {
            menu="Elija una opcion\n\n";
            menu+= "1. Casteo\n";
            menu+= "2. Operadores de Asignacion\n";
            menu+= "3. Operadores de incremento y decremento\n";
            menu+= "4. Ejercicios combinados\n";
            System.out.println(menu);
            opcion=scanner.nextInt();
            switch (opcion){
                case 1:
                    menu2="Elija una opcion\n\n";
                    menu2+= "1. Ejercicio 1\n";
                    menu2+= "2. Ejercicio 2\n";
                    menu2+= "3. Ejercicio 3\n";
                    menu2+= "4. Ejercicio 4\n";
                    menu2+= "5. Ejercicio 5\n";
                    menu2+= "6. Ejercicio 6\n";
                    menu2+= "7. Ejercicio 7\n";
                    menu2+= "8. Ejercicio 8\n";
                    menu2+= "9. Ejercicio 9\n";
                    menu2+= "10. Ejercicio 10\n";
                    System.out.println(menu2);
                    opcion2=scanner.nextInt();
                    switch (opcion2){
                        case 1:
                            System.out.println(Main.ejercicio1());
                            break;
                        case 2:
                            System.out.println(Main.ejercicio2());
                            break;
                        case 3:
                            System.out.println(Main.ejercicio3());
                            break;
                        case 4:
                            System.out.println(Main.ejercicio4());
                            break;
                        case 5:
                            System.out.println(Main.ejercicio5());
                            break;
                        case 6:
                            System.out.println(Main.ejercicio6());
                            break;
                        case 7:
                            System.out.println(Main.ejercicio7());
                            break;
                        case 8:
                            System.out.println(Main.ejercicio8());
                            break;
                        case 9:
                            System.out.println(Main.ejercicio9());
                            break;
                        case 10:
                            System.out.println(Main.ejercicio10());
                            break;
                        default:System.out.println("Opcion invalida");
                            break;
                    }
                    break;
                case 2:
                    menu3="Elija una opcion\n\n";
                    menu3+= "1. Ejercicio 1\n";
                    menu3+= "2. Ejercicio 2\n";
                    menu3+= "3. Ejercicio 3\n";
                    menu3+= "4. Ejercicio 4\n";
                    menu3+= "5. Ejercicio 5\n";
                    System.out.println(menu3);
                    opcion3=scanner.nextInt();
                    switch (opcion3){
                        case 1:
                            System.out.println(Main.ejercicio11());
                            break;
                        case 2:
                            System.out.println(Main.ejercicio12());
                            break;
                        case 3:
                            System.out.println(Main.ejercicio13());
                            break;
                        case 4:
                            System.out.println(Main.ejercicio14());
                            break;
                        case 5:
                            System.out.println(Main.ejercicio15());
                            break;
                        default:System.out.println("Opcion invalida");
                            break;
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:System.out.println("Opcion invalida");
                break;

            }
            System.out.print("Desea continuar 1=Si/2=No ");
            continuar= scanner.nextInt();

        } while (continuar==1);
    }
}