import java.util.Scanner;

public class shijian {
	double year;	
	void shijian(){
		Scanner scanner = new Scanner(System.in);
	    System.out.print("�����뱾��:");
	    double bj = scanner.nextDouble();
	    System.out.print("������������Ҫ����ֵ:");
	    double sum = scanner.nextDouble();
	    System.out.print("��������:");
	    double ll = scanner.nextDouble();
	    System.out.print("���븴������:");
	    int i = scanner.nextInt();
	    System.out.print("�������:");
	    ll=Math.pow((1+ll/i),i)-1;
	    year=Math.log(sum/bj)/Math.log(1+ll);
	    System.out.printf("����:%lf",year);
	}

	public double CalculateA(double bj, double sum, double ll, int i) {
		// TODO Auto-generated method stub
		ll=Math.pow((1+ll/i),i)-1;
	    year=Math.log(sum/bj)/Math.log(1+ll);
		return year;
	}
	


}
