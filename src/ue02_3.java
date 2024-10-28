import libraries.Out;
import libraries.In;

public class ue02_3 {

    public static void main(String[] args) {
        Out.println("please enter x-coordinate");
        double x = In.readDouble();
        Out.println("please enter y-coordinate");
        double y = In.readDouble();
        if (x < 0 || x > 4 || y < 0 || y > 4) {
            Out.println("The point is not in the green area");
        } else if( Math.sqrt(x*x + y*y) <= 4) {
            Out.println("The point is not in the green area");
        } else {
            Out.println("The point is in the green area");

        }
    }


}
