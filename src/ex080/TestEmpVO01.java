package ex080;
/*
 * TestEmpVO01.java
 *
 * Copyright(c) 2013-2015 Nihon Unisys, Ltd.
 * All rights reserved.
 */
import vo.EmpVO;

public class TestEmpVO01 {
    public static EmpVO getNobunaga() {
        EmpVO vo = new EmpVO();

        // �M���̃f�[�^
        String syainNumber    = "641340";
        String shincho        = "160";
        String namae          = "Oda Nobunaga";
        String taijyu         = "40.0";

        // setter���\�b�h��(EmpVO)vo�I�u�W�F�N�g�ɐݒ肵�܂��B
        vo.setSyainNumber(syainNumber);
        vo.setHeight(shincho);
        vo.setName(namae);
        vo.setWeight(taijyu);

        return vo;
    }
    public static void printNobunaga(EmpVO vo) {

        // VO���A�M���̃f�[�^���擾���܂��B
        String syainNumber    = vo.getSyainNumber();
        String shincho        = vo.getHeight();
        String namae          = vo.getName();
        String taijyu         = vo.getWeight();

        System.out.println("�ԍ�\t����\t\t�g��\t�̏d");
        System.out.println(syainNumber + "\t" + namae + "\t" + shincho + "\t" +  taijyu );
    }
    public static void main(String[] args) {
        EmpVO vo = getNobunaga();

        printNobunaga(vo);
    }
}