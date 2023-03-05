import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int x = input.nextInt();
        if (x%2==0)
            System.out.println("It's even");
        if (x%2!=0)
            System.out.println("It's odd");
    }
}
