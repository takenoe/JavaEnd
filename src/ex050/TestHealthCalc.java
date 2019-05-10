package ex050;

/*
 * TestHealthCalc.java
 *
 * Copyright(c) 2013-2015 Nihon Unisys, Ltd.
 * All rights reserved.
 */

import myutil.HealthCalc;
import myutil.UserInput;

public class TestHealthCalc {
    public static void main(String[] args) {
        int h = UserInput.getNumber("�g������͂��ĉ�����:");

        // �K���̏d�̌v�Z������B
        String height = Integer.toString(h);
        String bestWeight = HealthCalc.calcBestWeight(height);
        System.out.println("�g��" + height + "cm�̓K���̏d�� " + bestWeight + "kg �ł�");

        // �΍����v�Z����B
        int w = UserInput.getNumber("�̏d����͂��ĉ�����:");
        String weight = Integer.toString(w);
        String weightDeflection = HealthCalc.calcWeightDeflection(weight, bestWeight);
        System.out.println("�΍��� " + weightDeflection + "�ł�");
    }
}
