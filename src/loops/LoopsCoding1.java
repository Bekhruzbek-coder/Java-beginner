package loops;

public class LoopsCoding1
{
    public static void main(String[] ars){

        int i = 1;
        while (i <= 5){
            System.out.println(i + ". BEING RIGHT SUCKS.");
            i++;
        }
        System.out.println("Value of i: " + i);
        System.out.println();

        int j = 1;
        do{
            System.out.println(j + ". BEING RIGHT SUCKS.");
            j++;

        }while(j<=5);
        System.out.println("Value of j: " + j);
        System.out.println();
    }
}
