package nyc.c4q;

import java.util.Scanner;


public class Scenarios {



    public static String answerOne() {

        System.out.println("Great! Your mystery tool is Torch and Matches and it is used as a source of light! These two come in handy during dusk and night hours!");
        System.out.println("Now that you have your Torch and Matches, you are ready to get going. You keep walking for hours, but to no avail. In fact, you've entered a more desolate area and the night is starting to fall.");
        System.out.println("Do you want to use your Torch and Matches for better visibility and guidance? Yes/No?");
        Scanner input2 = new Scanner(System.in);
        String answer6;
        answer6 = input2.nextLine();
        if (answer6.toLowerCase().equals("yes")) {
            System.out.println("Now that your path is a bit clearer, you are able to find a safer trail that will lead you out of the scary, desolate area. The fire is so powerful and bright, that all the living creatures in the forest are able to see you walk by. But the torch is foreign to them, and their fear prevents them from attacking you or even get closer to you. There is, however, one intelligent creature whose more familiar with the light and quickly follows you. The friendly monkey has found you! You follow his signals without questioning and he leads you back to your friends!");
            System.out.println("You've managed to survive the forest and find your way back!");

            System.out.println();
            String youWin = "YOU WIN!";
            for(int i = 0; i < youWin.length(); i++) {
                System.out.println(youWin.charAt(i));
            }


        } else {
            System.out.println("You keep walking, entering deeper into the forest as you go. Before you know it, night time has fallen. You decide to reach for your matches, which you placed in your pocket. However, you didn't realize these fell out of your pocket some time ago and you didn't see them because it was too dark to tell if those were matches or sticks. You are frantically scared, and suddenly, you hear a hissing sound rapidly approaching you. It happens to be a group of anacondas! They finally reach you and attack you. You lost!");
        }
        return null;
    }

    public static String answerTwo() {
        System.out.println("Great! Your mystery tool is a Conch Shell and it can be used as a horn! It can help locate you!");
        System.out.println("Now that you have your Conch Shell you are ready to get going. You know that you can use your Conch Shell anytime, especially when in danger! You keep walking for hours, but to no avail. Not to mention dusk is falling and you keep getting deeper into a desolate area.");
        System.out.println("Do you want to use your Conch Shell to signal for help? Yes/No?");

        Scanner input3 = new Scanner(System.in);
        String answer7;
        answer7 = input3.nextLine();
        if (answer7.toLowerCase().equals("yes")) {
            System.out.println("You keep walking, and horn your Conch Shell with every step you make. The friendly monkey, who has been looking for you all this time, is able to hear the sound of the Conch Shell from his location and starts swinging by the trees, headed your way. You hear something approaching you, look up and realize the friendly monkey has been able to find you! You follow his signals without questioning and he leads you back to your friends!");
            System.out.println("You've managed to survive the forest and find your way back!");

            System.out.println();
            String youWin = "YOU WIN!";
            for(int i = 0; i < youWin.length(); i++) {
                System.out.println(youWin.charAt(i));
            }

        } else {
            System.out.println("You've chosen to not use your Conch Shell when you had the chance! You tried to outsmart the forest, but the hungry jaguar was wandering around the same desolate area, found you and chased you down. You tried to run away from him and used your Conch Shell for help, but you were running so fast that you dropped it. You couldn't outrun the jaguar, he caught you and attacked you! You Lost!");
        }
        return null;
    }

}









