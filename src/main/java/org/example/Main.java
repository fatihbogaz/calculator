package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz :");
        int firstValue = input.nextInt();
        System.out.print("ikinci sayıyı giriniz :");
        int secondValue = input.nextInt();
        System.out.println("\n1.Toplama\n2.Çıkarma\n3.Çarpma\n4.Bölme ");
        System.out.print("\nYapılacak işlemin numarasını seçiniz. (1-2-3-4) :");
        int operation = input.nextInt();
        switch (operation) {
            case 1:
                System.out.println(firstValue + secondValue);
                break;
            case 2:
                System.out.println(firstValue - secondValue);
                break;
            case 3:
                System.out.println(firstValue * secondValue);
                break;
            case 4:
                if(secondValue==0)
                    System.out.println("Bir sayı sıfıra bölünürse sonuç tanımsızdır !");
                else
                    System.out.println(firstValue / (float)secondValue);
                break;
            default:
                System.out.println("Hatalı giriş yaptınız");
                break;
        }
    }
}




