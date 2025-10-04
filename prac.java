import java.util.Scanner;
import java.util.Arrays;
public class prac 
{
    public static void main(String[] args) 
    {
        int[] nums = {2, 5, 8, 3, 4, 6, 10, 15, 20, 1, 11};
        Scanner scanner = new Scanner(System.in);
        
        //Task 1
        System.out.print("Enter the number you want to find: ");
        int target = scanner.nextInt();
        int index;
        boolean isFound = false;
        for(int i = 0; i < nums.length; i++)
        {
            if (nums[i] == target)
            {
               index = i;
               System.out.println("Number found at index "+ index);
               isFound = true;
            }
        }     
        if(!isFound)
        {
            System.out.println("Number not found in array.");
        }
        
        //Task 2
        System.out.println("Enter the values that you wish to swap");
        System.out.print("Enter the 1st value:");
        int value1 = scanner.nextInt();
        System.out.print("Enter the 2nd value:");
        int value2 = scanner.nextInt();
        int index1 = 0;
        int index2 = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == value1)
            {
                index1 = i;
            }
            if (nums[i] == value2)
            {
                index2 = i;
                isFound = true;
            } 
            temp = nums[index1];
            nums[index1]=nums[index2];
            nums[index2]= temp;
        }
            if (!isFound)
            {
                System.out.println("Number not found in array.");
            }
            else
            {
                System.out.println(Arrays.toString(nums));  
            }
        
        //Task3
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    

        //Task4
        
           
    }

}



