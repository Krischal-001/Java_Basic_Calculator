import java.util.Scanner;
public class _Calculator {
    public static void main(String[] args){
Scanner input =new Scanner(System.in);
        System.out.print("enter first number:");
        double num1=input.nextDouble();
        System.out.print("Enter Second Number:");
        double num2=input.nextDouble();
        System.out.println("Choose an Operator(+,-,*,/:)");
        char operator =input.next().charAt(0);
        double result;
        switch(operator){
            case('+'):
                result =num1+num2;
                System.out.println("Result=" + result);
                break;
            case('-'):
                result=num1-num2;
                System.out.println("Result=" + result);
                break;
            case('*'):
                result=num1*num2;
                System.out.println("Result=" + result);
                break;
            case('/'):
                if(num2!=0){
                    result =num1/num2;
                    System.out.println("Result" + result);
                }
                else{
                    System.out.println("Error:Cannot divide by zero");
                }

                break;
        }
    }
}
// A completed project using java , a basic calculator;