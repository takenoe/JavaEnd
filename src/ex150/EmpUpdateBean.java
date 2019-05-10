package ex150;

import dao.EmpDAO;
import myutil.UserInput;
import view.EmpPrintInfo;

public class EmpUpdateBean implements IEmpBean{
	public void execute(int empNo,String fileName) {
		//�Ј��ԍ��̗L�����m�F����
		EmpDAO empVO = new EmpDAO(fileName);
		if(empVO.get(empNo) == null) {
			System.out.println("�Ј��ԍ�" + empNo + "�͓o�^����Ă��܂���");
		}else {
			EmpPrintInfo.printHeader();
			EmpPrintInfo.printInfo(empVO.get(empNo));
			String check = UserInput.getString("�C�����܂����� y / n �� :");
			if(check.equalsIgnoreCase("y")){
				empVO.update(empVO.get(empNo));
				System.out.println("�f�[�^���C�����܂����B");
			}
		}
	}
}
