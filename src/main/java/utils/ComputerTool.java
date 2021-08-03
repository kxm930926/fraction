package utils;

public class ComputerTool {

    /**
     * 获取两个int类型数字的最大公约数
     *
     * @param a 数字a
     * @param b 数字b
     * @return 最大公约数
     */
    public static int getCommonDivisor(int a, int b) {
        //获取a、b绝对值 保证为正整数的最大公约数
        a = a > 0 ? a : -a;
        b = b > 0 ? b : -b;
        int min = a < b ? a : b;
        for (int i = min; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
