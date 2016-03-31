import java.util.Scanner;

public class benjin {
    double bj;
	void benjin(){
		Scanner scanner = new Scanner(System.in);
	    System.out.print("请输入你所需要的总值:");
		double sum = scanner.nextDouble();
		System.out.print("请输入你所需要的存储年:");
	    int year = scanner.nextInt();
	    System.out.print("请输入利率:");
	    double ll = scanner.nextDouble();
	    System.out.print("请输入复利次数:");
	    int i = scanner.nextInt();
	    ll=Math.pow((1+ll/i),i)-1;
	    bj=sum/Math.pow(1+ll,year);
	    System.out.print("正在输出:");
	    System.out.printf("所需要本金%lf",bj);  
	}

	public double CalculateA(double sum, int year, double ll, int i) {
		// TODO Auto-generated method stub
		ll=Math.pow((1+ll/i),i)-1;
	    bj=sum/Math.pow(1+ll,year);
		return bj;
	}


}
