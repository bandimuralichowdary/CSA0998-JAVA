//Celsius to Farenheit

import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int c, fin;
        c = s.nextInt();
        fin = (c * 9 / 5) + 32;
        System.out.println("Output = " + fin);
    }
}
