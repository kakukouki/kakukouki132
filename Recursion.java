public class Recursion{
	public static void main(String[] args) {
		DiGui pp = new DiGui();
		pp.test(4);
	
		pp.jieCheng(5);
			System.out.println(pp.jieCheng(5));

		int pq = pp.qiShu(15);
			System.out.println(pq);
		
		int res = pp.peach(1);	
		if(res != -1) {	
		System.out.print(res);	
		}
			
		
		
		
		
		
	}
}

class DiGui{
	public void test(int n) {
		if(n > 2) {
			test(n - 1);
		}
		System.out.println("n = " + n);
	}
	
	
	public int jieCheng(int n) {
		if(n == 1) {
			return 1;
		}else {
			return jieCheng(n-1) * n;
		}
	}
	
	public int qiShu( int n ) {
		if(n >= 1 ) {
			if(n == 1|| n == 2) {
				return 1;
			}else {
				return qiShu(n-1) + qiShu(n-2);
			}
		}else {
			System.out.print("输入有误，请输入大于1的整数");
			return 0;
		}
	}
	
	public int peach(int n) {
		if(n == 10) {
			return 1;
		}else if(n >= 1 && n <= 9) {
			return (peach(n+1) + 1) * 2;
		}else {
			System.out.println("请输入1-10的数");
			return -1;
		}
	}
	
}






































