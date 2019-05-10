package view;

import myutil.HealthCalc;
import vo.EmpVO;

public class EmpPrintInfo {
	public static void printHeader() {
		//�w�b�_�[�\��
		System.out.println("�ԍ�\t����\t\t\t�g��\t�̏d\t�K���̏d\t�΍�");
	}
	public static void printInfo(EmpVO empVO) {
		String BestWeight = HealthCalc.calcBestWeight(empVO.getHeight());
		String WeightDeflection = HealthCalc.calcWeightDeflection(empVO.getWeight(), BestWeight);
		//�f�[�^�o��
		System.out.print(empVO.getSyainNumber() + "\t");
		System.out.print(empVO.getName() + "\t");
		System.out.print(empVO.getHeight() + "\t" + "\t");
		System.out.print(empVO.getWeight() + "\t");
		System.out.print(BestWeight + "\t" + "\t");
		System.out.println(WeightDeflection);
	}
}
