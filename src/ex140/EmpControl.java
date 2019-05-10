package ex140;


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
			int empNo = 0;
			IEmpBean iemp = null;
			while(true){
			//���j���[�ԍ���I������
			switch(Menu.getNo()) {
			case 1:
				iemp =  new AllEmpPrintBean();
		        break;

			case 2:
				//�Ј��ԍ��Ō���
				empNo = UserInput.getNumber("�Ј��ԍ�����͂��ĉ������F");
				iemp = new EmpPrintBean();

				break;

			case 3:
				empNo = UserInput.getNumber("�Ј��ԍ�����͂��ĉ������F");
				iemp = new EmpInsertBean();
				break;

			case 4:
				empNo = UserInput.getNumber("�폜����Ј��ԍ�����͂��ĉ������F");
				iemp = new EmpPrintBean();
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
			iemp.execute(empNo,args[0]);
			System.out.println(" ");

		}
	}

}
