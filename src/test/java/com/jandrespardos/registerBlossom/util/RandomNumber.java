package com.jandrespardos.registerBlossom.util;

import java.util.Random;

public class RandomNumber {
    public static int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}
