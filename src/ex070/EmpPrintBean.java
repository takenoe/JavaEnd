package ex070;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import myutil.HealthCalc;

public class EmpPrintBean {
	public void execute(int empNo,String file) {
		//�o�^���Ă��邩�̊m�F
		int check = -1;
		try (BufferedReader in = new BufferedReader(new FileReader(new File(file)))){

			if(!in.ready()) {
				System.out.println(file + "�ɂ́A�Ј���񂪈ꌏ�����݂��܂���");
				return;
			}
            //�t�@�C�������݂��Ȃ��ꍇ�ɗ�O����������̂Ŋm�F����
			String line;

            while((line = in.readLine()) != null){
            	String[] data = line.split(",");
            	int f = Integer.parseInt(data[0]);
            	if(f == empNo) {
            		//�w�b�_�[�\��
            		System.out.println("�ԍ��@�@�����@�@�@�@�@�@�g���@�@�̏d�@�@�K���̏d�@�@�΍�");
            		String BestWeight = HealthCalc.calcBestWeight(data[2]);
            		String WeightDeflection = HealthCalc.calcWeightDeflection(data[3], BestWeight);
            		System.out.print(data[0] + "\t");
            		System.out.print(data[1] + "\t");
            		System.out.print(data[2] + "\t" + "\t");
            		System.out.print(data[3] + "\t");
            		System.out.print(BestWeight + "\t" + "\t");
            		System.out.println(WeightDeflection);
            		//�o�^����
            		check = 1;
            	}
            //�o�^�Ȃ�
            }if(check == -1) {
        		System.out.println("�Ј��ԍ�" + empNo + "�͓o�^����Ă��܂���");
        	}


        }catch (IOException e) {
            e.printStackTrace();
        }
	}
}
