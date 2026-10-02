import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AccountRegister register = new AccountRegister();
        Scanner scanner = new Scanner(System.in);

        int choice = 0;

        while (choice != 5) {

            System.out.println("\n--- MENY ---");
            System.out.println("1. Skapa konto");
            System.out.println("2. Lista konton");
            System.out.println("3. Sätt in pengar");
            System.out.println("4. Ta ut pengar");
            System.out.println("5. Avsluta");
            System.out.println("Välj (1-5): ");

            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {

                System.out.println("Ange namn:");
                String name = scanner.nextLine();

                System.out.println("Ange startsaldo:");
                int balance = scanner.nextInt();
                scanner.nextLine();

                register.createAccount(name, balance);

                System.out.println("Konto skapat!");
            }else if (choice == 2) {

                register.printAll();
            } else if (choice == 3) {

                System.out.println("Ange namn på kontot:");
                String name = scanner.nextLine();

                Account found = register.findAccount(name);

                if (found != null) {

                    System.out.println("Ange belopp att sätta in:");
                    int amount = scanner.nextInt();
                    scanner.nextLine();

                    found.deposit(amount);

                    System.out.println("Nytt saldo för " + found.getName() + found.getBalance());
                } else {

                    System.out.println("Konto saknas: " + name);
                }
            } else if (choice == 4) {

                System.out.println("Uttag kommer snart.");
            } else if (choice == 5) {

                System.out.println("Ogiltigt val, försök igen.");
            }
        }

        scanner.close();
    }
}