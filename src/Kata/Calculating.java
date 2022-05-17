package Kata;

class Calculating {
    int otv (String [] part)

    {
        String element1 = part [0];
        String element2 = part [1];
        String element3 = part [2];
        int answer=1;
        int number1 = Determinant.Statement(element1);
        int number3 = Determinant.Statement(element3);


        if (element2.equals("+"))
        {
            answer=number1+number3;
        }
        else if (element2.equals("*"))
        {
            answer=number1*number3;
        }
        else if (element2.equals("-"))
        {
            answer=number1-number3;
        }
        else if (element2.equals("/"))
        {
            answer=number1/number3;
        }
        return answer;
    }
}
