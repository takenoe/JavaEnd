package ex120;
import dao.EmpDAO;
import myutil.UserInput;
import view.EmpPrintInfo;

public class EmpPrintBean {
	public void execute(int empNo,String fileName) {
		//Ğˆõ”Ô†‚ª‘¶İ‚·‚é‚©Šm”F
		EmpDAO empVO = new EmpDAO(fileName);
		if(empVO.get(empNo) == null) {
			System.out.println("Ğˆõ”Ô†" + empNo + "‚Í“o˜^‚³‚ê‚Ä‚¢‚Ü‚¹‚ñ");
		}else {
			EmpPrintInfo.printHeader();
			EmpPrintInfo.printInfo(empVO.get(empNo));
			
			String check = UserInput.getString("“o˜^‚µ‚Ü‚·‚©ƒ y / n „ :");
			if(check.equalsIgnoreCase("y")){
				
				System.out.println("ƒf[ƒ^‚ğ“o˜^‚µ‚Ü‚µ‚½B");
			}
		}
		
	}

}
