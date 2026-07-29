import java.util.Scanner;
public class palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num =sc.nextInt();

        int number = num;
        int reverse =0;
        while(num !=0)
        {
            int digit = num %10;
            reverse = reverse * 10+ digit;
            num=num/10;
        }
        if (number == reverse)
{
    System.out.print("the number is palindrome");
}        
else{
    System.out.print("Not a palindrome");
}
    }
}