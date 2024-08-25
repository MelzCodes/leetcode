class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] squares = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            squares[i] = new HashSet<>();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char currentVal = board[i][j];
                if (currentVal != '.') {
                    if (rows[i].contains(currentVal)) return false;
                    rows[i].add(currentVal);

                    if (cols[j].contains(currentVal)) return false;
                    cols[j].add(currentVal);

                    int squareIndex = (i / 3) * 3 + (j / 3);
                    if (squares[squareIndex].contains(currentVal)) return false;
                    squares[squareIndex].add(currentVal);
                }
            }
        }
        return true;
    }
}