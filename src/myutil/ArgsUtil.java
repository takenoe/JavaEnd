package myutil;

import java.io.File;

public class ArgsUtil {
	public static String parseArgs(String[] args) {
		//File�N���X���g�p
		if (args.length != 1){
		    System.out.println("�������w�肳��Ă��܂���");
		    System.exit(0);
		  }

		//File�v���W�F�N�g�쐬
		File file = new File(args[0]);

		//�t�@�C���̑��݊m�F
		if(file.exists() == false) {
	    	  System.out.println(args[0] + "�t�@�C�������݂��܂���");
	    	  System.exit(0);
	    }
		return args[0];
	}
}
