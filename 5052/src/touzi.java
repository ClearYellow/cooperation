import java.util.Scanner;

public class touzi {
	    double sum;	
	void touzi(){
		Scanner scanner = new Scanner(System.in);
	    System.out.print("请输入年投入:");
	    double bj = scanner.nextDouble();
	    System.out.print("请输入年复合增长率:");
	    double ll = scanner.nextDouble();
	    System.out.print("请输入持续投入年数:");
	    int year = scanner.nextInt();
	    sum=bj*(1+ll)*(-1+Math.pow((1+ll),year))/ll;
	    System.out.printf("\n得出：%lf\n",sum);
	}

	public double CalculateA(double bj, double ll, int year) {
		// TODO Auto-generated method stub
		sum=bj*(1+ll)*(-1+Math.pow((1+ll),year))/ll;
		return sum;
	}

}
