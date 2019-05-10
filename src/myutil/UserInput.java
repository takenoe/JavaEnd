package myutil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {

	//���[�U�[����
	public static String getString() {
		//�ϐ����̒�`
		String inputString ="";
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			inputString = br.readLine();
		}catch(IOException ioe){
			ioe.printStackTrace();
			System.exit(0);
		}
		return inputString;

	}
	public static String getString(String title) {
		//�^�C�g���\��
		System.out.println(title);
		//getString�̍ė��p
		return UserInput.getString();

	}
	public static int getNumber() {
		//getString�̍ė��p
		try {
			int inputint = 0;
			//int�^�ɕϊ�
			inputint = Integer.parseInt(UserInput.getString());
		    if(inputint >= 0) {
		    	return inputint;
		    }else {
		    	return -1;
		    }
		} catch (NumberFormatException e) {
		        return -1;
		}
	}

	public static int getNumber(String title) {
		//�^�C�g���\��
		System.out.println(title);
		//getNumber�̍ė��p
		return getNumber();
	}
}
