package Kata;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyException {
        Scanner scanner = new Scanner(System.in);
        String calc = scanner.nextLine();
    System.out.println(Main.calc(calc));
    }
    public static String calc(String input) throws MyException
    {
        String[] input1 = input.split(" ");
        if (input1.length!=3)
        {
            System.out.println("Неверная длина операции.Введите выражение из двух чисел и одной операции");
            throw new MyException("throws Exception");
        }
             if (!input1[1].equals("-") && !input1[1].equals("+") && !input1[1].equals("*") && !input1[1].equals("/"))
            {
                System.out.println("Неверная операция. Выберите операцию из: сложения, умножения, вычитания или деления");
                throw new MyException("throws Exception");
            }
                if (!Determinant.Detection_type(input1[0]).equals(Determinant.Detection_type(input1[2])))
                {
                    System.out.println ("Введён неверный формат. Введите либо арабские, либо римские числа");
                    throw new MyException("throws Exception");
                }

        Calculating Ans = new Calculating();
        if (Determinant.Detection_type(input1[0]).equals("Arab") && Determinant.Detection_type(input1[2]).equals("Arab"))
        {
            return String.valueOf(Ans.otv(input1));
        }
        if (Determinant.Detection_type(input1[0]).equals("Roma") && Determinant.Detection_type(input1[2]).equals("Roma") && Ans.otv(input1)<=0 )
        {
            System.out.println("В римской системе нет отрицательных чисел");
            throw new MyException("throws Exception");
        }
        else if (Determinant.Detection_type(input1[0]).equals("Roma") && Determinant.Detection_type(input1[2]).equals("Roma"))
        {
            return RomanNumeral.arabicToRoman(Ans.otv(input1));
        }
        return String.valueOf(Ans.otv(input1));
    }
}
