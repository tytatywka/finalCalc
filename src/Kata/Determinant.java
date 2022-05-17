package Kata;

class Determinant {
    static String [] Roma = new String [] {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    static String [] Arab = new String [] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    public static String Detection_type (String number)
    {
        String Type=" ";
        int d=Roma.length;
        for (int i=0; i<d; i++)
        {
            if (number.equals(Roma[i]))
            {
                Type="Roma";
            }
            if (number.equals(Arab[i]))
            {
                Type = "Arab";
            }
        }
        return Type;

    }
    public static int Statement (String par)
    {
        int lg = Arab.length;
        int a=0;
        for (int i=0; i<lg; i++)
        {
            if (par.equals(Roma[i]))
            {
                a=i+1;
            }
            if (par.equals(Arab[i]))
            {
                a=1+i;
            }
        }
        return a;
    }
}
