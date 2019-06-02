package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    String winner = "";

    public  Board(Character[][] matrix) {
        for (int i = 0; i < 3; i++) {

            if (matrix[0][i].equals(matrix[1][i]) && matrix[0][i].equals(matrix[2][i])) {
                if (matrix[0][i] != ' ') {
                    winner = matrix[0][i].toString();
                }
            }
            if (matrix[i][0].equals(matrix[i][1]) && matrix[i][0].equals(matrix[i][2])) {
                if (matrix[i][0] != ' ') {
                    winner = matrix[i][0].toString();
                }
            }
            if (matrix[0][0].equals(matrix[1][1]) && matrix[0][0].equals(matrix[2][2])) {
                if (matrix[0][0] != ' ') {
                    winner = matrix[0][0].toString();
                }

            }
            if (matrix[2][0].equals(matrix[1][1]) && matrix[2][0].equals(matrix[0][2])) {
                if (matrix[2][0] != ' ') {
                    winner = matrix[2][0].toString();
                }
            }

        }
    }


    public Boolean isInFavorOfX() {
        boolean answer = false;
        if(winner.equals("X")){
            answer = true;
        }
        return answer;

    }

    public Boolean isInFavorOfO() {
        boolean answer = false;
        if(winner.equals("O")){
            answer = true;
        }
        return answer;

    }

    public Boolean isTie() {
        boolean answer = false;
        if(winner.equals("")){
            answer = true;
        }
        return answer;

    }

    public String getWinner() {
        return winner;
    }

}
