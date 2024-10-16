import java.util.*;
public class Reverese {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int res=0;
        while(a!=0)
        {
            int rem=a%10;
            res=res+rem;
            a=a/10;
        }
        System.out.println(res);
    }
}
