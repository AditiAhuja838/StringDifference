import java.nio.CharBuffer;
import java.util.Arrays;
public class StringDifference{


    public static void main(String[] args) {

        try {
            int t1 = Integer.parseInt(args[0]);
            if ((t1>100)||(t1<0)) throw new  NullPointerException();


            int t2=t1*2;
            int i=1;

            while (i <= t2){
            String S1= args[i].toString();
            String S2= args[++i].toString();

            System.out.println(getMinDiff(S1, S2) + " " + getMaxDiff(S1, S2));
            i++;
        }

        }

        catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Exception: Enter the missing String(s).");
        }
        catch ( NullPointerException e)
        {
            e.printStackTrace();
            System.out.println("Exception: value of test cases (T) should be between 0 and 100.");

        }
        catch ( Exception e)
        {
            e.printStackTrace();
            System.out.println("Exception: Occurred !!!");
        }


    }

 //Find minimum difference in string chars
    public static int getMinDiff(String S1, String S2) {

        int minValue = 0;
        for (int i = 0; i < S1.length(); i++) {
                char ch1 = S1.charAt(i);
                char ch2 = S2.charAt(i);
                if ((ch1 != ch2) && (ch1 != '?' && ch2 != '?'))
                    minValue++;
                if (ch1 == '?' || ch2 == '?') {}
                if (ch1 == '?' || ch2 != '?') {}
                 }
        return minValue;
        }

    //Find maximum difference in string chars
    public static int getMaxDiff(String S1, String S2) {

        int maxValue = 0;
        for (int i = 0; i < S1.length(); i++) {
            char ch1 = S1.charAt(i);
            char ch2 = S2.charAt(i);
            if ((ch1 != ch2)|| ( (ch1 == '?' || ch2 == '?') ))
                maxValue++;


        }
        return maxValue;
    }

    }




