package ex060;

import ex050.AllEmpPrintBean;
import myutil.ArgsUtil;
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
				System.out.println("�u2.���R�[�h�̌����v���I������܂���");

				break;
			case 3:
				System.out.println("�u3.���R�[�h�̐V�K�o�^�v���I������܂���");

				break;
			case 4:
				System.out.println("�u4.���R�[�h�̍폜�v���I������܂���");

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

				break;
			}
			System.out.println(" ");
			if(Menu.getNo() == 0) {
				break;
			}
		}
	}

}
