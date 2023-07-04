//import java.util.Scanner;
public class Input{
	public static void main(String[]args) {
		/*Scanner myScanner =new Scanner(System.in);
		System.out.println("请输入名字");
		String name = myScanner.next();
		System.out.println("请输入年龄");
		int age = myScanner.nextInt();
		System.out.println("请输入薪水");
		double xinShui = myScanner.nextDouble();
		System.out.println("人的信息如下：" + "\n"+"名字是 "+ name +"\n"+"年龄是 "+
				age+"\n"+"薪水是 " + xinShui );*/
		//2^2 2^3 2^7 2^8 2 8 128 256　394
		//6+5*8+4*8^2+2*8^3  46+
		
		
		//0010 |0011  =0011
		//0010^0011 = 0001
		//System.out.println(2|3);//3
		//System.out.println(2^3);//1
		
		//String str="78.6";
		//double d1=Double.parseDouble(str);
		
	/*	char c1 ='g';
		String s1=c1+"";
		System.out.println(s1);
		
		Scanner myScanner1 =new Scanner(System.in);
		System.out.println("请输入你的年龄");
		int age =myScanner1.nextInt();
		if (age>18) {
			System.out.println("你的年龄大于十八，要对自己的行为负责，送入监狱！");
		}
		System.out.println("继续");*/
		   
		
		/*int a =-5;
		int b =-10;
		if ((a+b)%3==0&&(a+b)%5==0) {
			System.out.println("a和b的和能被3整除也能被5整除");
		}else {
			System.out.println("不行呢");
		}*/
		
	/*	int year =2012;
		if((year%4==0&&year%100!=0)||year%400==0) {
			System.out.println(year + "这一年是闰年");
		}else {
			System.out.println(year + "这一年不是闰年");
		}*/
		/*Scanner myScanner =new Scanner(System.in);
		System.out.println("请输入您的信用分(0-100)");
		double fenShu =myScanner.nextDouble();
		if(fenShu>=0&&fenShu<=100) {
		if(fenShu==100) {
			System.out.println("信用极好");
		}else if(80<fenShu&&fenShu<=99){
			System.out.println("信用优秀");
		}else if(fenShu>=60&&fenShu<=80) {
			System.out.println("信用一般");
		}else {
			System.out.println("信用不及格");
		}
		}else {
			System.out.println("信用分需要在0-100之间，请重新输入：）");
		}*/
		
	/*	Scanner myScanner =new Scanner(System.in);
		System.out.println("请输入您的成绩：");	
		double chengJi=myScanner.nextDouble();
		if (chengJi>=0&&chengJi<=10) {
			if(chengJi>8.0) {
				System.out.println("恭喜您进入决赛");
				System.out.println("请输入您的性别：");
				char xingBie =myScanner.next().charAt(0);
				if (xingBie=='男') {
					System.out.println("进入男子组");
				}else if(xingBie=='女') {
					System.out.println("进入女子组");
				}else {
					System.out.println("性别输入有误");
				}
				
			}else {
				System.out.println("非常遗憾您被淘汰了");
			}
		}else {
			System.out.println("请输入0-10的正确成绩，请重新输入：）");
		}
		*/
		
		
/*		Scanner myScanner=new Scanner (System.in);
		System.out.println("欢迎来到购票系统"+"\n"+"请选择您的购票月份");
		int month=myScanner.nextInt();
		if(month>=4&&month<=10) {
			System.out.println("请输入您的年龄");
			int age=myScanner.nextInt();
			if(age>=18&&age<=60) {
				System.out.println("您的票价为60元");
			}else if(age<18) {
				System.out.println("您的票价为半价30元");
			}else if(age>60) {
				System.out.println("您的票价为20元");
			}
		}else 
			System.out.println("请输入您的年龄");
			int age=myScanner.nextInt();
		if(age>=18) {
			System.out.println("您的票价为40元");
		}else {
			System.out.println("您的票价为20元");
		}
*/	
		
		
/*		Scanner myScanner=new Scanner(System.in);
		System.out.println("请输入a-e中的一个");
		char ziMu=myScanner.next().charAt(0);
		switch (ziMu) {
		case 'a':
			System.out.println("A");
			break;
		case 'b':
			System.out.println("B");
			break;
		case 'c':
			System.out.println("C");
			break;
		case 'd':
			System.out.println("D");
			break;
		default :
			System.out.println("other");



		}
*/		
		
		
/*		Scanner myScanner=new Scanner(System.in);
		System.out.println("请输入月份");
		int month =myScanner.nextInt();
		if(month>=1&&month<=12) {
			switch(month) {
			case 1:
			case 2:
			case 3:
				System.out.println("这是春季");
				break;
			case 4:
			case 5:
			case 6:
				System.out.println("这是夏季");
				break;
			case 7:
			case 8:
			case 9:
				System.out.println("这是秋季");
				break;
			case 10:
			case 11:
			case 12:
				System.out.println("这是冬季");
				break;
		}
	}else {
		System.out.println("输入有误，请重新输入");
	}
*/		
		
/*		int start =7;
		int end =699;
		int targate=9;
		int sum =0;
		int count=0;
		for(int a=start;a<=end;a++) {
			if(a%targate==0) { 
			System.out.println("a="+a);
			count++;
			sum+=a;
			}
		}
		System.out.println("个数为"+count);
		System.out.println("总和为"+sum);

*/

		
/*		int a=1;
		int b=78;
		int c=6;
		while(a<=b) {
			if(a%c==0) {
			System.out.println(a);
			}
			a++;
		}
*/		
		
/*		int a=40;
		int b=200;
		int c=2;
		while(a<=200) {
			if(a%c==0) {
				System.out.println(a);
			}
			a++;
		}
*/
		
/*		int a=1;
		int sum=0;
		do {
			System.out.println(a);
			a++;
			sum+=a;
		}while(a<=100);
		System.out.println("sum ="+sum);
*/		
		
/*		int a=1;
		int sum=0;
		do {
			if(a%5==0&&a%3!=0) {
			sum++;
			}
			a++;
		}while(a<=100);
		System.out.println(sum);
*/
		
		
		
/*		Scanner myScanner=new Scanner(System.in);
		char answer=' ';
		do{
			System.out.println("使出五连鞭");
			System.out.println("还钱吗？");
			answer=myScanner.next().charAt(0);
			
		}while(answer!= 'y');
		System.out.println("算你识相");
*/		

		
		
/*		Scanner myScanner=new Scanner (System.in);
		double ssum=0;
		int good=0;
		int stuNum=5;
		int classNum=3;
		for(int b=1;b<=classNum;b++) {
			double sum=0;
			for(int a=1;a<=stuNum;a++) {
			System.out.println("请输入第"+ b+"个班"+"第"+a+"个同学的成绩");
			double score=myScanner.nextDouble();
			if(score>=60) {
				good++;
			}
			sum+=score;
			}
			System.out.println("第"+b+"个班级的平均分为"+ sum/stuNum);
			ssum+=sum;
		}
		System.out.println("三个班的总平均分为"+ssum/(classNum*stuNum));
		System.out.println("三个班的及格人数为"+good);
*/
		
		
/*		int a=1;
		int b=1;
		for(b=1;b<=9;b++) {
			
			int count=b-1;
			for(a=b;a<=9;a++) {
			count++;	
			System.out.println(b+"*"+count+"="+ b*count);
			}
		}
*/		
		
		
		
/*		int a=40;
		for(int cengshu=1;cengshu<=a;cengshu++) { 
			for(int space=1;space<=a-cengshu;space++) {
				System.out.print(" ");
			}
			for(int geshu=1;geshu<=2*cengshu-1;geshu++) {
			if(geshu==1||geshu==2*cengshu-1||cengshu==a)	{
			System.out.print("*");
			}else {
				System.out.print(" ");

			}
		}
			System.out.println();

		}
*/
/*		int i=1;
		int sum=0;
		for(;i<=100;i++) {
			sum+=i;
			if(sum>20) {
				System.out.println(sum);
				break;
			}
		}
		System.out.println(sum);
*/
		
/*		Scanner myScanner = new Scanner(System.in);
		for(int j=1;j<=3;j++) {
			System.out.println("请输入用户名");
			String name = myScanner.next();
			if(name.equals("丁真")) {
				System.out.println("请输入密码");
				int pass=myScanner.nextInt();
				if(pass ==666) {
					System.out.println("登录成功");
					break;
				}else {
					System.out.println("您还有"+(3-j)+"次机会");
				}
			}else {
				System.out.println("您还有"+(3-j)+"次机会");
			}

		}
*/
		
/*		Scanner myScanner= new Scanner(System.in);
		String name = "";
		String pass = "";
		int chance =3;
		for( int i =1; i<=chance ;i++) {
			System.out.println("请输入用户名");
			name = myScanner.next();
			System.out.println("请输入密码");
			pass = myScanner.next();
			if("丁真".equals(name)&&"666".equals(pass)) {
				System.out.println("恭喜登录成功");
				break;
			}
			System.out.println("您还有"+(chance-i)+"次机会");
		}
*/		
		
		
/*		label1:
		for(int i = 0;i <2;i++) {
			label2:	
			for(int j=0;j<=4;j++) {
					if(j==2) {
						continue label1;
					}
					System.out.println(j);
				}
			}
*/		

//
//		double money =50000;
//		int cishu =0;
//		while(money>=1000){
//			if(money>50000) {
//				money = money-money*0.05;
//			}
//			if(money<=50000) {
//				money =money-1000;
//			}
//				cishu++;
//	
//			}
//		System.out.println("一共可通过"+cishu+"次");
		
		
		
//		double money = 100;
//		int ciShu = 0;
//		while(true) {
//			if(money>50000) {
//				money*=0.95;
//				ciShu++;
//			}else if(money>=1000) {
//				money-=1000;
//				ciShu++;
//			}else {
//				break;
//			} 
//		}
//		System.out.println("可以过"+ciShu+"次路口");
		
		
		
//		int a = 154;
//		int a1 = a/100;
//		int a2 = a%100/10;
//		int a3 = a%10;
//		if(a1*a1*a1+a2*a2*a2+a3*a3*a3==a) {
//			System.out.println("是水仙花数");
//		}else {
//			System.out.println("不是水仙花数");
//
//		}
		 


//		int geShu =0;
//		for(int i =1;i<=100;i++) {
//			if(i%5!=0) {
//				System.out.print("\t"+ i +" ");
//				geShu++;
//				if(geShu%5==0) {
//					System.out.print("\n");
//
//				}
//			}
//		}
		
		
		
//		 
//		double i = 1;
//		int j = 1;
//		double sum = 0;
//		for(;j<=100;j++) {
//			if(j%2!=0) {
//				sum+=i/j;
//			}else {
//				sum-=i/j;
//			}
//		}
//		System.out.println(sum);
		
		
		
		
//		for(char a='a'; a<='z' ;a++) {
//			System.out.print(a + " ");
//		}
//		System.out.print("\n");
//		for(char b ='Z'; b>='A' ;b--) {
//			System.out.print(b + " ");
//		}
		
		
		
		
		
		int k =0;
		for(int j =1;j<=100;j++) {
			for(int i = 0;i<=j;i++) {
				k+=i;  
			}
		}
		System.out.println(k);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
	}
}