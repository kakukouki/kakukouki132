package date530;
public class Account{
	private String name;
	private double money;
	private String password;
	
	public Account() {
		
	}
	
	public Account(String name, double money, String password) {
		this.setName(name);
		this.setMoney(money);
		this.setPassword(password);
	}
	
	public void setName(String name) {
		if(name.length() >= 2 && name.length() <= 4) {
			this.name = name;
		}else {
			System.out.println("名前の設定ルール（2文字から4文字まで） ， デフォルト名：無名");
			this.name = "無名";
		}
	}
	public String getName() {
		return name;
	}
	
	public void setMoney(double money) {
		if(money > 20) {
			this.money = money;
		}else {
			System.out.println("残り金額は２０００円以上のみ， リセット：０");
		}
	}
	public double getMoney() {
		return money;
	}
	
	public void setPassword(String password) {
		if(password.length() == 6) {
			this.password = password;
		}else {
			System.out.println("パスワードは６桁のみ,  リセット：000000");
			this.password = "000000";
		}
	}
	public String getPassword() {
		return password;
	}
	
	public void show() {
		System.out.print("=====お客様の個人情報は下記どうり=====" +"\n"+
				"名前：　"+"\t" +name + "\n" + "残額：　"+"\t" + money +"\n" + "パスワード：　" + "\t" +password +"\n");
	}
}





























