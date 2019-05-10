package ex140;


import myutil.ArgsUtil;
import myutil.UserInput;
import view.Menu;

public class EmpControl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

			//データファイルの確認
			ArgsUtil.parseArgs(args);
			System.out.println(" ");
			int empNo = 0;
			IEmpBean iemp = null;
			while(true){
			//メニュー番号を選択する
			switch(Menu.getNo()) {
			case 1:
				iemp =  new AllEmpPrintBean();
		        break;

			case 2:
				//社員番号で検索
				empNo = UserInput.getNumber("社員番号を入力して下さい：");
				iemp = new EmpPrintBean();

				break;

			case 3:
				empNo = UserInput.getNumber("社員番号を入力して下さい：");
				iemp = new EmpInsertBean();
				break;

			case 4:
				empNo = UserInput.getNumber("削除する社員番号を入力して下さい：");
				iemp = new EmpPrintBean();
				break;

			case 5:
				System.out.println("「5.レコードの修正」が選択されました");

				break;
			case 6:
				System.out.println("「6.平均値の表示」が選択されました");

				break;
			case 0:
				System.out.println("「0.終了」が選択されました");
				System.out.println("プログラムを終了します");
				System.exit(0);
				break;
			}
			iemp.execute(empNo,args[0]);
			System.out.println(" ");

		}
	}

}
