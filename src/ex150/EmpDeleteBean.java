package ex150;

import dao.EmpDAO;
import myutil.UserInput;
import view.EmpPrintInfo;

public class EmpDeleteBean implements IEmpBean{
	public void execute(int empNo,String fileName) {
		EmpDAO empVO = new EmpDAO(fileName);
		if(empVO.get(empNo) == null) {
			System.out.println("社員番号" + empNo + "は登録されていません");
		}else {
			EmpPrintInfo.printHeader();
			EmpPrintInfo.printInfo(empVO.get(empNo));
			String check = UserInput.getString("削除しますか＜ y / n ＞ :");
			if(check.equalsIgnoreCase("y")){
				empVO.delete(empVO.get(empNo));
				System.out.println("データを削除しました。");
			}
		}
	}
}
