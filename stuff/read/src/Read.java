import java.util.Scanner;

public class Read {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        System.out.println("Your name is "+ input.nextLine());
    }
}
