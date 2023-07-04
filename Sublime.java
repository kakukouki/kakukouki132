//import java.util.Scanner;
public class Sublime{
	public static void main(String[] args) {
		
		
//		Scanner myScanner = new Scanner(System.in);
//		double[] scores ;
//		scores =new double[5];
//		for (int i = 0 ; i < scores.length  ; i++) {
//			System.out.println("请输入第"+(i+1)+"个元素的值");
//			scores[i] = myScanner.nextDouble();
//		}
//		System.out.println("数组的元素如下：");
//		for(int i = 0;i < scores.length ;i++) {
//			System.out.println("第"+(i+1)+"个元素的值="+scores[i]);
//		}
		
//		int[] date = {5,7,78,23,678,234};
//		int[] date1 = new int[6];
//		date1[1] = 5;		date1[2] = 7;
//		date1[3] = 78;		date1[4] = 23;
//		date1[5] = 678;		date1[6] = 234;
//		System.out.println(date);
//		System.out.println(date1);


//		char[] zimu = new char[26];
//		for(int i=0;i<zimu.length;i++) {
//			zimu[i] = (char)('A'+i);
//		}
//		System.out.println("数组为：");
//		for(int i=0;i<zimu.length;i++) {
//			System.out.print(zimu[i] + " ");
//		}
		
//		int[] shuzu = {4,-1,89,5,19,789,90,4567};
//		int max =shuzu[0];
//		int maxIndex = 0;
//		for(int i=0;i< shuzu.length;i++) {
//			if(max<shuzu[i]) {
//				max = shuzu[i];
//				maxIndex = i;
//			}
//		}
//		System.out.println("最大值为"+max+"它的下标为"+maxIndex);

//		Scanner myScanner = new Scanner(System.in);
//		double[]  hens=new double[6];
//		double  mad = 0;
//		double  pin = 0;
//		 for(int i = 0; i < hens.length;i++) {
//			 System.out.print("请输入第"+(i+1)+"只鸡的重量:");
//			 hens[i] = myScanner.nextDouble ();
//		 }
//		 for(int i = 0; i < hens.length;i++) {
//			 mad+=hens[i];
//		 }
//		 pin=mad/hens.length;
//		 System.out.println("鸡的总重量:"+ mad);
//		 System.out.println("鸡的平均重量:"+ pin);

		
//数组拷贝： 不能在栈里直接类似值拷贝，需要在堆里new一个	新数据空间，然后循环数据空间进行单个值拷贝
//		int[] jjj = {9,8,7,6};
//		
//		int[] kkk = new int[jjj.length];
//		for (int i = 0;i< jjj.length;i++) {
//			kkk[i] = jjj[i];
//		}
//		kkk[3] = 200;
//		for (int i = 0;i< jjj.length;i++) {
//		 System.out.print(kkk[i]+" ");
//		}
//		 System.out.println();
//		for (int i = 0;i< jjj.length;i++) {
//		 System.out.print(jjj[i]+" ");
//			}
		
		
//		int[] jjj = {1,2,3,4,5,6};
//		
//		for(int i = 0; i < jjj.length/2; i++) {
//			int mid = jjj[jjj.length-1-i];
//			jjj[jjj.length-1-i]=jjj[i];
//			jjj[i] = mid;
//		}
//		for(int i = 0; i < jjj.length; i++) {
//			 System.out.print(jjj[i]+" ");
//		}

// 数组扩容缩减
//		Scanner myScanner = new Scanner(System.in);
//		int[] ghj = {1,2,3};
//		do {
//			int[] jhg = new int[ghj.length+1];
//			for(int i=0;i<ghj.length;i++) {
//				jhg[i] = ghj[i];
//			}
//			System.out.print("请输入你要添加的数");
//			int num = myScanner.nextInt();
//			jhg[jhg.length-1]=num;
//			ghj = jhg;
//			for(int i=0;i<ghj.length;i++) {
//				System.out.print(ghj[i] +"\t");	
//			}
//			System.out.print( "是否继续添加？y/n");
//			char key = myScanner.next().charAt(0);
//			if(key=='n') {
//				break;
//			}
//		}while(true);
		
//		Scanner myScanner = new Scanner(System.in);
//		int[] aaa = {1,2,3,4,5};
//		do {
//			int[] bbb = new int[aaa.length-1];
//			for(int i=0; i<aaa.length-1 ;i++) {
//				bbb[i] = aaa[i];
//			}
//			aaa = bbb;
//			for(int i=0; i<aaa.length ;i++) {
//				System.out.print(aaa[i]);
//			}
//			System.out.print("是否继续缩减？ y/n");
//			char key = myScanner.next().charAt(0);
//				if(aaa.length == 1 && key != 'n') {
//					System.out.println("无法继续缩减");
//					break;
//				}
//				if(key == 'n') {
//					break;
//				}
//		}while(true);
		
		
		
//冒泡排序
//		
//		int[] aaa = {4,1,67,34,89,-8,7,8,1};
//		
//		
//		for(int j = 0; j < aaa.length-1 ; j++) {
//			for(int i = 0; i < aaa.length-1-j ; i++) {
//				if(aaa[i]>aaa[i+1]) {
//					int mid = aaa[i];
//					aaa[i] = aaa[i+1];
//					aaa[i+1] = mid;
//					}
//				}		
//		}
//		for(int a = 0; a < aaa.length ;a++) {
//			System.out.print( aaa[a] +"\t");
//		}
		
		
//数组查找匹配		
//		Scanner myScanner = new Scanner(System.in);
//		String[] names = {"郭鸿基","优惠价","风格化","退路分"};
//		System.out.println("请输入您要查找的内容: ");
//		String find = myScanner.next();
//		int mark = -1;
//		for(int i = 0; i < names.length; i++) {
//			if(find.equals(names[i])) {
//				System.out.println("恭喜您找到了" + names[i]+ "它是第" + (i+1) + "个");
//				mark = i;
//				break;
//			}
//		}			
//			if(mark==-1) {
//			System.out.println("很遗憾，没有找到！");
//			}

		
// 二维数组
//		int[][] ghj = {{0,0,8,0,0},{1,1,1,1},{2,2,2},{3,3}};
//		
//		for(int i = 0; i < ghj.length; i++) {
//			for(int j = 0;j <ghj[i].length; j++) {
//				System.out.print(ghj[i][j]+"\t" );
//			}
//			System.out.println( );
//		}
		
		
//		int[][] arr = {{4,6},{1,4,5,7},{-2}};	
//		int sum = 0;
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + "\t");
//				sum+=arr[i][j];
//			}
//		}
//		System.out.print( "\n"+"总和为" + sum);

		
		
//		int[][] yh = new int[20][];
//		for(int i = 0; i < yh.length; i++) {
//			yh[i] = new int[i+1];
//			for(int j = 0; j < yh[i].length; j++) {
//				if(j == 0 || j == yh[i].length-1) {
//					yh[i][j] = 1;
//				}else {
//					yh[i][j] = yh[i-1][j] +yh[i-1][j-1];
//				}
//			}
//		}
//		for(int i = 0; i < yh.length; i++) {
//			for(int j = 0; j < yh[i].length; j++) {
//				System.out.print(yh[i][j] + "\t");
//			}
//			System.out.print("\n");
//		}
		
//		int[][] yangHui = new int[14][];
//		for(int i = 0; i < yangHui.length; i++) {
//			yangHui[i] = new int[i+1];
//			for( int j = 0; j < yangHui[i].length; j++) {
//				if(j == 0 || j == yangHui[i].length-1) {
//					yangHui[i][j] = 1;
//				}else {
//					yangHui[i][j] = yangHui[i-1][j] + yangHui[i-1][j-1];
//				}
//			}
//		}
//		for(int i = 0; i < yangHui.length; i++) {
//			for( int j = 0; j < yangHui[i].length; j++) {
//				System.out.print(yangHui[i][j] + "\t");
//			}
//			System.out.println();
//		}
		
		
// 		1. B D		
//		2. blue
//		3. 1 3 5 7
//		Scanner myScanner = new Scanner(System.in);
//		int[] shuzu = {10,12,45,90};
//		for( int i = 0; i < shuzu.length; i++) {
//			int[] shuzu1 = new int[shuzu.length+1];
//			System.out.print("请输入要插入的数");
//			int math = myScanner.nextInt();
//			if(math > shuzu[i] && math < shuzu[i+1]) {
//				int mid =shuzu[i];
//				shuzu[i] = math;
//				math = mid;
//			}
//		}
//		for( int i = 0; i < shuzu1.length; i++) {
//			System.out.print(shuzu1[i]);
//		}
		
		
		
		
		
		
		


		
		
		
		
	}
}