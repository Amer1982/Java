package Vjezba.TicTacToe;

import java.util.*;

public class TicTacToe {
    static ArrayList<Integer> playerPositions = new ArrayList<>();
    static ArrayList<Integer> cpuPositions = new ArrayList<>();


    public static void main(String[] args) {

        char[][] gameBoard = {
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};

        GameBoard(gameBoard);

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your move: (1-9)");
            int playerPos = scanner.nextInt();

            while (playerPositions.contains(playerPos) || cpuPositions.contains(playerPositions)) {
                System.out.println("Not a valid move, try again");
                playerPos = scanner.nextInt();
            }
            playersMove(gameBoard, playerPos, "player");

            /*String result = winner();
            if (result.length() > 0) {
                System.out.println(result);
                break;
            }*/

            Random random = new Random();
            int cpuPosition = random.nextInt(9) + 1;

            while (playerPositions.contains(cpuPosition) || cpuPositions.contains(cpuPosition)) {
                System.out.println("Not a valid move, try again");
                cpuPosition = random.nextInt(9) + 1;
            }
            playersMove(gameBoard, cpuPosition, "cpu");

            GameBoard(gameBoard);

            /*result = winner();
            if (result.length() > 0) {
                System.out.println(result);
                break;
            }*/
        }
    }

    public static void GameBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    private static void playersMove(char[][] gameBoard, int position, String user) {

        char symbol = ' ';
        if (user.equals("player")) {
            symbol = 'X';
            playerPositions.add(position);
        } else if (user.equals("cpu")) {
            symbol = 'O';
            cpuPositions.add(position);
        }

        switch (position) {
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
            default:
                break;
        }
    }

    public static String winner() {

        List<Integer> topRow = Arrays.asList(1, 2, 3);
        List<Integer> midRow = Arrays.asList(4, 5, 6);
        List<Integer> bottomRow = Arrays.asList(7, 8, 9);

        List<Integer> firstCol = Arrays.asList(1, 4, 7);
        List<Integer> secCol = Arrays.asList(2, 5, 8);
        List<Integer> ThirdCol = Arrays.asList(3, 6, 9);

        List<Integer> cross1 = Arrays.asList(1, 5, 9);
        List<Integer> cross2 = Arrays.asList(3, 5, 7);

        List<List> winningCondition = new ArrayList<>();
        winningCondition.add(topRow);
        winningCondition.add(midRow);
        winningCondition.add(bottomRow);
        winningCondition.add(firstCol);
        winningCondition.add(secCol);
        winningCondition.add(ThirdCol);
        winningCondition.add(cross1);
        winningCondition.add(cross2);

        for (List list : winningCondition) {
            if (playerPositions.containsAll(list)) {
                return "Congratulations, you won";
            } else if (cpuPositions.containsAll(list)) {
                return "Sorry, you lost";
            } else if (playerPositions.size() + cpuPositions.size() == 9) {
                return "It's a draw";
            }
        }
        return "win";
    }
}

