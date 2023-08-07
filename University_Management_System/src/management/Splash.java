package management;

import javax.swing.*;
import java.awt.*;



@SuppressWarnings("serial")
public class Splash extends JFrame implements Runnable{
	Thread t;
	Splash(){
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("first.jpg"));
		
//		ImageIcon i1 = new ImageIcon(Splash.class.getResource("/first.png"));
		
		Image i2=i1.getImage().getScaledInstance(1350,870,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		add(image); //we can't add image icon object directly so firstly pass into the jlabel then jlabel object is passed
		
		
		t= new Thread(this);
		t.start();
//		setLocation(100,50);
//		setSize(1350,870);
		
		setVisible(true);
		int x=1;
		for (int i=2;i<=600;i+=4,x++)
		{
			setLocation(600-((i+x)/2),350-(i/2));
			setSize(i+4*x,i+(3*x/2));
			try {
				Thread.sleep(2);
			}catch(Exception e) {}
		}
	}
	
	public void run() {
		try {
			Thread.sleep(5000);
			setVisible(false);
			
			//Next Frame
			new Login();
		}
		catch(Exception e) {
			
		}

	}
	
		public static void main(String [] args){
			new Splash();
		}
}
