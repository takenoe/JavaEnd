package ex130;

import ex050.AllEmpPrintBean;
import myutil.ArgsUtil;
import myutil.UserInput;
import view.Menu;

public class EmpControl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

			//�f�[�^�t�@�C���̊m�F
			ArgsUtil.parseArgs(args);
			System.out.println(" ");
			while(true){
			//���j���[�ԍ���I������
			switch(Menu.getNo()) {
			case 1:
				AllEmpPrintBean bean = new AllEmpPrintBean();

		        bean.execute("syain.txt");

		        break;

			case 2:
				//�Ј��ԍ��Ō���
				int Num = UserInput.getNumber("�Ј��ԍ�����͂��ĉ������F");
				EmpPrintBean prson = new EmpPrintBean();
				prson.execute(Num,args[0]);
				break;

			case 3:
				int Num1 = UserInput.getNumber("�Ј��ԍ�����͂��ĉ������F");
				EmpInsertBean ca3 = new EmpInsertBean();
				ca3.execute(Num1,args[0]);
				break;
			case 4:
				int Num2 = UserInput.getNumber("�폜����Ј��ԍ�����͂��ĉ������F");
				EmpDeleteBean ca4 = new EmpDeleteBean();
				ca4.execute(Num2,args[0]);
				break;
			case 5:
				System.out.println("�u5.���R�[�h�̏C���v���I������܂���");

				break;
			case 6:
				System.out.println("�u6.���ϒl�̕\���v���I������܂���");

				break;
			case 0:
				System.out.println("�u0.�I���v���I������܂���");
				System.out.println("�v���O�������I�����܂�");
				System.exit(0);
				break;
			}
			System.out.println(" ");

		}
	}

}