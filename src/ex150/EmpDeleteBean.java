package ex150;

import dao.EmpDAO;
import myutil.UserInput;
import view.EmpPrintInfo;

public class EmpDeleteBean implements IEmpBean{
	public void execute(int empNo,String fileName) {
		EmpDAO empVO = new EmpDAO(fileName);
		if(empVO.get(empNo) == null) {
			System.out.println("�Ј��ԍ�" + empNo + "�͓o�^����Ă��܂���");
		}else {
			EmpPrintInfo.printHeader();
			EmpPrintInfo.printInfo(empVO.get(empNo));
			String check = UserInput.getString("�폜���܂����� y / n �� :");
			if(check.equalsIgnoreCase("y")){
				empVO.delete(empVO.get(empNo));
				System.out.println("�f�[�^���폜���܂����B");
			}
		}
	}
}
