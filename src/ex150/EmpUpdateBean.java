package ex150;

import dao.EmpDAO;
import myutil.UserInput;
import view.EmpPrintInfo;

public class EmpUpdateBean implements IEmpBean{
	public void execute(int empNo,String fileName) {
		//社員番号の有無を確認する
		EmpDAO empVO = new EmpDAO(fileName);
		if(empVO.get(empNo) == null) {
			System.out.println("社員番号" + empNo + "は登録されていません");
		}else {
			EmpPrintInfo.printHeader();
			EmpPrintInfo.printInfo(empVO.get(empNo));
			String check = UserInput.getString("修正しますか＜ y / n ＞ :");
			if(check.equalsIgnoreCase("y")){
				empVO.update(empVO.get(empNo));
				System.out.println("データを修正しました。");
			}
		}
	}
}
