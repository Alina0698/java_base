package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main() {
        int a = 30;
        int b = 15;
        double c = 1.0;

        //0) применить несколько арифметических операций ( + , -, * , /) над двумя примитивами типа int

        int sum = a + b;
        int dif = a - b;
        int mul = a * b;
        int div = a / b;

        System.out.println("Sum = " + sum);
        System.out.println("Dif = " + dif);
        System.out.println("Mul = " + mul);
        System.out.println("Div = " + div);

        //1) применить несколько арифметических операций над int и double в одном выражении

        double sum2 = a + c;
        double dif2 = a - c;
        double mul2 = a * c;
        double div2 = a / c;

        System.out.println("Sum a and c = " + sum2);
        System.out.println("Dif a and  = " + dif2);
        System.out.println("Mul a and  = " + mul2);
        System.out.println("Div a and  = " + div2);

        //2) применить несколько логических операций ( < , >, >=, <= )

        System.out.println("Compare values: " + (sum2 < dif2));
        System.out.println("Compare values: " + (sum2 > mul2));
        System.out.println("Compare values: " + (div2 <= dif2));
        System.out.println("Compare values: " + (mul2 >= dif2));

        //3) прочитать про диапазоны типов данных для вещественных / чисел с плавающей точкой
        // (какие максимальные и минимальные значения есть, как их получить) и переполнение

        System.out.println("int max = " + Integer.MAX_VALUE);
        System.out.println("int min = " + Integer.MIN_VALUE);

        //4) получить переполнение при арифметической операции

        double maxDouble = Double.MAX_VALUE;
        System.out.println(maxDouble * 2);
        }
    }
