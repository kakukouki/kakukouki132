public class Dowhile{
	public static void main(String[] args) {
		int x=10;
		do {
			System.out.println("x的值是"+ x);
			x++;
			System.out.println("\n");
			
		}while(x<1);
		do {
			System.out.println("x new="+ x);
			x++;
			System.out.println("\n");
		}while(x<13);
	}
}