import java.util.*;
public class ReverseANumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("THE ORIGINAL NUMBER IS: "+num);
        int result=0;
        //converting integer to string to find the length of the number
        String str=Integer.toString(num);
        int len=str.length();
        //reversing a number
        while(len>0){
            int temp=num%10;
            result=result*10+temp;
            num=num/10;
            len--;
        }
        System.out.println("THE REVERSED NUMBER IS : "+result);
    }
}
