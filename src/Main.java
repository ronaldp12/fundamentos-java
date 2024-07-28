//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        System.out.println(ejercicio30());
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

        //Operadores incremento y decremento

        public static int ejercicio16() {
            int x = 5;
            int y = ++x;
            return y;
        }

        public static void ejercicio17() {
            int a = 5;
            System.out.println(a++);
            System.out.println(a);
        }

        public static int ejercicio18() {
            int count = 10;
            count --;
            return count;
        }

        public static void ejercicio19() {
            int i = 10;
            System.out.println(++i);
            System.out.println(i++);
        }

        public static int ejercicio20() {
            int x = 3;
            x = x++;
            return x;
        }

        public static int ejercicio21() {
            int i = 5;
            i += ++i + i++ + ++i;
            return i;
        }

        public static int ejercicio22() {
            double myDouble = 23;
            int myInt = (int) myDouble;
            myInt++;
            return  myInt;
        }

        public static void ejercicio23() {
            double d = 5.7;
            int i = (int)d;
            i *= 2;
            System.out.println(i--);
        }

        public static double ejercicio24() {
            int i = 10;
            i /= 2.0;
            double a =(double) i;
            return a;
        }

        public static void ejercicio25() {
            char c = 'X';
            c += 32;
            System.out.println(c);
        }

        public static short ejercicio26() {
            long d = 10;
            short i = (short)d;
            i *= 3;
            return i;
        }

        public static int ejercicio27() {
            int x = 10;
            x += (x++) + (++x);
            return  x;
        }

        public static byte ejercicio28() {
            float d = 10;
            byte i = (byte)d;
            --i;
            return i;
        }

        public static byte ejercicio29() {
            int i = 257;
            byte b = (byte)i;
            return b;
        }

        public static int ejercicio30() {
            double myDouble = 10;
            int myInt = (int) myDouble;
            myInt +=5;
            ++myInt;
            return  myInt;
        }











}