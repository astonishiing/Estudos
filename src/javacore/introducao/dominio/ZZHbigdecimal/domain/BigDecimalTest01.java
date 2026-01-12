package javacore.introducao.dominio.ZZHbigdecimal.domain;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimalTest01 {
    public static void main(String[] args) {
        //BigDecimal é usado para trabalhar com precisão
        BigDecimal value1 = new BigDecimal("56.36");
        BigDecimal value2 = new BigDecimal("99.34");
        BigDecimal value3 = new BigDecimal("144");
        System.out.println(value2.divide(value1, 2, RoundingMode.HALF_UP));
        System.out.println(value2.negate());
        System.out.println(value3.sqrt(new MathContext(4)));
        System.out.println(value3.pow(2));

        System.out.println(BigDecimal.ONE);
    }
}
