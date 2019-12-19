import java.util.Scanner;

//Simple Calculator Program using switch
public class Calc {
    static int a, b, c;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter First Number");
        a = sc.nextInt();
        System.out.println("Please Enter Second Number");
        b = sc.nextInt();
        System.out.println("Please Enter +,-,*,/");
        String operator = sc.next();
        char op = operator.charAt(0);
        switch (op) {
            case '+':
                c = a + b;
                break;
            case '-':
                c = a + b;
                break;
            case '*':
                c = a + b;
                break;
            case '/':
                c = a + b;
                break;
        }
        System.out.println("Answer is :"+c);
    }

}

