package com.whiseps.comparator;

import java.util.Comparator;

public class Checker implements Comparator<Player> {
    @Override
    public int compare(Player player1, Player player2) {
        if (player1.score!=player2.score) {
            return Integer.compare(player2.score, player1.score);
        }
        return player1.name.compareTo(player2.name); // As I understood it, names should be sorted in alphabetically ascending order if scores are the same.
    }
}
