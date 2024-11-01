package com.mdk0101.createmethods;
import java.util.Random;
import java.util.Scanner;


public class Main {
//    public static void main(String[] args) {
//        Scanner inputFromLine = new Scanner(System.in);
//        int size;
//        int number;
//
//
//        System.out.println("Задайте размер массива: ");
//        size = inputFromLine.nextInt();
//
//        int[] array = new int[size];
//
//        Random random = new Random();
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(30);
//        }
//
//
//        System.out.println("Введите число: ");
//        number = inputFromLine.nextInt();
//
//        for (int elem : array) {
//            if(elem == number) {
//                System.out.println("число " + elem + " есть в массиве" );
//            }
//
//
//        }
//
//        int maxNumber = array[0];
//        for (int elem : array) {
//            if (elem > maxNumber) {
//                maxNumber = elem;
//                System.out.println(maxNumber);
//            }
//
//        }
//
//    }


                        //Калькулятор




        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите первое число: ");
            double num1 = scanner.nextDouble();

            System.out.println("Введите второе число: ");
            double num2 = scanner.nextDouble();

            System.out.println("Выберите операцию: 1 - сложение, 2 - вычитание, 3 - умножение, 4 - деление");
            int operation = scanner.nextInt();

            double result;

            switch (operation) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Результат сложения: " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("Результат вычитания: " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("Результат умножения: " + result);
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Ошибка: делить на ноль нельзя!");
                    } else {
                        result = num1 / num2;
                        System.out.println("Результат деления: " + result);
                    }
                    break;
                default:
                    System.out.println("Неверная операция!");
                    break;
            }


        }


    }

