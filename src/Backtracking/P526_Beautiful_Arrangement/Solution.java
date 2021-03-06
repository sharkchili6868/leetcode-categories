package Backtracking.P526_Beautiful_Arrangement;

public class Solution {
    public int countArrangement(int N) {

        if (N == 0) return 0;
        dfs(N, 1, new int[N + 1]);
        return count;
    }

    int count = 0;

    private void dfs(int N, int pos, int[] used) {
        if (pos > N) {
            count++;
            return;
        }

        for(int i = 1; i <= N; i++) {
            if (used[i] == 0 && (i % pos == 0 || pos % i == 0)) {
                used[i] = 1;
                dfs(N, pos + 1, used);
                used[i] = 0;
            }
        }
    }
}
