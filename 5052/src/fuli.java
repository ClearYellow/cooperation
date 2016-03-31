import java.util.Scanner;

public class fuli {
		double sum;
	void fuli(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入本金:");
		double bj = scanner.nextDouble();
		System.out.print("请输入存储年:");
		int year = scanner.nextInt();
		System.out.print("请输入利率");
		double ll = scanner.nextDouble();
		System.out.print("请输入复利次数");
		int i = scanner.nextInt();
		System.out.print("正在输出:");
	    ll=Math.pow((1+ll/i),i)-1;
	    sum=bj*(Math.pow(1+ll,year)); 
	    System.out.printf("所得%lf",sum);		
	}
	

	public double CalculateA(double bj, int year, double ll, int i) {
		// TODO Auto-generated method stub
		ll=Math.pow((1+ll/i),i)-1;
	    sum=bj*(Math.pow(1+ll,year));
		return sum;
	}

}
