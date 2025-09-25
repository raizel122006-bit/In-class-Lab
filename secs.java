import java.util.Scanner;
public class secs
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        //Factorial 
        System.out.print("Enter number for factorial: ");
        int num1 = scanner.nextInt();
        long factor = 1;
        for (int i = 1; i <= num1; i++) 
        {
            factor *= i;
        }
        System.out.println("Factorial- " + factor);
        
       //Reversing number
        System.out.print("Enter number: ");
        int num2 = scanner.nextInt();
        int reverse = 0;
        int temp = num2;
        while (temp != 0) 
        {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }
        System.out.println("Reversed- " + reverse);

        //Fabonnaci Series
        System.out.println("Enter the nth term of series:");
        int num3 = scanner.nextInt();
        int n1 = 0;
        int n2 = 1;
        System.out.print("Fibonacci sequence- ");
        for (int i = 0; i < num3; i++) 
        {
            System.out.print(n1 + " ");
            int next = n1 + n2;
            n1 = n2;
            n2 = next;
        }

        //Prime Number
        System.out.println("\nEnter number:");
        int num4 = scanner.nextInt();
        boolean prime = true;
        if (num4 <= 1) 
        {
            prime = false;
        } 
        else 
        {
            for (int i = 2; i <= Math.sqrt(num4); i++) 
            {
                if (num4 % i == 0) 
                {
                    prime = false;
                    break;
                }
            }
        }

        //Counting vowels
        String str = scanner.nextLine();
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < str.length(); i++) 
        {
            if (vowels.indexOf(str.charAt(i)) != -1) 
            {
                count++;
            }
        }
        System.out.println("# of vowels- " + count);

        }
}
