import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a four digit number: ");
        int x = input.nextInt();
        int d = x%10;
        int c = (x/10)%10;
        int b = (x/100)%10;
        int a = (x/1000)%10;

        if(a+b==c+d)
            System.out.println("It's a lucky number");
        else
            System.out.println("Not a lucky number");
    }
}
