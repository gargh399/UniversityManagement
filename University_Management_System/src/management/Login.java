package management;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

@SuppressWarnings("serial")
public class Login extends JFrame implements ActionListener{
	
	JButton login,cancel;
	JTextField tfusername,tfpassword;
	
	Login(){
		
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel lblusername = new JLabel("Username");
		lblusername.setBounds(40,40,100,20);
		add(lblusername);
		
		tfusername = new JTextField();
		tfusername.setBounds(150,40,170,20);
		add(tfusername);
		
		JLabel lblpassword = new JLabel("Password");
		lblpassword.setBounds(40,80,100,20);
		add(lblpassword);
		
		tfpassword = new JPasswordField();
		tfpassword.setBounds(150,80,170,20);
		add(tfpassword);
		
		login =new JButton("Login");
		login.setBounds(40,140,120,30);
		login.setBackground(Color.BLACK);
		login.setForeground(Color.WHITE);
		login.addActionListener(this);
		login.setFont(new Font("Tahoma",Font.BOLD,15));
		add(login);
		
		cancel =new JButton("Cancel");
		cancel.setBounds(200,140,120,30);
		cancel.setBackground(Color.RED);
		cancel.setForeground(Color.WHITE);
		cancel.addActionListener(this);
		cancel.setFont(new Font("Tahoma",Font.BOLD,15));
		add(cancel);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("second.png"));
		Image i2=i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(320,5,200,200);
		add(image);
		
		setSize(520,250);
		setLocation(500,250);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == login)
		{
			String username= tfusername.getText();
			String password=tfpassword.getText();
			
			String query = "select * from login where username ='"+username+"' and password ='"+password+"'";
			try {
				conn c=new conn();
				ResultSet rs = c.s.executeQuery(query);
				
				if(rs.next()){
					setVisible(false);
					new Project();
				}else {
					JOptionPane.showMessageDialog(null,"Invalid username or password");
					setVisible(false);
				}
			}catch(Exception e){
				e.printStackTrace();	
			}
		}
		else if(ae.getSource () == cancel)
		{
			setVisible(false);
		}
		 
		
	}
	
	
	public static void main(String []args){
		
		new Login();
	}


	

}
