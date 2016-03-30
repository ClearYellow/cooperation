import java.util.Scanner;

public class shijian {
	double year;	
	void shijian(){
		Scanner scanner = new Scanner(System.in);
	    System.out.print("请输入本金:");
	    double bj = scanner.nextDouble();
	    System.out.print("请输入你所需要的总值:");
	    double sum = scanner.nextDouble();
	    System.out.print("输入利率:");
	    double ll = scanner.nextDouble();
	    System.out.print("输入复利次数:");
	    int i = scanner.nextInt();
	    System.out.print("正在输出:");
	    ll=Math.pow((1+ll/i),i)-1;
	    year=Math.log(sum/bj)/Math.log(1+ll);
	    System.out.printf("所得:%lf",year);
	}

	public double CalculateA(double bj, double sum, double ll, int i) {
		// TODO Auto-generated method stub
		ll=Math.pow((1+ll/i),i)-1;
	    year=Math.log(sum/bj)/Math.log(1+ll);
		return year;
	}
	


}
