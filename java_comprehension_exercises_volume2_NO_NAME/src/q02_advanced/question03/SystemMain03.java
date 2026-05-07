package q02_advanced.question03;

import java.io.IOException;

public class SystemMain03 {

	public static void main(String[] args) {

		LoginService loginService = new LoginService(new MemberStorage());
		System.out.println("ログイン情報を入力してください");
		boolean isLogin = false;
		//TODO ここから実装する
		ConsoleReader reader = new ConsoleReader();
		Member loginUser = null;

		while (!isLogin) {
			try {
				System.out.print("input id>>");
				int id = reader.inputNumber();

				System.out.print("input password>>");
				String pass = reader.inputString();

				loginUser = loginService.doLogin(id, pass);

				if (loginUser == null) {
					System.out.println("ID またはパスワードが違っています。再度入力してください。");
					continue;
				}
				System.out.println("ログインに成功しました");
				isLogin = true;
			} catch (NumberFormatException e) {
				System.out.println("不正な入力です。再度入力してください");

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		System.out.println("ログインユーザ情報を表示します。");
		loginUser.showMember();

	}

}
