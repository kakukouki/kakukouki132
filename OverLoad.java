public class OverLoad{
	public static void main(String[] args) {
		Methods pp = new Methods();
		
		pp.m(3);
		pp.m(5,8);
		pp.m("我是程序员");
		
	
		System.out.println(pp.n(3, 9));
		System.out.println(pp.n(3.8, 7.8));
		System.out.println(pp.n(2.3, 3.5, 8.4));
		
		
		
		
		
		
		
	}
}



class Methods{
	public void m(int a) {
		System.out.println(a*a);
	}
	
	public void m(int a, int b) {
		System.out.println(a*b);
		}
	
	public void m(String a) {
		System.out.println(a);
	}
	
	public int n(int a, int b) {
		return a > b ? a : b;
	}
	
	public double n(double a, double b) {
		return a > b ? a : b;
	}
	
	public double n(double a,double b,double c) {
		double mid = a > b ? a : b;
		return mid > c ? mid : c;
	}
	
	
	
	
}


























