import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;



public class test {
	 
	@Test
	public void fulitest(){
		System.out.print("\n����:  ");
		double wh = new fuli().CalculateA(100,1,0.2,2);
		System.out.print(wh);
		//��ȷ������λС��
		BigDecimal   b   =   new   BigDecimal(wh);  
		wh   =   b.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();  
		
		boolean test=false;
		if(wh-121.00==0)
			test=true;
		else
			test=false;
		assertEquals(true,test);
		
	}
	@Test
	public void danlitest(){
	System.out.print("\n����:  ");
	double wh = new danli().CalculateA(100,1,0.2);
	System.out.print(wh);
	
	BigDecimal   b   =   new   BigDecimal(wh);  
	wh   =   b.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();  
	
	boolean test=false;	
	if(wh-120.0==0)
		test=true;
	else
		test=false;
	assertEquals(true,test);
	}
	
	@Test
	public void touzitest(){
		System.out.print("\n����Ͷ��:  ");
		double wh = new touzi().CalculateA(100,0.2,10);
		System.out.print(wh);
		
		BigDecimal   b   =   new   BigDecimal(wh);  
		wh   =   b.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();
		
		boolean test=false;		
		if(wh-3115.04==0)
			test=true;
		else
			test=false;
		assertEquals(true,test);
	}
	
	@Test
	public void huankuangtest(){
		System.out.print("\n���ڻ���:  ");
		double wh = new huankuan().CalculateA(100,0.2,10);
		System.out.print(wh);
		
		BigDecimal   b   =   new   BigDecimal(wh);  
		wh   =   b.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();
		
		boolean test=false;		
		if(wh-24.00==0)
			test=true;
		else
			test=false;
		assertEquals(true,test);
			
	}
	
	@Test
	public void benjintest(){
		System.out.print("\nͶ�뱾��:  ");
		double wh = new benjin().CalculateA(100,10,0.2,2);
		System.out.print(wh);
		
		BigDecimal   b   =   new   BigDecimal(wh);  
		wh   =   b.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();
		
		boolean test=false;		
		if(wh-14.86==0)
			test=true;
		else
			test=false;
		assertEquals(true,test);
			
	}
	
	@Test
	public void lilvtest(){
		System.out.print("\n����:  ");
		double wh = new lilv().CalculateA(100,200,10,3);
		System.out.print(wh);
		
		BigDecimal   b   =   new   BigDecimal(wh);  
		wh   =   b.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();
		
		boolean test=false;		
		if(wh-0.07==0)
			test=true;
		else
			test=false;
		assertEquals(true,test);
			
	}
	
	@Test
	public void shijiantest(){
		System.out.print("\nʱ��:  ");
		double wh = new shijian().CalculateA(100,200,0.01,3);
		System.out.print(wh);
		
		BigDecimal   b   =   new   BigDecimal(wh);  
		wh   =   b.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();
		
		boolean test=false;		
		if(wh-69.43==0)
			test=true;
		else
			test=false;
		assertEquals(true,test);
			
	}

	

}
