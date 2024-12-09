import java.util.*;

public class DessertQueen {
    private static int[][] grid;
    private static int N;
    private static int startRow, startCol, endRow, endCol;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        grid = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                char c = sc.next().charAt(0);
                grid[i][j] = c == 'M' ? -1 : c == 'T' ? 0 : 1;
                if (c == 'S') {
                    startRow = i;
                    startCol = j;
                } else if (c == 'E') {
                    endRow = i;
                    endCol = j;
                }
            }
        }

        int minWater = findMinWater(startRow, startCol, endRow, endCol);
        System.out.println(minWater);
    }

    private static int findMinWater(int row, int col, int endRow, int endCol) {
        if (row == endRow && col == endCol) {
            return 0;
        }
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[N][N];
        queue.offer(new int[] { row, col, 0 });
        visited[row][col] = true;

        int[][] directions = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int r = current[0], c = current[1], water = current[2];

            for (int[] dir : directions) {
                int newR = r + dir[0];
                int newC = c + dir[1];

                if (newR >= 0 && newR < N && newC >= 0 && newC < N && !visited[newR][newC] && grid[newR][newC] != -1) {
                    if (newR == endRow && newC == endCol) {
                        return water + grid[newR][newC];
                    }
                    visited[newR][newC] = true;
                    queue.offer(new int[] { newR, newC, water + grid[newR][newC] });
                }
            }
        }
        return -1;
    }
}
