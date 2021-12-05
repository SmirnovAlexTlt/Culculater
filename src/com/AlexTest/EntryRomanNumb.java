package com.AlexTest;

import static com.AlexTest.Calculator.*;

public class EntryRomanNumb {

    public static String[] romanList = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
            "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI",
            "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI",
            "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI",
            "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV",
            "LV", "LVI", "LVII", "LVIII", "LVIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII",
            "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
            "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI",
            "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};

    public static void main(String[] args) {

        for (int i = 0; i < romanList.length; i++) {
            if (romanList[i].equals(line[0])) {
                firstNumb = i + 1;
            }
        }
        for (int j = 0; j < romanList.length; j++) {
            if (romanList[j].equals(line[2])) {
                secondNumb = j + 1;
            }
        }
        if ((firstNumb<1||firstNumb>10)||(secondNumb<1||secondNumb>10)){
            System.out.println("Неверный формат чисел");
            System.exit(1);
        }
        operator(firstNumb,secondNumb);
            if(result<=0){
                System.out.println("В римском исчесление нет отрицательных чисел.");
                System.exit(1);
            }
        System.out.println(romanList[result - 1]);
            System.exit(1);
    }
}


