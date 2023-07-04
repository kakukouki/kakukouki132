class Person {
	String name;
	int age;
	
	public void speak() {
		System.out.println("我是一个好人");
	}
	public void cal01(int n) {
		int res = 0;
		for (int i = 0; i <= n; i++) {
			res += i;
		}
		System.out.println(res); 
	}
	public int Sum( int num1, int num2) {
		int res = num1 + num2;
		return res;
	}
}

public class LeiDuixiang{
	public static void main(String[] args) {
	
		Person p1;
		p1 = new Person();
		p1.name = "ghj";
		p1.age = 25; 
		
		Person p2;
		p2 = p1;
		p2.speak();
		p1.cal01( 89);
		int add = p1.Sum(189, 20);
		System.out.println(add);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}