public class Final{
	public static void main(String[] args) {
	/* String name="郭鸿基";
		System.out.println(name);
	
		System.out.println(name);
		int shuzi1=23;
		int shuzi2=12;
		int shuzi3=56;
		boolean shima=shuzi1+
				shuzi2==shuzi3;
		System.out.println(shima);
		int a = 1, b = 1;
		int tem = a + 1; 
		System.out.println((b = b + a
				) == (b+= a));
		System.out.println("ghj  \t hjg\thgh");
		double n1=8.1/3;
		double n2=2.7;
		System.out.println(n2==n1);
	 if(n1 == n2) {
			System.out.println("xiangdeng");
		}else {
			System.out.println("buxiangdeng");
			
		}
		System.out.println(Math.abs(n1-n2));
		char n3='郭';
		char n4='鸿';
		char n5='基';
		
		System.out.println(n3+1+n4+n5);*/
		
		//数据类型自动转换
		//int a='郭';
		//下三种数据类型参与运算自动换换成int，有更高的就转换成最高的数据类型
		/*char b='鸿';
		byte d=56;
		short c=57;
		//....
		double e='鸿';
		System.out.println((char )a+b+c+e);
		*/
		
		/*String name="郭鸿基";
		int age=25;
		double chengji =99.9;
		char xingbie = '男';
		String aihao="打乒乓球";
		System.out.println("姓名\t年龄\t成绩\t性别\t爱好"+"\n"+name+"\t"+age+"\t"+chengji+"\t"+xingbie+"\t"+aihao);
		*/	
		
		//System.out.println(6.6/3);
		//System.out.println(6.6/2);
		
		//++a与a++的区别，先自增后赋值/先赋值后自增
		/*int a=10;
		int b=++a;
		System.out.println(a);
		System.out.println(b);

		int c=10;
		int d=c++;
		System.out.println(c);
		System.out.println(d);
                                */
		/*int a=678 ;
		int b=a/7;
		int c=59%7;
		System.out.println("还有"+b+"个星期零"+c+"天放假！");
		
		double huaShiWenDu=234.5;
		double sheShiWenDu=5.0/9*(huaShiWenDu-100);
		System.out.println("对应的摄氏温度是 "+sheShiWenDu);*/
//&&短路与和&逻辑与的开发效率，&&只要判断到false，便不再继续判断，效率高首选； 
//||短路或与｜逻辑或同理，首选效率短路或；
		/*int a=8;
		int b=9;
		if (a<9 && b++ < 89) {
			System.out.println("OK");
		}
			System.out.println("a="+a+" b="+b);*/
			
//逻辑异或，不同为ture，相同为false；
		/*	boolean c =(1<2)^(3<4);			
			System.out.println(c);*/
		
		/*boolean x=true;
		boolean y=false;
		short z=46;
		if((z++==46)&&(y=true)) {
			z++;
		}
		//z=48;
		if((x=false)||(++z==49)) {	
			z++;
		}
		//z=50;
		System.out.println("z="+z);*/

		//三元运算，一真大师；
			int a=10 ,b=99;
			int c = a < b ? a++ : b--;
			System.out.println(c);//10
			System.out.println(a);//11
			System.out.println(b);//99

		
		
		
		
		
		
		

		
	}
}