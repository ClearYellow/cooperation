import java.util.Scanner;

public class touzi {
	    double sum;	
	void touzi(){
		Scanner scanner = new Scanner(System.in);
	    System.out.print("��������Ͷ��:");
	    double bj = scanner.nextDouble();
	    System.out.print("�������긴��������:");
	    double ll = scanner.nextDouble();
	    System.out.print("���������Ͷ������:");
	    int year = scanner.nextInt();
	    sum=bj*(1+ll)*(-1+Math.pow((1+ll),year))/ll;
	    System.out.printf("\n�ó���%lf\n",sum);
	}

	public double CalculateA(double bj, double ll, int year) {
		// TODO Auto-generated method stub
		sum=bj*(1+ll)*(-1+Math.pow((1+ll),year))/ll;
		return sum;
	}

}
