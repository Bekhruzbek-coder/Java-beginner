package loops;

import java.sql.SQLOutput;

public class LoopsCoding2
{
    public static int n = 0;
    public static void main(String[] args)
    {
        int i = 1;
        while(i <= 5)
        {
            System.out.println(i + ". BEING RIGHT SUCKS.");
            i++;
        }
        System.out.println("Value of i: " + i);
        System.out.println("===========================");
        System.out.println();


        int j = 1;
        do{
            System.out.println(j + ". BEING RIGHT SUCKS.");
            j++;
        }
        while(j <= 0);
        System.out.println("Value of j: " + j);
        System.out.println("===========================");
        System.out.println();

        for (int k = 1; k <= 5; k++){
            if (k == 3){
                break;
            }
            System.out.println(k + ". BEING RIGHT SUCKS.");
        }
        System.out.println();

        for (int k = 1; k <= 5; k++) {
            for (int l = 1; l <= 2; l++){
                System.out.println("k=" + k + " l=" + l + " BEING RIGHT SUCKS.");
                n++;
            }
        }
        System.out.println("Printing times: " + n);
    }
}
