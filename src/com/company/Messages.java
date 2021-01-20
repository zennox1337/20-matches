package com.company;

public class Messages {

    String startGame() {
        return "Игра началась! На столе 20 спичек\n";
    }

    String countMatches(int countMatches) {
        return "На столе осталось " +
                countMatches +
                " спичек\n";
    }

    String oneMatch(String player) {
        return player +
                " проиграл\n" + "На столе осталась последняя спичка";
    }

    String zeroMatches(String player) {
        return player +
                " проиграл\n"
                + "Забрал со стола последнюю спичку";
    }

    String playerMove(String player) {
        return player + "," +
                " ваш ход: \n";
    }

    String botMove(int step) {
        return "Бот забрал " +
                step +
                (step == 1 ? " спичку" : " спички\n");
    }

    String playerWin(String player) {
        return player + " выиграл партию";
    }

}
