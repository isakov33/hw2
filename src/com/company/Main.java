package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        generateRandomAge();
        System.out.println(temp(generateRandomAge(),20));
        System.out.println(temp(generateRandomAge(),15));
        System.out.println(temp(generateRandomAge(),25));
        System.out.println(temp(generateRandomAge(),12));
        System.out.println(temp(generateRandomAge(),30));

    }
    public static String temp(int age,int temp){
        if (age > 20 && age < 45 && temp > -20 && temp < 30){
            return "Можно идти гулять";

        }else if (age < 20 && temp > 0 && temp < 28){
            return "Можно идти гулять";
        }else if (age > 45 && temp > -10 && temp < 25){
            return "Можно выйти на улицу";
        }else {

            return "Оставайтесь дома";

        }

    }
    public static int generateRandomAge(){

        Random albuksa = new Random();
        int albu = albuksa.nextInt(60) + 1;
        return albu;



    }
}
