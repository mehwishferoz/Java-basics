import java.util.Scanner;

public class Miniproject {
    public static int guessNum(int num, int rand) {
        if (num == rand) {
            System.out.println("YOU GUESSED THE RIGHT NUMBER!!!");
            System.out.println("The number was " + rand);
            return 0;
        } else if (num < rand) {
            System.out.println("Your number is too small");
            return 1;
        } else {
            System.out.println("Your number is too large");
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rand = ((int) (Math.random() * 1000));
        System.out.println("Guess the random number");

        while (true) {
            System.out.print("Enter your guess: ");
            int num = sc.nextInt();
            int n = guessNum(num, rand);
            if(n == 0){
            System.exit(0);
            sc.close();
            }
        }
    }
}
