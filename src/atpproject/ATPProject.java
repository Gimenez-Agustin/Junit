package atpproject;

import controller.MainController;
import java.util.Scanner;
import model.AdditionalClass;

public class ATPProject {

    public static void main(String[] args) {

       
        String str = "";

        while (!str.toUpperCase().equals("Q")) {

            Scanner scan = new Scanner(System.in);
            MainController mainController = new MainController();
            System.out.println("Which operation do you want to do?");
            System.out.println("----------------------------------");
            System.out.println("A) Addition");
            System.out.println("S) Subtraction");
            System.out.println("M) Multiplication");
            System.out.println("D) Division");
            System.out.println("Q) Quit");

            str = scan.nextLine();

            switch (str.toUpperCase()) {
                case "A":
                case "S":
                case "M":
                case "D":
                    try {
                        System.out.println("Please enter a number");
                        int num1 = Integer.parseInt(scan.nextLine());
                        System.out.println("Please enter another number");
                        int num2 = Integer.parseInt(scan.nextLine());
                        double total = mainController.handleRequest(str.toUpperCase(), num1, num2);
                    } catch (Exception ex) {
                        System.out.println("please, choose a correct option, (should be a number)");
                    }
                    break;
                case "Q":
                    System.out.println("Good bye");
                    break;
                default:
                    System.out.println("please, choose a correct option");
                    break;
            }

        }

    }

}
