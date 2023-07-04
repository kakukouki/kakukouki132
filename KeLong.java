public class KeLong{
	public static void main(String[] args) {
		PP pp = new PP();
		int p = 800;
		int[] aa = {1,2,3,4};
		
		
		pp.person(p);
		System.out.println(p);
		pp.shuzu(aa);
		for(int i = 0; i < 4; i++) {
			   System.out.println(aa[i]);
			}
		
		pp.name = "ghj";
		pp.age = 25;
		MyTools tools = new MyTools();
		PP p2 = tools.copyPP(pp);
		   System.out.println(pp.name + pp.age);
		   System.out.println(p2.name + p2.age);

		
	}
}
 
class PP{
	String name;
	int age;
	
	
	
	public void person(int p) {
		 p = 100;
			System.out.println(p); 
	}
	
	public void shuzu(int[] aa) {
		aa[1] = 99;
		for(int i = 0; i < 4; i++) {
		   System.out.println(aa[i]);
		}
	}
	
}


class MyTools {
	public PP copyPP(PP pp) {
		PP p2 = new PP();
		p2.name = pp.name;
		p2.name = "ghj";
		p2.age = pp.age;
		return p2;
	}
	
}






















