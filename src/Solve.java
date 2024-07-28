import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {
        inicio();
    }

    public static void inicio(){
        Scanner scanner = new Scanner(System.in);
        String menu, menu2, menu3, menu4, menu5;
        int opcion,opcion2,opcion3,opcion4,opcion5, continuar;
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
                    menu4="Elija una opcion\n\n";
                    menu4+= "1. Ejercicio 1\n";
                    menu4+= "2. Ejercicio 2\n";
                    menu4+= "3. Ejercicio 3\n";
                    menu4+= "4. Ejercicio 4\n";
                    menu4+= "5. Ejercicio 5\n";
                    System.out.println(menu4);
                    opcion4=scanner.nextInt();
                    switch (opcion4){
                        case 1:
                            System.out.println(Main.ejercicio16());
                            break;
                        case 2:
                            Main.ejercicio17();
                            break;
                        case 3:
                            System.out.println(Main.ejercicio18());
                            break;
                        case 4:
                            Main.ejercicio19();
                            break;
                        case 5:
                            System.out.println(Main.ejercicio20());
                            break;
                        default:System.out.println("Opcion invalida");
                            break;
                    }
                    break;
                case 4:
                    menu5="Elija una opcion\n\n";
                    menu5+= "1. Ejercicio 1\n";
                    menu5+= "2. Ejercicio 2\n";
                    menu5+= "3. Ejercicio 3\n";
                    menu5+= "4. Ejercicio 4\n";
                    menu5+= "5. Ejercicio 5\n";
                    menu5+= "6. Ejercicio 6\n";
                    menu5+= "7. Ejercicio 7\n";
                    menu5+= "8. Ejercicio 8\n";
                    menu5+= "9. Ejercicio 9\n";
                    menu5+= "10. Ejercicio 10\n";
                    System.out.println(menu5);
                    opcion5=scanner.nextInt();
                    switch (opcion5){
                        case 1:
                            System.out.println(Main.ejercicio21());
                            break;
                        case 2:
                            System.out.println(Main.ejercicio22());
                            break;
                        case 3:
                            Main.ejercicio23();
                            break;
                        case 4:
                            System.out.println(Main.ejercicio24());
                            break;
                        case 5:
                            Main.ejercicio25();
                            break;
                        case 6:
                            System.out.println(Main.ejercicio26());
                            break;
                        case 7:
                            System.out.println(Main.ejercicio27());
                            break;
                        case 8:
                            System.out.println(Main.ejercicio28());
                            break;
                        case 9:
                            System.out.println(Main.ejercicio29());
                            break;
                        case 10:
                            System.out.println(Main.ejercicio30());
                            break;
                        default:System.out.println("Opcion invalida");
                            break;
                    }
                    break;
                default:System.out.println("Opcion invalida");
                break;

            }
            System.out.print("Desea continuar 1=Si/2=No ");
            continuar= scanner.nextInt();

        } while (continuar==1);
    }
}