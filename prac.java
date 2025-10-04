import java.util.Scanner;
import java.util.Arrays;

public class prac 
{
    public static void main(String[] args) {
        int[] nums = {2, 5, 8, 3, 4, 6, 10, 15, 20, 1, 1};
        Scanner scanner = new Scanner(System.in);

        //Task 1
        System.out.print("Enter the number you want to find: ");
        int target = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < nums.length; i++) 
        {
            if (nums[i] == target) 
            {
                System.out.println("Number found at index " + i);
                found = true;
                break;
            }
        }
        if(!found)
        {
            System.out.println("Number not found in array.");
        }

        //Task 2
        System.out.println("\nEnter the values you wish to swap:");
        System.out.print("Enter the 1st value: ");
        int value1 = scanner.nextInt();
        System.out.print("Enter the 2nd value: ");
        int value2 = scanner.nextInt();

        int index1 = -1, index2 = -1;
        for (int i = 0; i < nums.length; i++) 
        {
            if (nums[i] == value1) index1 = i;
            if (nums[i] == value2) index2 = i;
        }

        if (index1 != -1 && index2 != -1) 
        {
            int temp = nums[index1];
            nums[index1] = nums[index2];
            nums[index2] = temp;
            System.out.println("Swapped: " + Arrays.toString(nums));
        } 
        else 
        {
            System.out.println("One or both numbers were not found in array.");
        }

        //Task 3

        int[] ascending = new int[nums.length];


        for (int i = 0; i < nums.length; i++) 
        {
            ascending[i] = nums[i];
        }

        for (int i = 0; i < ascending.length - 1; i++) 
        {
            for (int j = i + 1; j < ascending.length; j++) 
            {
                if (ascending[i] > ascending[j]) 
                {
                    int temp = ascending[i];
                    ascending[i] = ascending[j];
                    ascending[j] = temp;
                }
            }
        }
        
        System.out.println("\nArray in ascending order: " + Arrays.toString(ascending));

        //Foe descending
        int[] descending = new int[nums.length];
        for (int i = 0; i < nums.length; i++) 
        {
            descending[i] = nums[i];
        }

        for (int i = 0; i < (descending.length - 1); i++) 
        {
            for (int j = (i + 1); j < descending.length; j++) 
            {
                if (descending[i] < descending[j]) 
                {
                    int temp = descending[i];
                    descending[i] = descending[j];
                    descending[j] = temp;
                }
            }
        }

        System.out.println("Array in descending order: " + Arrays.toString(descending));

        //Task 4
        System.out.print("\nEnter a number you want to search: ");
        int target2 = scanner.nextInt();
        int linear_index = -1;
        for (int i = 0; i < ascending.length; i++) 
        {
            if (ascending[i] == target2) 
            {
                linear_index = i;
                break;
            }
        }
        if (linear_index != -1)
            System.out.println("Number found at index " + linear_index);
        else
            System.out.println("Number not found.");

        // Task 5
        System.out.print("\nEnter a number to search (Binary Search): ");
        int target3 = scanner.nextInt();
        int left = 0, right = ascending.length - 1;
        int binary_index = -1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (ascending[middle] == target3) {
                binary_index = middle;
                break;
            } else if (ascending[middle] < target3) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        if (binary_index != -1)
            System.out.println("Number found at index " + binary_index);
        else
            System.out.println("Number not found.");
    }
}
