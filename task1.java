import java.util.*;

class task1 {

    public static int[] repeat(Scanner sc, int[] score) {
        Random random = new Random();
        int random_number = random.nextInt(100);
        System.out.println(random_number);
        int guess, k = 0;

        do {
            System.out.println("Enter the Guess:");
            guess = sc.nextInt();
            k++;

            if (guess < random_number) {
                System.out.println("too low number,try again");
            } else if (guess > random_number) {
                System.out.println("too high number,try again");
            }

        } while (guess != random_number && k <= 5);

        if (k > 5) {
            System.out.println("Try Again.");
        } else {
            score[0]++;
            score[1] += k;
        }
        System.out.println("Congratulations! You have guessed the number.");

        System.out.println("Do you want to play round again? Yes:1 and No:0");
        int x = sc.nextInt();

        if (x == 0) {
            System.out.println("Thank You!!");
        } else {
            score = repeat(sc, score);
        }

        return score;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int k = 5;
        int[] score = new int[2];

        System.out.println("You are only given 5 chances.");
        int[] arr = repeat(sc, score);

        System.out.println(arr[0] + "correct guess out of" + arr[1] + "trials");
    }
}