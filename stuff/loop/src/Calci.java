import java.util.Scanner;

public class Calci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1 operator num2: ");
        double num1 = input.nextDouble();
        char op = input.next().charAt(0);
        double num2 = input.nextDouble();
        if (op=='+')
            System.out.println(num1+num2);
        else if (op=='-')
            System.out.println(num1-num2);
        else if (op=='*')
            System.out.println(num1*num2);
        else
            System.out.println(num1/num2);
    }
}
