import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        string weekday = scanner.next();
        switch (weekday) {
            case "saturday":
                System.out.println("شنبه");
                break;
            case "sunday":
                System.out.println("یکشنبه");
                break;
            case "monday":
                System.out.println("دوشنبه");
                break;
            case "tusday":
                System.out.println("سه شنبه");
                break;
            case "wednesday":
                break;
            case "thrsday":
                System.out.println("پنجشنبه");
                break;
            case "friday":
                System.out.println("جمعه");
                break;
        }

    }
}
