package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      String username,password,secim,ysifre;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz:");
        username=input.nextLine();

        System.out.print("Şifrenizi giriniz:");
        password=input.nextLine();

        if (username.equals("patika") && password.equals("java123")){
            System.out.println("Giriş Başarılı");
        }else{
            System.out.println("Girdiğiniz şifre yanlış. Şifrenizi sıfırlamak ister misiniz?");
            System.out.println("Evet/Hayır");
            secim=input.nextLine();

            switch (secim)
            {
                case "Evet":
                    System.out.print("Yeni şifrenizi giriniz:");
                    ysifre=input.nextLine();

                    if (ysifre.equals("java123")){
                        System.out.print("Yeni şifreniz eskisiyle aynı olamaz.");

                    }
                    else{
                        System.out.print("Şifreniz başarıyla değiştirildi.");
                    }
                    break;
                case "Hayır":
                    break;
                default:
                    System.out.print("Hatalı bir seçim yaptınız!");


            }
        }
    }
}
