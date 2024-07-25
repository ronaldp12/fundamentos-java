//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        System.out.println(ejercicio1());
        System.out.println(ejercicio2());
        System.out.println(ejercicio3());
        System.out.println(ejercicio4());
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






}