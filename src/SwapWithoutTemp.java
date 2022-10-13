import java.util.Scanner;

public class SwapWithoutTemp {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("VALUE OF X IS: "+x+"\n"+"VALUE OF Y IS: "+y);
        System.out.println("SWAPPING THE NUMBERS........");
        //swapping the numbers without using temp
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("NEW VALUE OF X IS: "+x+"\n"+"NEW VALUE OF Y IS: "+y);
    }
}
