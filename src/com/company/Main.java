package com.company;

import java.util.Scanner;

public class Main {

    private static Messages gameMessages = new Messages();
    private static BotAlgorithm botAlgorithm = new BotAlgorithm();
    private static Scanner consoleReader = new Scanner(System.in);
    private static int matches = 20;
    private static Boolean botPlay = true;
    private static int selector = 0;

    public static void main(String[] args) {
        System.out.println(gameMessages.startGame());
        gameStep();
    }

    public static void updateSelector() {
        if (matches < 2) {
            printPartWinner();
        }

        if (selector == 0)
            selector++;
        else
            selector--;

        System.out.println(gameMessages.countMatches(matches));
        gameStep();
    }

    public static void gameStep() {

        int step = 0;

        if (selector == 0) {
            step = botAlgorithm.botStep(matches);
            System.out.println(gameMessages.botMove(step));
        } else {
            while (step < 1 || step > 3) {
                System.out.print(gameMessages.playerMove("Игрок"));
                step = consoleReader.nextInt();
            }
        }
        matches -= step;
        updateSelector();
    }

    public static void printPartWinner() {
        if (matches == 1) {
            System.out.println("\n[*]\n" + gameMessages.playerWin("Бот"));
            System.out.print(gameMessages.oneMatch("Игрок") + "\n[*] Конец [*]\n\n");
            restartGame();
        } else {
            System.out.println("\n[*]\n" + gameMessages.playerWin("Игрок"));
            System.out.print(gameMessages.zeroMatches("Игрок") + "\n[*] Конец [*]\n\n");
        }
        restartGame();
    }

    public static void restartGame() {
        System.out.println("На столе осталось 20 спичек");
        selector = 0;
        matches = 20;
        gameStep();
    }
}
