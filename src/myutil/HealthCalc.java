package myutil;
import java.math.BigDecimal;

public class HealthCalc {
	public static String calcBestWeight(String Height) {

		//�g���̌^�ϊ�
		int intHeight = Integer.parseInt(Height);

		//�K���̏d�̌v�Z�Ǝl�̌ܓ�
		double bestWeight = (intHeight - 100) * 0.9;
		BigDecimal calc = new BigDecimal(bestWeight);
		calc = calc.setScale(1,BigDecimal.ROUND_HALF_UP);

		//�^�ϊ�
		String str =  calc.toString();
		return str;
	}
	public static String calcWeightDeflection(String weight, String bestWeight) {
		//�g���̏d�̌^�ϊ�
		double intweight = Double.parseDouble(weight);
		double intbestWeight = Double.parseDouble(bestWeight);

		//�΍��̌v�Z
		double WeightDeflection = intweight - intbestWeight;

		//�l�̌ܓ�
		BigDecimal calc = new BigDecimal(WeightDeflection);
		calc = calc.setScale(1,BigDecimal.ROUND_HALF_UP);

		//�^�ϊ�
		String str =  calc.toString();
		return str;
	}
}
