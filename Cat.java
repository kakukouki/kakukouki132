public class Cat{
	private String name;
	public Cat(String mingzi) {
		System.out.println("小猫的名字是" + mingzi);
		this.name = mingzi;
	}
	public static void main (String[] args) {
		Cat suibian = new Cat("mao");
		System.out.println(suibian.name);
		
	}
}