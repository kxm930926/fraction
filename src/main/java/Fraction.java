import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class Fraction {

    /**
     * 分子
     */
    private int numerator;

    /**
     * 分母
     */
    private int denominator;
}
