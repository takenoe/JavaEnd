package ex020;

import myutil.UserInput;

/*
 * TestInput.java
 *
 * Copyright(c) 2013 Nihon Unisys, Ltd.
 * All rights reserved.
 */
public class TestInput {
    /**
    *
    */
    public static void main(String[] args) {
        String str = null;
        int number = 0;

        // Util.getString()���e�X�g���܂��B
        System.out.println("�e�X�gID2�F�C�ӂ̕�����̓��̓e�X�g1");
        System.out.print("�@�C�ӂ̕��������͂��ĉ�����:" );
        str = UserInput.getString();
        System.out.println(" getString()�̕ԋp�l�́A " + str + " �ł�");
        System.out.println();

        // Util.getString(String title)���e�X�g���܂��B
        System.out.println("�e�X�gID3�F�C�ӂ̕�����̓��̓e�X�g2");
        str = UserInput.getString("**�C�ӂ̕��������͂��ĉ�����->");
        System.out.println(" getString(String str)�̕ԋp�l�́A " + str + " �ł�");
        System.out.println();

        // Util.getNumber()���e�X�g���܂��B
        System.out.println("�e�X�gID4�F���l�̕�����̓��̓e�X�g3");
        System.out.print("�@���l�i>0)�̕��������͂��ĉ�����:" );
        number = UserInput.getNumber();
        System.out.println(" getNumber()�̕ԋp�l�́A " + number + " �ł�");
        System.out.println();

        // Util.getNumber()���e�X�g���܂��B
        System.out.println("�e�X�gID5�F���l�̕�����̓��̓e�X�g");
        System.out.print("�@���l�i<0)�̕��������͂��ĉ�����:" );
        number = UserInput.getNumber();
        System.out.println(" getNumber()�̕ԋp�l�́A " + number + " �ł��B�i���Ғl�F-1)");
        System.out.println();

        // Util.getNumber()���e�X�g���܂��B
        System.out.println("�e�X�gID6�F���l�̕�����̓��̓e�X�g");
        System.out.print("�@���l�ȊO�̕��������͂��ĉ�����:" );
        number = UserInput.getNumber();
        System.out.println(" getNumber()�̕ԋp�l�́A " + number + " �ł��B�i���Ғl�F-1)");
        System.out.println();

        // Util.getNumber(String title)���e�X�g���܂��B
        System.out.println("�e�X�gID7�F���l�̕�����̓��̓e�X�g3");
        number = UserInput.getNumber("**���l�i>0)�̕��������͂��ĉ�����->" );
        System.out.println(" getNumber()�̕ԋp�l�́A " + number + " �ł�");
        System.out.println();

        // Util.getNumber(String title)���e�X�g���܂��B
        System.out.println("�e�X�gID8�F���l�̕�����̓��̓e�X�g");
        number = UserInput.getNumber("**���l�i<0)�̕��������͂��ĉ�����->" );
        System.out.println(" getNumber()�̕ԋp�l�́A " + number + " �ł��B�i���Ғl�F-1)");
        System.out.println();

        // Util.getNumber(String title)���e�X�g���܂��B
        System.out.println("�e�X�gID9�F���l�̕�����̓��̓e�X�g");
        number = UserInput.getNumber("**���l�ȊO�̕��������͂��ĉ�����->" );
        System.out.println(" getNumber()�̕ԋp�l�́A " + number + " �ł��B�i���Ғl�F-1)");
        System.out.println();
      }
}