package ex150;
import dao.EmpDAO;
import myutil.UserInput;
import view.EmpPrintInfo;

public class EmpPrintBean implements IEmpBean{
	public void execute(int empNo,String fileName) {
		//社員番号が存在するか確認
		EmpDAO empVO = new EmpDAO(fileName);
		if(empVO.get(empNo) == null) {
			System.out.println("社員番号" + empNo + "は登録されていません");
		}else {
			EmpPrintInfo.printHeader();
			EmpPrintInfo.printInfo(empVO.get(empNo));

			String check = UserInput.getString("登録しますか＜ y / n ＞ :");
			if(check.equalsIgnoreCase("y")){

				System.out.println("データを登録しました。");
			}
		}

	}

}
