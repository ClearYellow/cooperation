import java.util.Scanner;

public class huankuan {
    double sum;
	void huankuan()
	{
		Scanner scanner = new Scanner(System.in);
	    System.out.print("�����������:");
	    double bj = scanner.nextDouble();
	    System.out.print("������������:");
	    double ll = scanner.nextDouble();
	    System.out.print("������������:");
	    int year = scanner.nextInt();
	    sum=bj*ll*Math.pow((1+ll),year)/Math.pow((1+ll),year-1); 
	    System.out.printf("\n�ó���%lf\n",sum);
	}
	
	public double CalculateA(double bj, double ll, int year) {
		// TODO Auto-generated method stub
		sum=bj*ll*Math.pow((1+ll),year)/Math.pow((1+ll),year-1); 
		return sum;
	}
	

}
