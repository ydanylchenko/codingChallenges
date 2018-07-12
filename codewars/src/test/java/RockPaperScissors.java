import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RockPaperScissors {
    public static String rps(String p1, String p2) {
        if (p1.equals(p2)) {
            return "Draw!";
        } else if (p1.equals("scissors") && p2.equals("paper")) {
            return "Player 1 won!";
        } else if (p1.equals("paper") && p2.equals("rock")) {
            return "Player 1 won!";
        } else if (p1.equals("rock") && p2.equals("scissors")) {
            return "Player 1 won!";
        } else {
            return "Player 2 won!";
        }
    }

    @Test
    public void test1() {
        System.out.println("Fixed Tests Player 1 won!");
        assertEquals("Player 1 won!", rps("rock", "scissors"));
        assertEquals("Player 1 won!", rps("scissors", "paper"));
        assertEquals("Player 1 won!", rps("paper", "rock"));
    }

    @Test
    public void test2() {
        System.out.println("Fixed Tests Player 2 won!");
        assertEquals("Player 2 won!", rps("scissors", "rock"));
        assertEquals("Player 2 won!", rps("paper", "scissors"));
        assertEquals("Player 2 won!", rps("rock", "paper"));
    }

    @Test
    public void test3() {
        System.out.println("Fixed Tests Draw!");
        assertEquals("Draw!", rps("scissors", "scissors"));
        assertEquals("Draw!", rps("paper", "paper"));
        assertEquals("Draw!", rps("rock", "rock"));
    }
}