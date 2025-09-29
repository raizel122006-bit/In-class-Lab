//Task 0
import java.util.Random;
import java.util.Scanner;
public class HealthKiosk
{
    public static void main(String[] args) 
    {   
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Ashesi Health Kiosk!");
        double bmi_rounded = 0;   
        int tablets = 0;             
        int metric_value = 0; 
        //Task1
        System.out.println("Enter service code (P/L/T/C):");
        char service_code = scanner.nextLine().charAt(0);
        String service_name = "";
        switch(service_code)
        {
            case 'P':
            case 'p':
                System.out.println("Go to: Pharmacy Desk");
                service_name = "PHARMACY";
                break;
            case 'L':
            case 'l':
                System.out.println("Go to: Lab Desk");
                service_name = "LAB";
                break;
            case 'T':
            case 't':
                System.out.println("Go to: Triage Desk");
                service_name = "TRIAGE";
                break;
            case 'C':
            case 'c':
                System.out.println("Go to: Counseling Desk");
                service_name = "COUNSELING";
                break;
            default:
                System.out.println("Invalid service code.");
        }


        System.out.println("Enter health metric:");
        System.out.println("1. BMI\n2. Dosage round-up\n3. Simple trig helper\nEnter choice: ");
        int choice = scanner.nextInt();


        if (choice == 1) 
        {
            //BMI Calculation
            System.out.print("Enter weight (kg): ");
            double weight = scanner.nextDouble();
            System.out.print("Enter height (m): ");
            double height = scanner.nextDouble();
            double bmi = weight / (height * height);
            bmi_rounded = Math.round(bmi * 10) / 10.0;
            String category;

            if (bmi_rounded < 18.5) 
            {
                category = "Underweight";
            } 
            else if (bmi_rounded < 25.0) 
            {
                category = "Normal";
            } 
            else if (bmi_rounded < 30.0) 
            {
                category = "Overweight";
            } 
            else 
            {
                category = "Obese";
            }
            System.out.print("BMI: " + bmi_rounded + " Category: " + category);

        } 
        
        else if (choice == 2) 
        {
            // Dosage 
            System.out.print("Enter required dosage (mg): ");
            double dosage = scanner.nextDouble();
            tablets = (int) Math.ceil(dosage / 250.0);
            System.out.println("Number of tablets: " + tablets);

        } 
        else if (choice == 3) 
        {
            //For Trig helper
            System.out.print("Enter angle in degrees: ");
            double degrees = scanner.nextDouble();
            double radians = Math.toRadians(degrees);

            double sin_value = Math.round(Math.sin(radians) * 1000) / 1000.0;
            double cos_value = Math.round(Math.cos(radians) * 1000) / 1000.0;

            System.out.println("sin" + degrees + " is " + sin_value);
            System.out.println("cos" + degrees + " is " + cos_value);

            metric_value = (int) Math.round(Math.sin(radians) * 100);
        } 

        else
        {
            System.out.println("Invalid choice.");
        }

        //Task 3
        Random rand = new Random();
        char letter = (char) ('A' + rand.nextInt(26));

        StringBuilder nums = new StringBuilder();
        for (int i = 0; i < 4; i++) 
        {
            int number = 3 + rand.nextInt(7); 
            nums.append(number);
        }

        String id = letter + nums.toString();
        System.out.println("Generated ID: " + id);

        if (id.length() != 5) 
        {
            System.out.println("Invalid length");
        } 
        else if (!Character.isLetter(id.charAt(0))) 
        {
            System.out.println("Invalid: first char must be a letter");
        } 
        else if (!(Character.isDigit(id.charAt(1)) &&
                     Character.isDigit(id.charAt(2)) &&
                     Character.isDigit(id.charAt(3)) &&
                     Character.isDigit(id.charAt(4)))) {
            System.out.println("Invalid: Last 4 must be digits");
        } 
        else 
        {
            System.out.println("ID OK");
        }

        //Task 4
        scanner.nextLine();
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        char base_code = Character.toUpperCase(name.charAt(0));
        System.out.println("Base code = " + base_code);
        char shift = (char) ('A' + (base_code - 'A' + 2) % 26);
        System.out.println("Shifted letter of base code = " + shift);
        String lastTwo = id.substring(id.length() - 2);
        System.out.println("Last two characters for ID (task 3): " + lastTwo);

        //Metric value
        if (choice == 1) 
        {
            metric_value = (int) Math.round(bmi_rounded);
        } else if (choice == 2) {
            metric_value = tablets;
        } else if (choice == 3) {
            metric_value = (int) Math.round(Math.sin(radians) * 100);

        }

        String display_code = shift + lastTwo + "-" + metric_value;
        System.out.println("Display Code- " + display_code);
      
        String summary = service_name + " | ID=" + id;
        if (service_name.equals("TRIAGE") && choice == 1) 
        {
            summary += " | BMI=" + bmi_rounded;
        }
        summary += " | Code=" + display_code;
        System.out.println("Summary: " + summary);
    }
}