import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 10: ");
        double x = input.nextDouble();
        while(1>x||x>10){
            System.out.println(x+ " is not between 1 to 10!");
            x =input.nextDouble();
        }
        System.out.println(x+" is between 1 to 10");
    }
}
