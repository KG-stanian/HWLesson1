package com.company;

public class Main {

    public static void main(String[] args) {


        String name = "9globus";
        final int num = 9;
        System.out.println(num);
        String word = "globus";
        System.out.println(num + word);
        System.out.println(name + num + word);


        if (num < 0) {
            System.out.println("Вы сохранили отрицательное число");
        }
        if (num > 0) {
            System.out.println("Вы сохранили положительное число");

        } else {
            System.out.println("Вы сохранили нуль");
        }


    }
}