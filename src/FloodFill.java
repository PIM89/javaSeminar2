public class FloodFill {
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int colorOld = image[sr][sc];
        if (color == colorOld) {
            return image;
        }
        dfs(image, sr, sc, color, colorOld);
        return image;
    }

    private static void dfs(int[][] image, int sr, int sc, int color, int colorOld) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length) {
            return;
        }
        if (colorOld != image[sr][sc]) {
            return;
        } else {
            image[sr][sc] = color;
        }
        dfs(image, sr + 1, sc, color, colorOld);
        dfs(image, sr - 1, sc, color, colorOld);
        dfs(image, sr, sc + 1, color, colorOld);
        dfs(image, sr, sc - 1, color, colorOld);
    }
}
