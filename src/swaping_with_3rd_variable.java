import java.util.Scanner;

public class swaping_with_3rd_variable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a = ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b = ");
        int b = sc.nextInt();
        int t=0;
        t=a;
        a=b;
        b=t;
        System.out.println("After swaping the value of 'a' is = " + a + " and 'b' is " + b);
    }
}
