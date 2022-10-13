import java.util.*;
public class Largestordinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if(x>y && x>z){
           System.out.println("THE LARGEST NUMBER IS :"+x);
        }
        else if(y>x && y>z){
            System.out.println("THE LARGEST NUMBER IS:"+y);
        }
        else{
            System.out.println("THE LARGEST NUMBER IS:"+z);
        }
    }
}
