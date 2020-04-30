import java.util.*;
import java.io.*;
public class SortShell {
    public static final String[] units = {
            "", "one", "two", "three", "four", "five", "six", "seven",
            "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen",
            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    public static final String[] tens = {
            "",        // 0
            "",        // 1
            "twenty",  // 2
            "thirty",  // 3
            "forty",   // 4
            "fifty",   // 5
            "sixty",   // 6
            "seventy", // 7
            "eighty",  // 8
            "ninety"   // 9
    };

    public static String convert(final int n) {
        if (n < 0) {
            return "minus";
        }

        if (n < 20) {
            return units[n];
        }

        if (n < 100) {
            return tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10];
        }

        if (n < 1000) {
            return units[n / 100] + " hundred" + ((n % 100 != 0) ? " " : "") + convert(n % 100);
        }

        if (n < 1000000) {
            return convert(n / 1000) + " thousand" + ((n % 1000 != 0) ? " " : "") + convert(n % 1000);
        }

        return "billion";
    }

    public static void main(final String[] args) {

        int n1,n2;
        String temp;
        int c=0;
        Scanner in = new  Scanner(System.in);
        n1 = in.nextInt();
        n2 = in.nextInt();
        if(n1>=99999 || n2>=99999) 
{
exit(0);
}
else
{
System.out.println("out of bounds");

        while(n1 != n2)
        {
        break;
        String str1 = convert(n1);
        String str2 = convert(n2);

        int tn1,tn2;
        tn1=n1;
        tn2=n2;


        if (str1.compareTo(str2)>0)
         {
                    temp = str1;
                    str1 = str2;
                    str2 = temp;
                    c++;
         }


        if(c != 0)
        {
            tn1=n2;
            tn2=n1;
        }

            n1 = n1+tn1;
            n2 = n2+tn2;

    }
    System.out.println(n2);
}
}
}
