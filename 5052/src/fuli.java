import java.util.Scanner;

public class fuli {
		double sum;
	void fuli(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("�����뱾��:");
		double bj = scanner.nextDouble();
		System.out.print("������洢��:");
		int year = scanner.nextInt();
		System.out.print("����������");
		double ll = scanner.nextDouble();
		System.out.print("�����븴������");
		int i = scanner.nextInt();
		System.out.print("�������:");
	    ll=Math.pow((1+ll/i),i)-1;
	    sum=bj*(Math.pow(1+ll,year)); 
	    System.out.printf("����%lf",sum);		
	}
	

	public double CalculateA(double bj, int year, double ll, int i) {
		// TODO Auto-generated method stub
		ll=Math.pow((1+ll/i),i)-1;
	    sum=bj*(Math.pow(1+ll,year));
		return sum;
	}

}
