package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    public static int sumaCifara (int n) {
        int suma = 0;
        for (int i = n; i > 0; i = i/10) {
            suma = suma + i % 10;
        }

        return suma;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Unesite broj n: ");
        int n = in.nextInt();

        for(int i = 1; i <= n; i++) {
            if(i % sumaCifara(i) == 0) System.out.println(i);
        }
    }


}
