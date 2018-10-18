package ba.unsa.etf;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Unesite neki broj: ");
        Scanner ulaz = new Scanner(System.in);
        int n = ulaz.nextInt();
        for (int i = 1; i < n; i++){
            if(i%sumaCifara(i) == 0){
                System.out.println(i + " ");
            }
        }
    }
    public static int sumaCifara(int n){
        int suma=0;
        while(n != 0){
            suma += n%10;
            n /= 10;
        }
        return suma;
    }
}
