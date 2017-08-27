package nyc.c4q;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String question1 = "Bem vindo! This game is called Lost in the Amazon! You and a group of friends go on a hiking trip to the Amazon rain forest in Brazil. Upon deciding to go follow one of the forest's most lovely animals, you break from your group and get lost in the forest. Your task now is to return to your group of friends before or by the night falls.";
        System.out.println(question1);

        System.out.println("Ready to get started? Yes/No");

        String answer = input.nextLine();

        while (!answer.toLowerCase().equals("yes")) {
            System.out.println("Ready to get started? Yes/No");
            answer = input.next();
        }
        String question2 = "Are you ready to play now? Yes/No";
        System.out.println(question2);
        String newAnswer = input.next();

        if (newAnswer.toLowerCase().equals("yes")) {

            System.out.println("You and a group of friends go on a hiking trip to the Amazon rain forest in Brazil. After finding the perfect camping site and settling down, you see a monkey playing around a nearby tree. You tell your friends you'll be back in a second, grab your backpack with your camera in it and follow the monkey.");
            System.out.println("You've been so entertained and amazed by the monkey, that you lost track of time and of path, and realize you are now in the middle of nowhere, alone with the monkey. The monkey senses your fear and signals you to follow his path. Do you follow the monkey? [Yes/No]");

            String answer2 = input.next();

            if (answer2.toLowerCase().equals("yes")) {
                System.out.println("Fortunately, the monkey turns out be incredibly friendly and seems to know what he is doing. He even grabs a hand of bananas from the tree and throws it down to you, further proving his friendliness and trustworthiness! However, you notice there is a huge, monstrous, and hungry jaguar a few meters away. But the monkey does not notice the jaguar and keeps swinging down the trees. Since he is ahead of you, you have no time to alert him. Your only option is for you to either keep walking down the monkey's path or follow a new path on the right. Do you 1. Keep walking or 2. Turn right?");
                int answer3;
                answer3 = input.nextInt();
                if (answer3  == 2) {
                    System.out.println("You've managed to evade the jaguar and saved your life! But now you are in the middle of the forest, alone and helpless. You keep walking straight down the path and encounter a small tribe of the indigenous people of the Amazon. They invite you to join them and offer you water and fruit. You thank them and tell them you must keep going and try to find your way back before night falls. They tell you it is dangerous for you to wander around the forest without a survival tool and offer you to take one of two Mystery Tools.");
                    System.out.println("You need to choose either Mystery Tool 1 or Mystery Tool 2 to continue. Do you choose 1 or 2?");

                    int answer4;
                    answer4 = input.nextInt();

                    switch (answer4) {
                        case 1:
                            Scenarios scenarioOne = new Scenarios();
                            scenarioOne.answerOne();
                            break ;

                        case 2:
                            Scenarios scenarioTwo = new Scenarios();
                            scenarioTwo.answerTwo();
                            break;
                    }
                } else {
                    System.out.println("You've been eaten by the jaguar! Game Over!");
                }
            } else {

                System.out.println("Game over! Unfortunately, you left your compass behind and have no sense of direction. There's no way for you to figure out your way on your own!");
            }

        }

    }

}