package view;

import myutil.UserInput;

public class Menu {

	//���j���[��\������
	public static void show() {
		System.out.println("�Ј�����Ǘ��c�[��");
		System.out.println("�P.���R�[�h�̈ꗗ");
		System.out.println("�Q.���R�[�h�̌���");
		System.out.println("�R.���R�[�h�̐V�K�o�^");
		System.out.println("�S.���R�[�h�̍폜");
		System.out.println("�T.���R�[�h�̏C��");
		System.out.println("�U.���ϒl�̕\��");
		System.out.println("�O.�I��");

	}
	public static int getNo() {

		int inputint;
		//���j���[���Ăяo��
		do {
			show();
			inputint = UserInput.getNumber("�ԍ�����o�͂��Ă��������F");
		}while(inputint < 0||inputint > 6); {
		return inputint;
	}
	}
}
