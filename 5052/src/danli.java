import java.util.Scanner;

public class danli {
	double sum;
	void danli(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("�����뱾��:");
		double bj = scanner.nextDouble();
		System.out.print("������洢��:");
		int year = scanner.nextInt();
		System.out.print("����������");
		double ll = scanner.nextDouble();
		System.out.print("�������:");
		sum=bj+bj*year*ll;
	    System.out.printf("����%lf",sum);
		
	}


	public double CalculateA(int bj, int year, double ll) {
		// TODO Auto-generated method stub
		sum=bj+bj*year*ll;
		return sum;
	}

}
