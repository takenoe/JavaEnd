package sample;
/*
 * TestRoundup.java
 *
 * Copyright(c) 2013-2015 Nihon Unisys, Ltd.
 * All rights reserved.
 */

import java.math.BigDecimal;

public class TestRoundup {
    /**
    */
    public static void main(String[] args) {
        /**
        * ��Ƃ���103.17���l�̌ܓ������l���擾������@�����L�Ɏ����B
        * System.out.println(double_decimal)�Ƃ����103.17���\�������B
        */
        double double_decimal = 103.17;
        System.out.println(double_decimal);
        /**
        * �l�̌ܓ�����103.2��\��������ɂ�setScale()��p����B
        * 1�Ԗڂ̈����͏����_������BigDecimal��Ԃ������w�肷��B
        * 2�Ԗڂ̈�����BigDecimal.ROUND_HALF_UP���w�肷�邱�Ƃɂ��A
        * �l�̌ܓ��������s�����Ƃ��o����B
        * ����āA���L�������System.out.println(calc)�Ƃ����103.2���\�������B
        */
        BigDecimal calc = new BigDecimal(double_decimal);
        calc  = calc.setScale(1, BigDecimal.ROUND_HALF_UP);
        System.out.println(calc);
    }
}
