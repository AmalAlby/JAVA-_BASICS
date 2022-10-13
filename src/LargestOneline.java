import java.util.*;
public class LargestOneline {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            //Largest number using ternary operator
            System.out.println("THE LARGEST NUMBER IS :"+ (z > (x>y?x:y) ? z:((x>y?x:y))));
        }
}


