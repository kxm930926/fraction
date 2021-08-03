package utils;

import java.util.ArrayList;
import java.util.List;

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

    /**
     * 取出分数表达式的分子与分母
     * @param str 待分解表达式
     * @return
     */
    public static List<Integer> getNumByStr(String str) throws BusinessException{
        if(!str.contains("/")){
            throw new BusinessException("表达式有误！");
        }
        String tempStrs[]= str.split("/");
        int numerator ;
        int denominator;
        try {
            numerator = Integer.valueOf(tempStrs[0]);
            denominator = Integer.valueOf(tempStrs[1]);
        }catch (Exception e ){
            throw new BusinessException("表达式有误！");
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(numerator);
        list.add(denominator);
        return list;
    }
}
