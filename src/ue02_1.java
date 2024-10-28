import libraries.Out;
import libraries.In;

public class ue02_1 {
    public static void main(String[] args) {
        Out.println("please enter 3 numbers");
        int num1 = In.readInt();
        int num2 = In.readInt();
        int num3 = In.readInt();
        if (num1 > num2 && num1 > num3) {
            Out.println("The biggest number is: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            Out.println("The biggest number is: " + num2);
        } else if (num3 > num1 && num3 > num2) {
            Out.println("The biggest number is: " + num3);
        } else if (num1 == num2 && num1 == num3) {
            Out.println("All numbers are equal");
        } else if (num1 == num2 && num1 > num3) {
            Out.println("The biggest number is: " + num1);
        } else if (num1 == num3 && num1 > num2) {
            Out.println("The biggest number is: " + num1);
        } else if (num2 == num3 && num2 > num1) {
            Out.println("The biggest number is: " + num2);
        }


    }
}
