public class HomeWork{
	public static void main(String[] args) {
		
		double[] shuzu = {2.1, 3.5, 78.3, 27.4, 99.2, -0.45};
		A01 pp = new A01();
		Double res = pp.zuidazhi(shuzu);
		if(res != null) {
			System.out.println(pp.zuidazhi(shuzu));
		}else {
			System.out.println("输入有误");
		}
		
		String[] shuzu1 = {"ghj" , "jhg" , "hgj" , "hjg"};
		A02 pp1 = new A02();
		pp1.name = "hjg";
		System.out.println(pp1.find(shuzu1));
		
		Book book = new Book();
		System.out.println(book.updatePrice(256.88));
		
		A03 pp3 = new A03();
		int[] arr = {1,2,3,4,5,6,9};
		pp3.copyArr(arr);
		
		Circle pp4 = new Circle();
		pp4.r = 4;
		System.out.println(pp4.zhouChang(pp4.r));
		System.out.println(pp4.mianJi(pp4.r));

		Dogs pp5 = new Dogs();
		pp5.name = "tyu";
		pp5.color = "red";
		pp5.age = 9;
		pp5.show();
		
		Circles pp7 = new Circles();
		PassObject pp6 = new PassObject();
		pp6.printAreas(pp7,7);
		
		
	}
}


class A01 {
	public Double zuidazhi (double[] p ) {
		if(p != null && p.length > 0) {
			double max = p[0];
			for(int i = 1; i < p.length; i++) {
				if( max < p[i]) {
					max = p[i];
				}
			}
			return max;
		}else {
			return  null;
		}
	}

}

class A02 {
	
	String name;
	
	public int find(String[] p) {
		for(int i = 0; i < p.length ;i++) {
			if(this.name.equals(p[i])) {
				return i+1 ;
			}
		}
		return -1;
		
		
	}
}

class Book {
	public double updatePrice(double p) {
		if(p > 100 && p <= 150) {
			p = 100;
		}
		if(p > 150) {
			p = 150;
		}
		return p;
	}
}

class A03 {
	public int[] copyArr(int[] p) {
		int[] p1 = new int[p.length];
		for(int i  = 0; i < p.length; i++) {
			p1[i] = p[i];
		}
	   return p1;
	}
}

class Circle {
	double r ;
	
	Circle(){
		
	}
	public Circle(double p){
		r = p;
	}
	
	public double zhouChang(double p) {
		double c = 2* p *3.1415;
		return c;
	}
	
	public double mianJi(double p) {
		double c = 3.1415*p*p;
		return c;
	}
}

class Dogs {
	String name;
	String color;
	int age;
	
	public void show() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(age);
	}
}

class Circles{
	double radius ;
	
	public double findArea(double p) {
		double p1 = 3.1415*p*p;
		return p1;
	}
}
class PassObject{
	public void printAreas(Circles c, int times) {
		Circles pp = new Circles();
		System.out.println("Radius" + "\t" + "Area" + "\t");
		for(int i = 1; i <= times; i++) {
			double mianji = pp.findArea(i);
			System.out.println(i + "\t" + mianji + "\t");
		}
	}
}















