/*
 * @lc app=leetcode id=733 lang=java
 *
 * [733] Flood Fill
 */

// @lc code=start
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        floodFillHelper(image, sr, sc, color, new boolean[image.length][image[0].length], image[sr][sc]);
        return image;
    }

    public static void floodFillHelper(int[][] image, int sr, int sc, int color, boolean[][] visited, int srcVal){
        if(sr < 0 || sc < 0 || sr == image.length || sc == image[0].length || image[sr][sc] != srcVal || visited[sr][sc] == true){
            return;
        }
        
        image[sr][sc] = color;
        visited[sr][sc] = true;
        floodFillHelper(image, sr - 1, sc, color, visited, srcVal);
        floodFillHelper(image, sr, sc - 1, color, visited, srcVal);
        floodFillHelper(image, sr + 1, sc, color, visited, srcVal);
        floodFillHelper(image, sr, sc + 1, color, visited, srcVal);
    }

}
// @lc code=end

