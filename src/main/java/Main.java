import org.codehaus.groovy.util.StringUtil;
import utils.BusinessException;
import utils.ComputerTool;

import java.util.List;
import java.util.Scanner;

public class Main {
    /**
     * 主方法入口
     *
     * @param args
     */
    public static void main(String[] args) throws BusinessException {
        String input = "";
        System.out.print("退出请输入 \'exit\' \n请输入分数表达式：分子/分母\n");
        while (true) {
            try {
                Scanner reader = new Scanner(System.in);
                input = reader.nextLine();
            } catch (Exception e) {
                System.out.println("读取表达式异常，请重新输入");
            }
            //去除空格
            String str = input.trim().replaceAll(" ", "");
            if (input.equals("exit")) {
                System.out.println("输入结束，谢谢您的使用！");
                System.exit(0);
            }
            List<Integer> numList = ComputerTool.getNumByStr(str);
            Fraction fraction = Fraction.builder().numerator(numList.get(0)).denominator(numList.get(1)).build();
            int numerator = fraction.getNumerator();
            int denominator = fraction.getDenominator();
            if (numerator == denominator || numerator == -denominator) {
                System.out.println("结果为：" + (fraction.isPositive() ? "" : "-") + 1);
            } else {
                System.out.println("结果为：" + (fraction.isPositive() ? "" : "-") + numerator + "/" + denominator);
            }
            System.out.println("请输入分数表达式：分子/分母");
        }
    }
}
