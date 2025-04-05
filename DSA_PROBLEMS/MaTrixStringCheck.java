package DSA_PROBLEMS;

public class MaTrixStringCheck {
    
    public Boolean StringCheck(char[][] StrMat, String Str) {
        for (int i = 0; i < StrMat.length; i++) {
            for (int j = 0; j < StrMat[0].length; j++) {
                // Check if the first character matches
                if (Str.charAt(0) == StrMat[i][j]) {
                    // Call CheckAdjacent to check for other characters
                    if (CheckAdjacent(StrMat, i, j, Str, 1)) {
                        return true;
                    }
                }
            }
        }
        // Return false if no match is found
        return false;
    }

    public boolean CheckAdjacent(char[][] StrMat, int i, int j, String Str, int n) {
        // ✅ Base Case: If all characters are matched
        if (n == Str.length()) {
            return true;
        }

        // 🔼 Up direction
        if (i - 1 >= 0 && StrMat[i - 1][j] == Str.charAt(n)) {
            if (CheckAdjacent(StrMat, i - 1, j, Str, n + 1)) return true;
        }

        // 🔽 Down direction
        if (i + 1 < StrMat.length && StrMat[i + 1][j] == Str.charAt(n)) {
            if (CheckAdjacent(StrMat, i + 1, j, Str, n + 1)) return true;
        }

        // ▶️ Right direction
        if (j + 1 < StrMat[0].length && StrMat[i][j + 1] == Str.charAt(n)) {
            if (CheckAdjacent(StrMat, i, j + 1, Str, n + 1)) return true;
        }

        // ◀️ Left direction
        if (j - 1 >= 0 && StrMat[i][j - 1] == Str.charAt(n)) {
            if (CheckAdjacent(StrMat, i, j - 1, Str, n + 1)) return true;
        }

        // ❌ Return false if no adjacent character matches
        return false;
    }
}
