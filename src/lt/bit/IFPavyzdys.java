package lt.bit;

import java.util.Scanner;

public class IFPavyzdys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite skaiciu");
        int skaicius = sc.nextInt();
        if (skaicius > 0)
            System.out.println("Skaicius teigiamas");
        else if (skaicius < 0)
            System.out.println("Skaicius neigiamas");
        else
            System.out.println("Skaicius lygus nuliui");

//        if (skaicius > 0) {
//            System.out.println("Skaicius teigiamas");
//        } else if (skaicius < 0) {
//            System.out.println("Skaicius neigiamas");
//        } else {
//            System.out.println("Skaicius lygus nuliui");
//        }
    }
}
