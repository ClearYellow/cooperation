import java.util.Scanner;

public class benjin {
    double bj;
	void benjin(){
		Scanner scanner = new Scanner(System.in);
	    System.out.print("������������Ҫ����ֵ:");
		double sum = scanner.nextDouble();
		System.out.print("������������Ҫ�Ĵ洢��:");
	    int year = scanner.nextInt();
	    System.out.print("����������:");
	    double ll = scanner.nextDouble();
	    System.out.print("�����븴������:");
	    int i = scanner.nextInt();
	    ll=Math.pow((1+ll/i),i)-1;
	    bj=sum/Math.pow(1+ll,year);
	    System.out.print("�������:");
	    System.out.printf("����Ҫ����%lf",bj);  
	}

	public double CalculateA(double sum, int year, double ll, int i) {
		// TODO Auto-generated method stub
		ll=Math.pow((1+ll/i),i)-1;
	    bj=sum/Math.pow(1+ll,year);
		return bj;
	}


}
