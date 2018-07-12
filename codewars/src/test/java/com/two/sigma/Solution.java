package com.two.sigma;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        String[][] friends = new String[4][4];
        friends[0][0] = "Y";
        friends[0][1] = "Y";
        friends[0][2] = "N";
        friends[0][3] = "N";
        friends[1][0] = "Y";
        friends[1][1] = "Y";
        friends[1][2] = "Y";
        friends[1][3] = "N";
        friends[2][0] = "N";
        friends[2][1] = "Y";
        friends[2][2] = "Y";
        friends[2][3] = "N";
        friends[3][0] = "N";
        friends[3][1] = "N";
        friends[3][2] = "N";
        friends[3][3] = "Y";
        System.out.println(count(friends));
    }


    private static int count(String[][] friends) {
        int circlesAmount = friends.length;
        for (int i = 0; i < friends.length; i++) {
            for (int j = 0; j < friends.length; j++) {
                if (isInCircles(friends, i, j)) {
                    circlesAmount--;
                }
            }
        }
        return circlesAmount;
    }

    private static boolean isInCircles(String[][] friends, int i, int j) {
        boolean has_friends = false;
        if (i > 0) {
            has_friends = friends[i - 1][j].equals("Y");
        }


        return has_friends;
    }
}
