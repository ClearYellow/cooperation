import java.util.Scanner;

public class lilv {
	    double ll;	
	void ll(){
		Scanner scanner = new Scanner(System.in);
	    System.out.print("�����뱾��:");
	    double bj = scanner.nextDouble();
	    System.out.print("������������Ҫ����ֵ:");
	    double sum = scanner.nextDouble();
	    System.out.print("������Ҫ�洢��:");
	    int year = scanner.nextInt();
	    System.out.print("���븴������:");
	    int i = scanner.nextInt();
	    System.out.print("�������:");
	    /*sum=bj*(Math.pow(1+ll,n));
	    ll=Math.pow((1+ll/i),i)-1;*///�Ƶ���
	    ll=i*(Math.pow(Math.pow(sum/bj,1.0/year),1.0/i)-1);
	    System.out.printf("����:%lf",ll);
	}

	public double CalculateA(double bj, double sum, int year, int i) {
		// TODO Auto-generated method stub
		ll=i*(Math.pow(Math.pow(sum/bj,1.0/year),1.0/i)-1);
		return ll;
	}

}
