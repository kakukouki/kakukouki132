public class KeBianCanShu{
	public static void main(String[]args) {
		
		HspMethods pp = new HspMethods();
		System.out.println(pp.sum(3,9,56,76,45));
		System.out.println(pp.showScore("郭鸿基",99,98,96.8,97.9));

		
		
	}
}

class HspMethods{
	public int sum(int... nums) {
		int res = 0;
		for(int i = 0; i < nums.length; i++) {
			res+=nums[i];
		}
		return res;
	}
	
	public String showScore(String a, double... nums) {
		double res = 0;
		for (int i = 0; i < nums.length; i++) {
			res+= nums[i];
		}
		return  "姓名为: " + a + "\n" + nums.length + "门课程成绩总和为：" + res; 
	}
	
	
	
}




















