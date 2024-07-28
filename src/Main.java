//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        System.out.println(ejercicio1());
        System.out.println(ejercicio2());
        System.out.println(ejercicio3());
        System.out.println(ejercicio15());
    }

        public static int ejercicio1() {
            int x = (int) 5.89 + (int) 3.45;
            return x;
        }

        public static int ejercicio2() {
            char myChar = 'A';
            int myInt = (int) myChar;
            return  myInt;
        }

        public static int ejercicio3() {
            double d = 100.04;
            long l = (long)d;
            int i = (int)l;
            return i;
        }

        public static int ejercicio4() {
            String mystring="34";
            int myInt2=Integer.parseInt(mystring);
            return myInt2;
        }

        public static int ejercicio5() {
            int resultado = (int) (char) (byte) -1;
            return resultado;
        }

        public static char ejercicio6() {
            int myint = 65;
            char mychar = (char) myint;
            return  mychar;
        }

        public static int ejercicio7() {
            long myLong = 978;
            int myInt = (int) myLong;
            return  myInt;
        }

        public static String ejercicio8() {
            float myFloat = 3.45f;
            String mystring = Float.toString(myFloat);
            return  mystring;
        }

        public static int ejercicio9() {
            int resultado = (int) Math.round(3.7);
            return resultado;
        }

        public static int ejercicio10() {
            byte mybyte = 50;
            short myshort = (byte) mybyte;
            return myshort;
        }

        //Operadores de Asignacion

        public static int ejercicio11() {
            int x = 10;
            x += 5;
            return x;
        }

        public static int ejercicio12() {
            int y = 10;
            int x=3;
            y *= x+5;
            return y;
        }

        public static int ejercicio13() {
            int a = 15;
            a %= 4;
            return a;
        }

        public static int ejercicio14() {
            int x = 15;
            int y = 5;
            x += y;
            return x;
        }

        public static int ejercicio15() {
            int x = 8;
            x ^= 2;
            return x;
        }










}