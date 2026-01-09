package Mattrix;

public class PuzzleMattrix
{
    public int solution(char[][] puzzle) {


        int n = puzzle.length;
        int m = puzzle[0].length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(Character.isDigit(puzzle[i][j])){
                    max = Math.max(max, puzzle[i][j] - '0');

                    max = Math.max(max, evaluate(puzzle , i , j , 0 , 1));

                    max = Math.max(max , evaluate(puzzle , i , j , 1 , 0));
                }
            }
        }
        return max;
    }

    private int evaluate(char[][] puzzle, int i, int j, int i1, int i2) {
        return  i;
    }
}
