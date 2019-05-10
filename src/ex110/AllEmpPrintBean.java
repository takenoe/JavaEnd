package ex110;

import java.util.List;

import dao.EmpDAO;
import view.EmpPrintInfo;
import vo.EmpVO;

public class AllEmpPrintBean {
	public void execute(String fileName) {
		EmpDAO dao = new EmpDAO(fileName);

		List<EmpVO> list =dao.getAll();
		if(list.size() == 0) {
			System.out.println(fileName + "�ɂ́A�Ј���񂪈ꌏ�����݂��܂���");
		}else {
			EmpPrintInfo.printHeader();
			for(EmpVO i:list) {
				EmpPrintInfo.printInfo(i);
			}
		}

	}
}
