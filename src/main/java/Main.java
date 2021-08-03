import utils.BusinessException;
import utils.ComputerTool;

public class Main {
    /**
     * 主方法入口
     * @param args
     */
    public static void main(String[] args) throws BusinessException {
        Fraction fraction = Fraction.builder().numerator(5).denominator(10).build();
        System.out.println(fraction.getDenominator());
        System.out.println(ComputerTool.getNumByStr("5/4").get(1));
    }
}
