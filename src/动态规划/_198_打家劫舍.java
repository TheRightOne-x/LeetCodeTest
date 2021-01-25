package 动态规划;

/**
 * @Auther:wzh
 * @Date:25/01/2021-01-25-22:26
 * @Description:
 * @Version: 1.0
 * psvm -- main快捷建
 * sout -- 输出
 * xx.sout --输出xx
 * xx.for(i) -- for()
 * clt+alt+t if() while() ...
 * ifn 或者 .null
 * prsf: private static final
 * psf : public static final
 * 设置方式: Setting-Editor-File and Code Templates
 **/
public class _198_打家劫舍 {
    public int rob(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        int size = nums.length;

        int[] dp = new int[size + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        for(int i = 2;i<size;i++)
            dp[i] = Math.max(dp[i-1],nums[i-1]+dp[i-2]);
        return dp[size];
    }
    public static void main(String[] args) {
        int[][] x = new int[10][10];
        System.out.println(x.length);
        for (int i = 0; i < x.length; i++) {
            x[0][i] = 1;
        }
        for (int i = 0; i < x.length; i++) {
            x[i][0] = 1;
        }
        for (int i = 0; i < x.length; i++) {
            for (int i1 = 0; i1 < x.length; i1++) {
                x[i][i1] = x[i-1][i1] + x[i][i1-1];
            }
        }
    }
}
