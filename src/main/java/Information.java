import java.util.Scanner;

public class Information {
    public static void main(String[] args) {
        System.out.println("Please enter your name:");
        Scanner s1 = new Scanner(System.in);
        String name = s1.next();

        System.out.println("Please enter your age:");
        Scanner s2 = new Scanner(System.in);
        Integer age = s2.nextInt();

        System.out.println("Please enter your address:");
        Scanner s3 = new Scanner(System.in);
        String address = s3.next();

        System.out.println("Please enter your phone number:");
        Scanner s4 = new Scanner(System.in);
        Integer phoneNumber = s4.nextInt();
    }
}
