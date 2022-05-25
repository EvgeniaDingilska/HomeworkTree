import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ///1. Store your names in 3 different variables and print your whole name.
        String firstName = "Evgenia ";
        String middleName = "Georgieva ";
        String lastName = "Dingilska";

        System.out.println(firstName + middleName + lastName);

        ///With String array
        String [] names = {"Evgenia", " Georgieva", " Dingilska"};

        for (int i = 0; i < names.length; i++)
        {
            System.out.print(names[i]);
        }

        ///2. Print the perimeter of a triangle by the given sides. Use a formula to calculate.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write the first side of the triangel:");
        int sideOne = scanner.nextInt();

        System.out.println("Please write the second side of the triangel:");
        int sideTwo = scanner.nextInt();

        System.out.println("Please write the base of the triangel:");
        int base = scanner.nextInt();

        System.out.println("The perimetar is: "+sideOne+sideTwo+base);

        ///3. Print the area of a triangle by given side. Use formula to calculate.
        System.out.println("Please write the Height of a triangel:");
        float height = scanner.nextFloat();

        System.out.println("Please write the base of a triangel:");
        float baseTwo = scanner.nextFloat();

        System.out.println("The Area is: "+baseTwo*height/2);

        //4. Print pine tree using asteriks in the console.
        System.out.println("Choose the number between 1 to 10 for height of the pine:");
        int heightFour = scanner.nextInt();

        for(int i= 1; i< heightFour; i++)
        {
            for(int j = heightFour; j>i ; j--)
            {
                System.out.print(" ");
            }
            for(int e = 1; e<=i; e++)
            {
                System.out.print(" * ");
            }
            System.out.println("");
        }
        ///5. Using Java input and fine a tune task 2 and 3
        System.out.println("Please write the first side of the triangel:");
        int sideOne1 = scanner.nextInt();

        System.out.println("Please write the second side of the triangel:");
        int sideTwo2 = scanner.nextInt();

        System.out.println("Please write the base of the triangel:");
        int baseTree = scanner.nextInt();

        System.out.println("Please write the height of the triangel:");
        int heightTree= scanner.nextInt();

        System.out.println("The perimetar is: "+sideOne1+sideTwo2+base);
        System.out.println("The Area is: "+baseTree * heightTree/2);
    }
}