package model;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private int defaultPasswordLength = 6;
    private String department;
    private Long mailboxCapacity;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED FOR: " + firstName + " " + lastName);

        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);
    }


    private String setDepartment() {
        System.out.print("Enter the department: \n1 for Sales \n2 for Development \n3 for Accounting \n0 for none \nSelect department code: ");
        Scanner scanner = new Scanner(System.in);
        int depChoice = scanner.nextInt();

        if (depChoice == 1) {
            return "sales";
        } else if (depChoice == 2) {
            return "development";
        } else if (depChoice == 3) {
            return "accounting";
        } else {
            return "";
        }
    }

    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUWXYZ0123456789";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
}
