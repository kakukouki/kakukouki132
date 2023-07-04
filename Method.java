public class Method{
	public static void main(String[] args) {
	
		
	AA a = new AA();
//	boolean b = a.panDuan(7);
//		System.out.println( b );
//	if(a.panDuan(67)) {
//		System.out.println("是奇数");
//	}else {
//		System.out.println("是偶数");
//	}
	a.shuZu(23,34,'>');
	a.shuZu(9, 9, '$');
	
		
	
	}
}

 class AA {
	
	 public boolean panDuan(int n) {
//		if(n%2 != 0) {
//			return true;
//		}else {
//			return false;
//		}
		return n%2 != 0? true: false;
		}
	
//	public void shuZu(int a, int b, char c) {
//		for(int i = 0; i < a; i++) {
//			for (int j = 0 ;j < b; j++) {
//				System.out.print(c);
//			}
//			System.out.println();
//		}
//	}
	
	public void shuZu(int i, int j, char c) {
		for(int a = 0; a < i ; a++) {
			for(int b = 0; b < j ; b++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
	
 }

































