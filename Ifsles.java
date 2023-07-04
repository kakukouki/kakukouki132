public class Ifsles{
	public static void main(String[] args) {
		int x=10;
		for(int b=11;b<=35;b++) {
			++x;
			System.out.println("我在循环，我是b=" +b);
			if(x<30) {
				System.out.println("我是x,而且我也是=" +x);
			}else if(b==35){
		    	System.out.println("我才是最大的，我是=" +b);
			}else {
				System.out.println("我是y，我比x大，我是=" +x);

		    	}
				}
	}
 } 