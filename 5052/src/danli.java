import java.util.Scanner;

public class danli {
	double sum;
	void danli(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入本金:");
		double bj = scanner.nextDouble();
		System.out.print("请输入存储年:");
		int year = scanner.nextInt();
		System.out.print("请输入利率");
		double ll = scanner.nextDouble();
		System.out.print("正在输出:");
		sum=bj+bj*year*ll;
	    System.out.printf("所得%lf",sum);
		
	}


	public double CalculateA(int bj, int year, double ll) {
		// TODO Auto-generated method stub
		sum=bj+bj*year*ll;
		return sum;
	}

}
