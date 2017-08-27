package com.epam.homework2;

/**
 * Created by Вера on 26.08.2017.
 */

import java.io.*;

public class Solution {
    public static int operaziaPolzovatela = 0;
    public static int indicatorCorrectVvoda = 0;
    public static double firstChisloDouble;
    public static double secondChisloDouble;
    public static double resultChisel;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        Solution exzemple = new Solution();

        System.out.println("Привет, я калькулятор! Выберите одно из следующий предложенных действий:");
        System.out.println("1 - сложение");
        System.out.println("2 - вычитание");
        System.out.println("3 - умножение");
        System.out.println("4 - деление");
        System.out.println("5 - выход");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (indicatorCorrectVvoda == 0) {
            try {
                operaziaPolzovatela = Integer.parseInt(reader.readLine());
                if ((operaziaPolzovatela==1)||(operaziaPolzovatela==2)||(operaziaPolzovatela==3)||(operaziaPolzovatela==4)||(operaziaPolzovatela==5))
                    indicatorCorrectVvoda =1;
                else
                    System.out.println("Некорретный ввод, повторите попытку");
            } catch (Exception e) {
                System.out.println("Некорретный ввод, повторите попытку");
            }
        }


        switch (operaziaPolzovatela) {
            case 1: {
                exzemple.vvod();
                Plus slozhenie = new Plus(firstChisloDouble, secondChisloDouble);
                resultChisel = slozhenie.plusResult();
                char[] chars = String.valueOf(resultChisel).toCharArray();
                exzemple.printresult(chars);
                break;
            }
            case 2: {
                exzemple.vvod();
                Minus vichitanie = new Minus(firstChisloDouble,secondChisloDouble);
                resultChisel = vichitanie.minusResult();
                char[] chars = String.valueOf(resultChisel).toCharArray();
                exzemple.printresult(chars);
                break;
            }
            case 3: {
                exzemple.vvod();
                Multiply umnozhenie = new Multiply(firstChisloDouble, secondChisloDouble);
                resultChisel = umnozhenie.multiplyResult();
                char[] chars = String.valueOf(resultChisel).toCharArray();
                exzemple.printresult(chars);
                break;
            }
            case 4: {
                exzemple.vvod();
                Devision delenie = new Devision(firstChisloDouble, secondChisloDouble);
                resultChisel = delenie.devisionResult();
                char[] chars = String.valueOf(resultChisel).toCharArray();
                exzemple.printresult(chars);
                break;
            }
            case 5: {
                System.out.println("Вы вышли из программы");
                break;
            }
            default: {
                break;
            }
        }



    }

    //функция печатающая результат работы программы
    public void printresult(char[] chars) throws IOException {

        String[] point = new String[5];
        point[0] = "    ";
        point[1] = "    ";
        point[2] = "    ";
        point[3] = "    ";
        point[4] = " *  ";

        String[] nol = new String[5];
        nol[0] = " *  ";
        nol[1] = "* * ";
        nol[2] = "* * ";
        nol[3] = "* * ";
        nol[4] = " *  ";

        String[] one = new String[5];
        one[0] = " *  ";
        one[1] = "**  ";
        one[2] = " *  ";
        one[3] = " *  ";
        one[4] = "*** ";

        String[] two = new String[5];
        two[0] = "*** ";
        two[1] = "  * ";
        two[2] = " *  ";
        two[3] = "*   ";
        two[4] = "*** ";

        String[] three = new String[5];
        three[0] = "*** ";
        three[1] = "  * ";
        three[2] = "*** ";
        three[3] = "  * ";
        three[4] = "*** ";

        String[] four = new String[5];
        four[0] = "* * ";
        four[1] = "* * ";
        four[2] = "*** ";
        four[3] = "  * ";
        four[4] = "  * ";

        String[] five = new String[5];
        five[0] = "*** ";
        five[1] = "*   ";
        five[2] = "*** ";
        five[3] = "  * ";
        five[4] = "*** ";

        String[] six = new String[5];
        six[0] = "*** ";
        six[1] = "*   ";
        six[2] = "*** ";
        six[3] = "* * ";
        six[4] = "*** ";

        String[] seven = new String[5];
        seven[0] = "*** ";
        seven[1] = "  * ";
        seven[2] = " *  ";
        seven[3] = "*   ";
        seven[4] = "*   ";

        String[] eight = new String[5];
        eight[0] = "*** ";
        eight[1] = "* * ";
        eight[2] = "*** ";
        eight[3] = "* * ";
        eight[4] = "*** ";

        String[] nine = new String[5];
        nine[0] = "*** ";
        nine[1] = "* * ";
        nine[2] = "*** ";
        nine[3] = " *  ";
        nine[4] = "*   ";

        String[] znakminus = new String[5];
        znakminus[0] = "    ";
        znakminus[1] = "    ";
        znakminus[2] = "*** ";
        znakminus[3] = "    ";
        znakminus[4] = "    ";


        String[] result = new String[] {"","","","",""};
        // формирование псевдографического массива
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '1': {
                    for (int j = 0; j < result.length; j++)
                        result[j] = result[j] + one[j];
                    break;
                }
                case '2': {
                    for (int j = 0; j < result.length; j++)
                        result[j] = result[j] + two[j];
                    break;
                }
                case '3': {
                    for (int j = 0; j < result.length; j++)
                        result[j] = result[j] + three[j];
                    break;
                }
                case '4': {
                    for (int j = 0; j < result.length; j++)
                        result[j] = result[j] + four[j];
                    break;
                }
                case '5': {
                    for (int j = 0; j < result.length; j++)
                        result[j] = result[j] + five[j];
                    break;
                }
                case '6': {
                    for (int j = 0; j < result.length; j++)
                        result[j] = result[j] + six[j];
                    break;
                }
                case '7': {
                    for (int j = 0; j < result.length; j++)
                        result[j] = result[j] + seven[j];
                    break;
                }
                case '8': {
                    for (int j = 0; j < result.length; j++)
                        result[j] = result[j] + eight[j];
                    break;
                }
                case '9': {
                    for (int j = 0; j < result.length; j++)
                        result[j] = result[j] + nine[j];
                    break;
                }
                case '0': {
                    for (int j = 0; j < result.length; j++)
                        result[j] = result[j] + nol[j];
                    break;
                }
                case '.': {
                    for (int j = 0; j < result.length; j++)
                        result[j] = result[j] + point[j];
                    break;
                }
                case '-': {
                    for (int j = 0; j < result.length; j++)
                        result[j] = result[j] + znakminus[j];
                    break;
                }
                default: {
                    System.out.print(chars[i]);
                    break;
                }

            }
        }
        // печать результата в псевдографике
        if (!"Infinity".equals(String.valueOf(chars))) {
            for (int i = 0; i < result.length; i++) {
                System.out.println(result[i]);
            }
        }

    }

    //функция ввода двух чисел
    public void vvod() throws IOException{
        //обнуляем инликатор корректного ввода
        indicatorCorrectVvoda = 0;
        //просим ввести первое число
        System.out.println("Введите первое число");

        while (indicatorCorrectVvoda == 0) {
            String s = reader.readLine();
            try {
                firstChisloDouble = Double.parseDouble(s);
                indicatorCorrectVvoda = 1;
            } catch (Exception e) {
                System.out.println("Введено некорректное число, пожалуйста, повторите попытку");
            }
        }

        //обнуляем инликатор корректного ввода
        indicatorCorrectVvoda = 0;
        //просим ввести второе число
        System.out.println("Введите второе число");
        while (indicatorCorrectVvoda == 0) {

            String s = reader.readLine();
            try {
                secondChisloDouble = Double.parseDouble(s);
                indicatorCorrectVvoda = 1;
            } catch (Exception e) {
                System.out.println("Введено некорректное число, пожалуйста, повторите попытку");
            }
        }
    }
}
