import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {
        inicio();
    }

    public static void inicio(){
        Scanner scanner = new Scanner(System.in);
        String menu, menu2;
        int opcion,opcion2, continuar;
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
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:System.out.println("Opcion invalida");

            }
            System.out.print("Desea continuar 1=Si/2=No ");
            continuar= scanner.nextInt();

        } while (continuar==1);
    }
}