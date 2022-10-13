import java.util.*;
public class ASCIIofaCharacter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        int ans=(int)ch;
        System.out.println("THE ASCII VALUE OF "+ch+" IS "+ans);
    }
}
