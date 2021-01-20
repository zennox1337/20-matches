package com.company;

public class BotAlgorithm {

    private int[] loseCount = {1, 5, 9, 13, 17};

    int botStep(int countMatches) {

        int result = 0;

        for (int num : loseCount) {
            result = countMatches - num;
            if (result <= 3 && result > 0)
                break;
            if (result <= 0) {
                result = 1;
                break;
            }
        }
        return result;
    }
}
