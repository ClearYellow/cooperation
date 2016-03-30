import java.util.Scanner;

public class lilv {
	    double ll;	
	void ll(){
		Scanner scanner = new Scanner(System.in);
	    System.out.print("请输入本金:");
	    double bj = scanner.nextDouble();
	    System.out.print("请输入你所需要的总值:");
	    double sum = scanner.nextDouble();
	    System.out.print("输入所要存储年:");
	    int year = scanner.nextInt();
	    System.out.print("输入复利次数:");
	    int i = scanner.nextInt();
	    System.out.print("正在输出:");
	    /*sum=bj*(Math.pow(1+ll,n));
	    ll=Math.pow((1+ll/i),i)-1;*///推导出
	    ll=i*(Math.pow(Math.pow(sum/bj,1.0/year),1.0/i)-1);
	    System.out.printf("所得:%lf",ll);
	}

	public double CalculateA(double bj, double sum, int year, int i) {
		// TODO Auto-generated method stub
		ll=i*(Math.pow(Math.pow(sum/bj,1.0/year),1.0/i)-1);
		return ll;
	}

}
