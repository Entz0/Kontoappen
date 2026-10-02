import java.util.ArrayList;
import java.util.List;

public class AccountRegister {

    private List<Account> accounts = new ArrayList<>();

    public void createAccount(String name, int balance) {
        Account account = new Account(name, balance);
        accounts.add(account);
    }

    public Account findAccount(String name) {
        for (Account account : accounts) {
            if (account.getName().equalsIgnoreCase(name)) {
                return account;
            }
        }

        return null;
    }

    public void printAll() {
        for (Account account : accounts) {
            System.out.println("Konto: " + account.getName() + " | Saldo: " + account.getBalance());
        }
    }
}
