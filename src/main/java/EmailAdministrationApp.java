import model.Email;

import java.util.Scanner;

public class EmailAdministrationApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter family name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter given name: ");
        String secondName = scanner.nextLine();

        Email em1 = new Email(firstName, secondName);
        System.out.println(em1.showInfo());

        scanner.close();
    }
}
