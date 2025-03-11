package com.whiseps.comparator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("The number of players: ");
        int n = scanner.nextInt();
        Player[] players = new Player[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name and the score (Someone 1000): ");
            String name = scanner.next();
            int score;

            while (true) {
                score = scanner.nextInt();
                if (score >= 0 && score <= 1000) {
                    break;
                } else {
                    System.out.println("enter a score between 0 and 1000!!!");
                }
            }

            players[i] = new Player(name, score);
        }

        Arrays.sort(players, new Checker());

        for (Player player : players) {
            System.out.println(player.name + " " + player.score); // I printed to check anyways, although it says I don't have to
        }

        scanner.close();
    }
}
