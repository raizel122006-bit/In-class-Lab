public class Practice 
{
    public static void main(String[] args) 
    {
        int [] ages ={16, 18, 17, 28, 19, 21, 24, 30, 17, 15};
        int sumOfAges = 0;
        int largestAge = ages[0];
        int lowestAge = ages[0];
        for(int age: ages)
        {
            sumOfAges+= age;
            if (age > largestAge)
            {
                largestAge = age;
            }
            if (age < lowestAge)
            {
                lowestAge = age;
            }
        }
        double averageOfAges = sumOfAges/ages.length;
        System.out.println("The sum of ages is: " + sumOfAges);
        System.out.println("The average of ages is: " + averageOfAges);
        System.out.println("The largest age is: " + largestAge);
        System.out.println("The lowest age is: " + lowestAge);
    }
}
