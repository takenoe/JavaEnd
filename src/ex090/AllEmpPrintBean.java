package ex090;

import java.util.List;

import dao_stub.EmpDAO;
import view.EmpPrintInfo;
import vo.EmpVO;

public class AllEmpPrintBean {
	public void execute(String fileName) {
		EmpDAO dao = new EmpDAO(fileName);

		List<EmpVO> list =dao.getAll();
		if(list.size() == 0) {
			System.out.println(fileName + "には、社員情報が一件も存在しません");
		}else {
			EmpPrintInfo.printHeader();
			for(EmpVO i:list) {
				EmpPrintInfo.printInfo(i);
			}
		}

	}
}
