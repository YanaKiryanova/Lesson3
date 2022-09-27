package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("--------------------Task1.1------------------");
//        exerciseOne1();
//        System.out.println("--------------------Task1.2------------------");
//        exerciseOne2();
//        System.out.println("--------------------Task1.3------------------");
//        exerciseOne3();
//        System.out.println("--------------------Task1.4------------------");
//        exerciseOne4();
//        System.out.println("--------------------Task2.1------------------");
//        exerciseTwo1();
//        System.out.println("--------------------Task2.2------------------");
//        exerciseTwo2();
//        System.out.println("--------------------Task2.3------------------");
//        exerciseTwo3();
//        System.out.println("--------------------Task2.4------------------");
//        exerciseTwo4();
//        System.out.println("--------------------Task2.5------------------");
//        exerciseTwo5();
//        System.out.println("--------------------Task2.6------------------");
//        exerciseTwo6();
//        System.out.println("--------------------Task*1------------------");
//        dopoln1();
//        System.out.println("--------------------Task*2------------------");
//        dopoln2();

    }
    public static void exerciseOne1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца, что бы получить сезон года");
        int monthNumber = 0;
        if (scanner.hasNextInt()){
           monthNumber = scanner.nextInt();
       }
        switch (monthNumber){
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Вы ввели неверное число");
        }
        scanner.close();
    }
    public static void exerciseOne2(){
        Scanner scann = new Scanner(System.in);
        System.out.println("Введите номер месяца, что бы получить сезон года");
        int monthNumber = 0;
        if (scann.hasNextInt()){
            monthNumber = scann.nextInt();
        }
        if (monthNumber == 12 || monthNumber == 1 || monthNumber == 2){
            System.out.println("ЗИМА");
        }else if (monthNumber == 3 || monthNumber == 4 || monthNumber == 5){
            System.out.println("ВЕСНА");
        }else if (monthNumber == 6 || monthNumber == 7 || monthNumber == 8){
            System.out.println("ЛЕТО");
        }else if (monthNumber == 9 || monthNumber == 10 || monthNumber == 11){
            System.out.println("ОСЕНЬ");
        }else{
            System.out.println("Введено неверное число");
        }
        scann.close();

    }
    public static void exerciseOne3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите температура на улице ");
        int temperature = 0;
        if (sc.hasNextInt()){
            temperature = sc.nextInt();
        }
        if (temperature <= -5 && temperature > -20){
            System.out.println("Нормально");
        }else if (temperature > -5){
            System.out.println("Тепло");
        }else if (temperature <= -20){
            System.out.println("Холодно");
        }
        sc.close();
    }
    public static void exerciseOne4(){
        Scanner sc = new Scanner(System.in);
        int numberColor = 0;
        if (sc.hasNextInt()){
            numberColor = sc.nextInt();
        }
        switch (numberColor){
            case(1):
                String red = "\u001B[31m";
                System.out.println(red + "Красный");
                break;
            case(2):
                String orange = "\u001b[31:3m";
                System.out.println(orange + "Оранжевый");
                break;
            case(3):
                String yellow = "\u001b[33;1m";
                System.out.println(yellow + "Желтый");
                break;
            case(4):
                String green = "\u001B[32m";
                System.out.println(green + "Зеленый");
                break;
            case(5):
                String lightBlue = "\u001b[36m";
                System.out.println(lightBlue + "Голубой");
                break;
            case(6):
                String blue = "\u001B[34m";
                System.out.println(blue + "Синий");
                break;
            case(7):
                String violet = "\u001b[35;1m";
                System.out.println(violet + "Фиолетовый");
                break;
            default:
                System.out.println("Вы вышли за границы радуги");
        }
        sc.close();
    }
    public static void exerciseTwo1(){
        System.out.println("Вывод нечетных чисел 1-99");
        for(int i = 0; i < 100; i++){
            if (i % 2 != 0){
                System.out.print(i + " ");
            }
        }

    }
    public static void exerciseTwo2(){
        System.out.println("Вывести на экран числа от 5 до 1");
        for (int i = 5; i > 0; i--){
            System.out.print(i + " ");
        }
    }
    public static void exerciseTwo3(){
        Scanner sc = new Scanner(System.in);
        int scNum = 0;
        int sum = 0;
        System.out.println("Введите положительное число");

        if ( sc.hasNextInt()){
            scNum = sc.nextInt();
        }
        for (int i = 1; i < scNum; i++){
            sum += i;
        }
        System.out.printf("Сумма чисел от 1 до %d = %d", scNum,sum);
        sc.close();
    }
    public static void exerciseTwo4(){
        int i = 1;
        while (i <100){
           if ( i % 7 == 0){
               System.out.print(i + " ");
           }
           i++;
        }

    }
    public static void exerciseTwo5(){
        int num = 0;
        for (int i = 0; i <10; i++){
            System.out.print(num + " ");
            num -= 5;
       }

    }
    public static void exerciseTwo6(){
        for (int i = 10; i <=20; i++){
            System.out.println(String.format("Квадрат числа %d = %d",i, i*i));
        }
    }
    public static void dopoln1(){
        List<Integer> fibonachi = new ArrayList<>();
        fibonachi.add(0);
        fibonachi.add(1);
        for (int i = 1 ; i < 10; i ++){
            fibonachi.add(1+i, fibonachi.get(i-1) + fibonachi.get(i) );
        }
        fibonachi.forEach(System.out::println);

    }
    public static void dopoln2(){
        for(int i = 1; i <= 10; i++){
            for (int j = 1; j <=10; j++){
                System.out.println(String.format("%d x %d = %d", i, j, i*j));
            }
            System.out.println();
        }
    }
}
