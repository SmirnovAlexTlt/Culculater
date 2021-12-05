package com.AlexTest;

import java.util.Scanner;
import static com.AlexTest.EntryRomanNumb.*;

public class Calculator {
    public static String[] line;
    public static int secondNumb;
    public static int firstNumb;
    public static String symbol;
    public static int result;
    public static void main(String[] args) {

        System.out.println("Здравствуйте." + "\n" + "Этот калькулятор производит простые математические действия с натуральными арабскими и римскими цифрами  от 1 до 10." + "\n" + "Введите уравнение.");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        line = str.split(" ");
        try {
        symbol = line[1];
        for (int i = 0; i<romanList.length;i++){
            if(romanList[i].equals(line[0])){
                EntryRomanNumb.main(line);
                System.exit(1);
            }
        }
            firstNumb = Integer.parseInt(line[0]);
            secondNumb = Integer.parseInt(line[2]);
        }
        catch (Exception e){
        }
        if ((firstNumb<1||firstNumb>10)||(secondNumb<1||secondNumb>10)){
            System.out.println("Неверный формат чисел");
            System.exit(1);
        }
        System.out.println(operator(firstNumb, secondNumb));
        scanner.close();
    }
    public static int operator(int firstNumb, int secondNumb) {
        if(symbol.equals("+")) {
            result = firstNumb + secondNumb;}
        else if(symbol.equals("-")) {
            result = firstNumb - secondNumb;}
        else if(symbol.equals("*")) {
            result = firstNumb * secondNumb;}
        else if(symbol.equals("/")) {
            result = firstNumb / secondNumb;}
        else System.out.println("Неверный формат уравнения");
    return result;
    }
}
















