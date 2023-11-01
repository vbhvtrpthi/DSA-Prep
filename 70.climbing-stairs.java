/*
 * @lc app=leetcode id=70 lang=java
 *
 * [70] Climbing Stairs
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
    
        int res = countWaysClimbingStairs(n, new int[n + 1]);
        return res;
    }

    public static int countWaysClimbingStairs(int stairs, int[] qb) {
        if (stairs == 0) {
            return 1;
        }
        if (stairs < 0) {
            return 0;
        }
        if (qb[stairs] != 0) {
            return qb[stairs];
        }

        int nm1 = countWaysClimbingStairs(stairs - 1, qb);
        int nm2 = countWaysClimbingStairs(stairs - 2, qb);
        int totalnoofWays = nm1 + nm2;
        qb[stairs] = totalnoofWays;
        return totalnoofWays;
    }
}
// @lc code=end
