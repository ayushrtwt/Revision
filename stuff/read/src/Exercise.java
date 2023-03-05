import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your name and age: ");
        System.out.println(input.nextLine()+"! You are " +input.nextInt()+" years old!");
    }
}
