package com.xuan.type.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * <p> BigDecimal 类 </p>
 *
 * @author : 轩辰;
 * @since 2023/06/08 00:37
 **/
public class BigDecimalDemo {
    /**
     *  BigDecimal 类 : 解决小数运算中，出现的不精确问题
     *
     *  BigDecimal 创建对象 :
     *      public BigDecimal(double val) : 不推荐，因为它无法保证小数运算的精确
     *      ------------------------------------------------------------
     *      public BigDecimal(String val) :
     *      public static BigDecimal valueOf(double val)
     *  BigDecimal 常用成员方法 :
     *      public BigDecimal add(BigDecimal augend) : 加法
     *      public BigDecimal subtract(BigDecimal subtrahend) : 减法
     *      public BigDecimal multiply(BigDecimal multiplicand) : 乘法
     *      public BigDecimal divide(BigDecimal divisor) : 除法
     *      public BigDecimal divide(另一个BigDecimal对象, 精确几位,舍入模式) : 除法
     *
     *      注意 : 如果使用 BigDecimal 运算，出现了除不尽的情况，就会出现异常
     */
    public static void main(String[] args) {
        double num1 = 0.1;
        double num2 = 0.2;
        System.out.println(num1 + num2);        //0.30000000000000004

        BigDecimal bd1 = new BigDecimal(0.1);
        BigDecimal bd2 = new BigDecimal(0.2);
        System.out.println(bd1.add(bd2));       //0.3000000000000000166533453693773481063544750213623046875

        BigDecimal bd3 = new BigDecimal("0.1");
        BigDecimal bd4 = new BigDecimal("0.2");
        System.out.println(bd3.add(bd4));       // 0.3

        BigDecimal bd5 = BigDecimal.valueOf(0.1);
        BigDecimal bd6 = BigDecimal.valueOf(0.2);
        System.out.println(bd5.add(bd6));       // 0.3

        System.out.println(bd5.add(bd6));
        System.out.println(bd5.subtract(bd6));
        System.out.println(bd5.multiply(bd6));
        System.out.println(bd5.divide(bd6));

        BigDecimal bd7 = BigDecimal.valueOf(10.0);
        BigDecimal bd8 = BigDecimal.valueOf(3.0);
        System.out.println(bd7.divide(bd8, 2, RoundingMode.HALF_UP));   // 3.33
        System.out.println(bd7.divide(bd8, 2, RoundingMode.UP));        // 3.34
        System.out.println(bd7.divide(bd8, 2, RoundingMode.DOWN));      // 3.33

        BigDecimal result = bd7.divide(bd8, 2, RoundingMode.HALF_UP);
        // 将 BigDecimal 转换为 double类型
        double v = result.doubleValue();
        
    }
}
