package management;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Project extends JFrame implements ActionListener{
	
	
	Project(){
		setSize(1620,980);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("third.jpg"));
		Image i2=i1.getImage().getScaledInstance(1550,920,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3); 
		add(image);
		
		JMenuBar mb= new JMenuBar();
		
		//information
		JMenu newInformation =new JMenu("New Information");
		newInformation.setForeground(Color.BLUE);
		mb.add(newInformation);
		
		JMenuItem facultyInfo =new JMenuItem("New Faculty Information");
		facultyInfo.setBackground(Color.WHITE);
		facultyInfo.setForeground(Color.BLACK);
		newInformation.add(facultyInfo);
		
		JMenuItem studentInfo =new JMenuItem("New Student Information");
		studentInfo.setBackground(Color.WHITE);
		studentInfo.setForeground(Color.BLACK);
		newInformation.add(studentInfo);
		
		
		//details
		JMenu details =new JMenu("View Details");
		details.setForeground(Color.RED);
		mb.add(details);
		
		JMenuItem facultydetails =new JMenuItem("View Faculty Details");
		facultydetails.setBackground(Color.WHITE);
		facultydetails.setForeground(Color.BLACK);
		details.add(facultydetails);
		
		JMenuItem studentdetails =new JMenuItem("View Student Details");
		studentdetails.setBackground(Color.WHITE);
		studentdetails.setForeground(Color.BLACK);
		details.add(studentdetails);
		
		
		//leave
		JMenu leave =new JMenu("Apply Leave");
		leave.setForeground(Color.BLUE);
		mb.add(leave);
		
		JMenuItem facultyleave =new JMenuItem("Faculty Leave");
		facultyleave.setBackground(Color.WHITE);
		facultyleave.setForeground(Color.BLACK);
		leave.add(facultyleave);
		
		JMenuItem studentleave =new JMenuItem("Student Leave");
		studentleave.setBackground(Color.WHITE);
		studentleave.setForeground(Color.BLACK);
		leave.add(studentleave);
		
		//leavedetails
		JMenu leavedetails =new JMenu("Leave Details");
		leavedetails.setForeground(Color.RED);
		mb.add(leavedetails);
		
		JMenuItem facultyleavedetails =new JMenuItem("Faculty Leave Details");
		facultyleavedetails.setBackground(Color.WHITE);
		facultyleavedetails.setForeground(Color.BLACK);
		leavedetails.add(facultyleavedetails);
		
		JMenuItem studentleavedetails =new JMenuItem("Student Leave Details");
		studentleavedetails.setBackground(Color.WHITE);
		studentleavedetails.setForeground(Color.BLACK);
		leavedetails.add(studentleavedetails);
		
		
		//Exams
		JMenu exam =new JMenu("Examination");
		exam.setForeground(Color.BLUE);
		mb.add(exam);
		
		JMenuItem examinationresults =new JMenuItem("Examination Results");
		examinationresults.setBackground(Color.WHITE);
		examinationresults.setForeground(Color.BLACK);
		exam.add(examinationresults);
		
		JMenuItem entermarks =new JMenuItem("Enter Marks");
		entermarks.setBackground(Color.WHITE);
		entermarks.setForeground(Color.BLACK);
		exam.add(entermarks);
		
		//Updateinfo
		JMenu Updateinfo =new JMenu("Update Details");
		Updateinfo.setForeground(Color.RED);
		mb.add(Updateinfo);
		
		JMenuItem updatefacultyinfo =new JMenuItem("Update Faculty Details");
		updatefacultyinfo.setBackground(Color.WHITE);
		updatefacultyinfo.setForeground(Color.BLACK);
		Updateinfo.add(updatefacultyinfo);
		
		JMenuItem updatestudentinfo =new JMenuItem("Update Student Details");
		updatestudentinfo.setBackground(Color.WHITE);
		updatestudentinfo.setForeground(Color.BLACK);
		Updateinfo.add(updatestudentinfo);
		
		//fees
		JMenu fee =new JMenu("Fee Details");
		fee.setForeground(Color.BLUE);
		mb.add(fee);
		
		JMenuItem feestructure =new JMenuItem("Fee Structure");
		feestructure.setBackground(Color.WHITE);
		feestructure.setForeground(Color.BLACK);
		fee.add(feestructure);
		
		JMenuItem feeform =new JMenuItem("Update Student Details");
		feeform.setBackground(Color.WHITE);
		feeform.setForeground(Color.BLACK);
		fee.add(feeform);
		
		//Utility
		JMenu Utility =new JMenu("Utility");
		Utility.setForeground(Color.RED);
		mb.add(Utility);
		
		JMenuItem notepad =new JMenuItem("Notepad");
		notepad.setBackground(Color.WHITE);
		notepad.setForeground(Color.BLACK);
		Utility.add(notepad);
		
		JMenuItem calculator =new JMenuItem("Calculator");
		calculator.setBackground(Color.WHITE);
		calculator.setForeground(Color.BLACK);
		calculator.addActionListener(this);
		Utility.add(calculator);
		
		//exit
		JMenu exit =new JMenu("Exit");
		exit.setForeground(Color.BLUE);
		mb.add(exit);
		
		JMenuItem ex =new JMenuItem("Exit"); //if i write exit here error of duplicate comes so ex only
		ex.setBackground(Color.WHITE);
		ex.setForeground(Color.BLACK);
		ex.addActionListener(this);
		exit.add(ex);
		
		
		
		setJMenuBar(mb);
		
		setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent ae) {
	
		String msg=ae.getActionCommand();
		if(msg.equals("Exit")) {
			setVisible(false);
		}
		else if (msg.equals("Calculator"))
		{
			try {
				Runtime.getRuntime().exec("calc.exe");
			}catch(Exception e){
				
			}
		}else if (msg.equals("Notepad"))
		{
			try {
				Runtime.getRuntime().exec("notepad.exe");
			}catch(Exception e){
				
			}
		}
		
	}
	
	public static void main(String [] args){
		new Project();
	}


	

}
