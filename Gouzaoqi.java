public class Gouzaoqi{
	public static void main(String[] args) {
		
		
//		Persons pp = new Persons();
//		System.out.println(pp.name + pp.age );
//		
//		Persons pp1 = new Persons( "ghj" , 25);
//		System.out.println(pp1.name + pp1.age );

		Persons pp2 = new Persons( "ghj" , 25);
		Persons pp3 = new Persons( "ghj" , 24);
		System.out.println(pp2.compareTo(pp3) );

		
	}
}


class Persons{
	String name ;
	int age ;
	
	Persons(){
		age = 18;
	}
	
	public Persons(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public boolean compareTo( Persons p ) {
		return this.name.equals(p.name) && this.age == p.age;
	}
	
}




















