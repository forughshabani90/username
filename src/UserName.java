import java.util.Scanner;

public class UserName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char name = scanner.next();
        switch (name) {
            case "s":
                System.out.println("sara");
                break;
            case "a":
                System.out.println("ali");
                break;
            case "f":
                System.out.println("forough");
                break;
            case "e":
                System.out.println("esmaeil");
                break;

        }


    }
}
