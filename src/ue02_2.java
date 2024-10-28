import libraries.In;
import libraries.Out;

public class ue02_2 {
    static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Out.println("Enter a Year:");
        int year = In.readInt();
        while (year < 0 || year > 2400) {
            Out.println("Invalid year, please enter a valid year:");
            year = In.readInt();
        }	
        // Choosen years are limited to a sensible range
        Out.println("Enter a month:");
        int month = In.readInt();
        while (month < 1 || month > 12) {
            Out.println("Invalid month, please enter a valid month:");
            month = In.readInt();
        }
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                Out.println("31 days");
                break;
            case 2:
                if (isLeapYear(year)) {
                    Out.println("29 days");
                } else {
                    Out.println("28 days");
                }
                break;
            default:
                Out.println("30 days");
        }
              

    }
}
