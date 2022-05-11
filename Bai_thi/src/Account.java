import java.util.Scanner;
public class Account {
    private String customerCode, customerName;
    private int accNumber;
    private long amount = 0;



    public void input() {
        Scanner inp = new Scanner(System.in);
        do {
            System.out.println("enter your code: ");
            customerCode = inp.nextLine();
            System.out.println("enter your name: ");
            customerName = inp.nextLine();
            System.out.println("enter your account number: ");
            accNumber = inp.nextInt();
            System.out.println("enter your amount: ");
            amount = inp.nextLong();
        } while (accNumber < 100000 || accNumber > 101000 || customerCode.length() < 5);
    }

    public double depositAndWithdraw() {
        long money;
        int type;
        Scanner inp = new Scanner(System.in);
        System.out.println("What service do you want:");
        System.out.println("0.Deposit \t \t  1.Withdraw");
        type = inp.nextInt();
        System.out.println("Enter money: ");
        money = inp.nextLong();
        if (type == 0) {
            System.out.println("Success");
            amount = money + amount;
            System.out.println("Your amount: " + amount);
        }

        if (type == 1) {
            if (money > amount) {
                System.out.println("Non-sufficient funds");
            } else if (money <= amount) {
                System.out.println("Success");
                amount -= money;
                System.out.println("Amount: " + amount);
            }
        }
        System.out.println("-------------");
        return 0;
    }

    @Override
    public String toString() {
        return "Account[ " + "customerCode ='" + customerCode +
                ", customerName ='" + customerName + ", accNumber=" + accNumber +
                ", amount=" + amount + ']';
    }
}