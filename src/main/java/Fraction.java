import lombok.Builder;
import lombok.Setter;
import lombok.ToString;
import utils.ComputerTool;

@Setter
@Builder
@ToString
/**
 * 分数类
 */
public class Fraction {

    /**
     * 分子
     */
    private int numerator;

    /**
     * 分母
     */
    private int denominator;

    /**
     * 获取约分后的分子
     * @return
     */
    public int getNumerator(){
        return this.numerator/ComputerTool.getCommonDivisor(this.numerator,this.denominator);
    }

    /**
     * 获取约分后的分母
     * @return
     */
    public int getDenominator(){
        return this.denominator/ComputerTool.getCommonDivisor(this.numerator,this.denominator);
    }
}
