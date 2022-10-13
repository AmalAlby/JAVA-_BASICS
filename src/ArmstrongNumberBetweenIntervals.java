import java.util.*;
public class ArmstrongNumberBetweenIntervals {

    //to get the length of the number
    public int count(int n){
        String str=Integer.toString(n);
        int size=str.length();
        return size;
    }


    //to print the armstrong number
    public void armstrong(int num,int len){
        int temp;
        int arm=0;
        int number=num;
        int l=len;
        while(l>0){
            temp=num%10;
            arm= (int) (arm+(Math.pow(temp,len)));
            num=num/10;
            l--;
        }
       if(number==arm){
           System.out.println(number);
       }
    }

    //main function
    public static void main(String[] args) {

        ArmstrongNumberBetweenIntervals obj=new ArmstrongNumberBetweenIntervals();
        Scanner sc = new Scanner(System.in);
        int l1 = sc.nextInt();
        int l2 = sc.nextInt();
        System.out.println("THE ARMSTRONG NUMBERS ARE: ");
        for (int i = l1; i <= l2; i++) {
            int length =obj.count(i);
            obj.armstrong(i,length);
        }
    }
}