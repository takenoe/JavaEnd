package ex120;
import dao.EmpDAO;
import myutil.UserInput;
import view.EmpPrintInfo;

public class EmpPrintBean {
	public void execute(int empNo,String fileName) {
		//�Ј��ԍ������݂��邩�m�F
		EmpDAO empVO = new EmpDAO(fileName);
		if(empVO.get(empNo) == null) {
			System.out.println("�Ј��ԍ�" + empNo + "�͓o�^����Ă��܂���");
		}else {
			EmpPrintInfo.printHeader();
			EmpPrintInfo.printInfo(empVO.get(empNo));
			
			String check = UserInput.getString("�o�^���܂����� y / n �� :");
			if(check.equalsIgnoreCase("y")){
				
				System.out.println("�f�[�^��o�^���܂����B");
			}
		}
		
	}

}
