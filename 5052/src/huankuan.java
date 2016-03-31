import java.util.Scanner;

public class huankuan {
    double sum;
	void huankuan()
	{
		Scanner scanner = new Scanner(System.in);
	    System.out.print("请输入借贷金额:");
	    double bj = scanner.nextDouble();
	    System.out.print("请输入借贷利率:");
	    double ll = scanner.nextDouble();
	    System.out.print("请输入借贷期限:");
	    int year = scanner.nextInt();
	    sum=bj*ll*Math.pow((1+ll),year)/Math.pow((1+ll),year-1); 
	    System.out.printf("\n得出：%lf\n",sum);
	}
	
	public double CalculateA(double bj, double ll, int year) {
		// TODO Auto-generated method stub
		sum=bj*ll*Math.pow((1+ll),year)/Math.pow((1+ll),year-1); 
		return sum;
	}
	

}
