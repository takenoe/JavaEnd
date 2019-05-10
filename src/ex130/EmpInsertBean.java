package ex130;

import dao.EmpDAO;
import myutil.UserInput;
import view.EmpPrintInfo;
import vo.EmpVO;

public class EmpInsertBean {

	public void execute(int empNo,String fileName) {
		EmpDAO empVO = new EmpDAO(fileName);

		if(empVO.get(empNo) == null) {
			EmpVO vo = new EmpVO();
			String empNo1 = Integer.toString(empNo);
			vo.setSyainNumber(empNo1);
			vo.setName(UserInput.getString("��������o�͂��Ă��������F"));
			vo.setHeight(UserInput.getString("�g������o�͂��Ă��������F"));
			vo.setWeight(UserInput.getString("�̏d����o�͂��Ă��������F"));

			EmpPrintInfo.printHeader();
			EmpPrintInfo.printInfo(vo);

			String check = UserInput.getString("�o�^���܂����� y / n �� :");
			if(check.equalsIgnoreCase("y")){
				empVO.insert(vo);
				System.out.println("�f�[�^��o�^���܂����B");
			}
		}else {
			System.out.println("�Ј��ԍ�" + empNo + "�͊��ɓo�^����Ă��܂��B");
		}
	}

}
