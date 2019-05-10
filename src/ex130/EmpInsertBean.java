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
			vo.setName(UserInput.getString("氏名を入出力してください："));
			vo.setHeight(UserInput.getString("身長を入出力してください："));
			vo.setWeight(UserInput.getString("体重を入出力してください："));

			EmpPrintInfo.printHeader();
			EmpPrintInfo.printInfo(vo);

			String check = UserInput.getString("登録しますか＜ y / n ＞ :");
			if(check.equalsIgnoreCase("y")){
				empVO.insert(vo);
				System.out.println("データを登録しました。");
			}
		}else {
			System.out.println("社員番号" + empNo + "は既に登録されています。");
		}
	}

}
