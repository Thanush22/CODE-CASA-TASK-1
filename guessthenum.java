package code;

import java.util.Scanner;

public class guessthenum {
    public static void main(String[]args){
        System.out.println("!!!NUMBER GUESSING GAME!!!");
        int  rounds =3;
        int attempts = 3;
        int  min =1;
        int max = 20;
        for (int i=1;i<=rounds;i++) {
            int points = 0;
            System.out.println("Enter a number between 1 to 20:");
            int generatednum = (int) (Math.random() * (max - min + 1) + min);
             Scanner num = new Scanner(System.in);
             System.out.println("Round" + i);

                for (int j = 1; j <= attempts; j++) {
                    System.out.println('\n' + "Attempt" + j);
                    int guess = num.nextInt();

                    if (guess == generatednum) {
                        System.out.println("congratulation YOU WON THE GAME");
                        points = (attempts -j + 1)*10;
                        break;
                    } else if (guess > generatednum) {
                        System.out.println("you are higher than the generated number");
                    } else {
                        System.out.println("you are lower than the generated number");
                    }
                    if(j == attempts){
                        System.out.println("out of attempts ,the generated number is:" + generatednum + '\n');
                    }

                }
            System.out.println("total score :" + points + '\n');
        }
    }
}
