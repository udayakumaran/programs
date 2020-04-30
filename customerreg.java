import java.sql.*;
import java.aw t.*;
import java.awt.event.*;
import javax.swing.*;
class customerreg implements ActionListener
{
JFrame frame1;
JLable l,l1,l2,l3,l4;
JTextField t,t1,t2,t3,t4;
JButton b,b1,b2,b3,b4,b5;
JPanel p;
public static void main(String ar[])
{
new customerreg();
}
customerreg ()
{
frame1 = new JFrame("NEW REGISTRATION");
p = new JPanel();
frame1.getContentPane().add(p);
Font f1 = new Font("serif",Font.PLAIN,20);
l = new JLable("ID");
l.setFont(f1); 
l.setForeground(Color.blue);
l1 = new JLable("NAME");
l1.setFont(f1); 
l1.setForeground(Color.cyan);
l2 = new JLable("MOBILENO");
l2.setFont(f1); 
l2.setForeground(Color.orange);
l3 = new JLable("MailiD");
l3.setFont(f1); 
l3.setForeground(Color.magenta);
l4 = new JLable("State");
l4.setFont(f1); 
l4.setForeground(Color.blue);
t = new JTextField(30);
t1 = new JTextField(30);
t2 = new JTextField(30);
t3 = new JTextField(30);
t4 = new JTextField(30);
b = new JButton("Store");
b1 = new JButton("update");
b2 = new JButton("delete");
b3 = new JButton("Clear");
b4 = new JButton("close");
b5 = new JButton("FInd");
frame1.setSize(300,300);
frame1.setVisible(true);
p.setLayout(null);
p.add(b);
p.add(b1);
p.add(b2);
p.add(b3);
p.add(b4);
p.add(b5);
p.add(l);
p.add(l1);
p.add(l2);
p.add(l3);
p.add(l4);
p.add(t);
p.add(t1);
p.add(t2);
p.add(t3);
p.add(t4);
l.setBounds(100,150,120,20);
t.setBounds(270,150,120,20);

l1.setBounds(100,200,120,20);
t1.setBounds(270,200,120,20);

l2.setBounds(100,250,120,20);
t2.setBounds(270,250,120,20);

l3.setBounds(100,290,120,30);
t3.setBounds(270,300,120,20);

l4.setBounds(100,330,120,30);
t4.setBounds(270,340,120,20);
b.setBounds(100,450,120,20);
b1.setBounds(250,450,120,20);
b2.setBounds(390,450,120,20);
b3.setBounds(530,450,120,20);
b4.setBounds(680,450,120,20);
b5.setBounds(830,450,120,20);
b.addActionListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);


}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b)
{
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
PreparedStatement p = c.prepareStatement("Insert into customer value(?,?,?,?,?)");
p.setString(1,t.getText());
p.setString(2,t1.getText());
p.setString(3,t2.getText());
p.setString(4,t3.getText());
p.setString(5,t4.getText());
p.executeUpdate();

}
catch(Exception e)
{
JOptionPane.showMessageDialog(frame1, new String("Exception"+e));
}
}
if(ae.getSource()==b1)
{
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
PreparedStatement p = c.prepareStatement("Update customer set name = '"+t1.getText()+"',MobileNo ='"+t2.getText()+"',MailIid ='"+t3.getText()+"',State='"+t4.getText()+"',where id='"+t.getText()+"'");
p.executeUpdate();
JOptionPane.showMessageDialog(frame1, new String("update customer detail"));
}
catch(Exception e)
{
JOptionPane.showMessageDialog(frame1, new String("Exception"+e));
}
}
if(ae.getSource==b2())
{
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
PreparedStatement p = c.prepareStatement("Delete from customer where id='"+t.getText()+"'");
JOptionPane.showMessageDialog(frame1, new String("deleted customer detail"));

}
catch(Exception e)
{
JOptionPane.showMessageDialog(frame1, new String("Exception"+e));

}
}
if(ae.getSource()==b3)
{
try
{
t.setText("");
t1.setText("");
t2.setText("");
t3.setText("");
t4.setText("");
}
catch(Exception e)
{
JOptionPane.showMessageDialog(frame1, new String("Exception"+e));

}
}
if(ae.getSource()==b4)
{
System.exit(0);
}
if(ae.getSource()==b5)
{
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
Statement s = c.createStatement();
ResultSet r = s.executeQuery("Select * from customer where id = '"+t.getText()+"'");
while(r.next())
{
t1.setText(r.getString("name"));
t2.setText(r.getString("mobileNo"));
t3.setText(r.getString("mailid"));
t4.setText(r.getString("State"));

}
}
catch(Exception e)
{
JOptionPane.showMessageDialog(frame1, new String("Exception"+e));

}
}
}

}