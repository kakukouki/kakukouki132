public class SwitchCase{
	public static void main(String[] args) {
		for(int a=1;a<6;a++) {
		
		switch(a) {
		case 1:
			System.out.println("您已成为一阶");
			break;
		case 2:
			System.out.println("您已成为二阶");
			break;
		case 3:
			System.out.println("您已成为筑基高手");
			break;
		case 4:
			System.out.println("您已成为结丹高手");
			break;
		case 5:
			System.out.println("您化神了");
		default:
			System.out.println("恭喜您已经满级");
		}
		System.out.println("恭喜升级，等级达到了" +a);
		}
	}
}