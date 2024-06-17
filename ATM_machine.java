import java.util.*;

class ATM_machine {

    private Scanner sc = new Scanner(System.in);
    private float amount;
    private int PIN;

    ATM_machine() {
        System.out.print("Set your PIN:");
        this.PIN = sc.nextInt();
        this.amount = 0;
        // mainmenu();
    }

    ATM_machine(int PIN) {
        this.PIN = PIN;
        this.amount = 0;
        // mainmenu();
    }

    ATM_machine(int PIN, float amount) {
        this.PIN = PIN;
        this.amount = amount;
        // mainmenu();
    }

    /*
     * private void mainmenu() {
     * while (true) {
     * System.out.println("1: Withdraw Amount");
     * System.out.println("2: Deposit Amount");
     * System.out.println("3: checkbalance");
     * System.out.println("4: Exit");
     * int x = sc.nextInt();
     * 
     * if (x == 1)
     * withdraw();
     * else if (x == 2)
     * deposit();
     * else if (x == 3)
     * checkbalance();
     * else if (x == 4)
     * break;
     * else {
     * System.out.println("Invalid number.");
     * }
     * }
     * }
     */

    private void withdraw() {
        System.out.println("Enter Your PIN");
        int input_PIN = sc.nextInt();

        if (input_PIN == this.PIN) {
            System.out.println("Enter Amount You want to withdraw:");
            float input_amt = sc.nextFloat();

            if (input_amt > this.amount) {
                System.out.println("Insufficient Amount in Bank.");
            } else if (this.amount < 1000) {
                System.out.println("Bank Balance is less than threshold balance for withdrawal.");
            } else {
                System.out.println("Withdrawal Amount =" + input_amt);
                this.amount = this.amount - input_amt;
                System.out.println("Your transaction is successfully completed");
            }
        } else {
            System.out.println("Your PIN is not correct. Try Again!!!!");
        }

    }

    private float checkbalance() {
        System.out.println("Enter Your PIN");
        int input_PIN = sc.nextInt();

        if (input_PIN == this.PIN) {
            return this.amount;
        }
        return -1;
    }

    private void deposit() {
        System.out.println("Enter Your PIN");
        int input_PIN = sc.nextInt();

        if (input_PIN == this.PIN) {
            System.out.println("Enter amount to be Deposited.");
            float input_amt = sc.nextFloat();
            this.amount = this.amount + input_amt;
            System.out.println("Your Transaction is completed.");
        } else {
            System.out.println("Invalid PIN");
        }
    }

    public static void main(String args[]) {
        ATM_machine jash = new ATM_machine(1234, 5000);
        ATM_machine jeel = new ATM_machine(9999, 10000);
        jash.withdraw();
        jeel.deposit();
        float x = jash.checkbalance();
        System.out.println("Your Bank Balance is:" + x);

    }

}