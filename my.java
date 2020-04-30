import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class my extends JFrame implements ActionListener
{
JLabel head,l1,l2,l3,l4,l5,l6;
JTextField t1,t2,t3,t4,t5,t6;
JButton b1,b2,b3,b4;
JPanel p1;
my()
{
p1 = new JPanel();
setVisible(true);
setSize(500,500);
p1.setLayout(null);
head = new JLabel("ARITHEMATIC OPERATION");
l1 = new JLabel("value1");
l2 = new JLabel("value2");
l3 = new JLabel("Add");
l4 = new JLabel("sub");
l5 = new JLabel("mul");
l6 = new JLabel("div");
t1 = new JTextField(20);
t2 = new JTextField(20);
t3 = new JTextField(20);
t4 = new JTextField(20);
t5 = new JTextField(20);
t6 = new JTextField(20);
b1 = new JButton("add");
b2 = new JButton("sub");
b3 = new JButton("mul");
b4 = new JButton("div");
head.setBounds(300,50,100,30);
l1.setBounds(200,100,100,30);
l2.setBounds(200,150,100,30);
l3.setBounds(200,200,100,30);
l4.setBounds(470,200,100,30);
l5.setBounds(670,200,100,30);
l6.setBounds(850,200,100,30);
t1.setBounds(300,100,100,30);
t2.setBounds(300,150,100,30);
t3.setBounds(300,200,100,30);
t4.setBounds(500,200,100,30);
t5.setBounds(700,200,100,30);
t6.setBounds(900,200,100,30);
b1.setBounds(300,250,100,30);
b2.setBounds(500,250,100,30);
b3.setBounds(700,250,100,30);
b4.setBounds(900,250,100,30);
p1.add(head);
p1.add(l1);
p1.add(l2);
p1.add(l3);
p1.add(l4);
p1.add(l5);
p1.add(l6);
p1.add(t1);
p1.add(t2);
p1.add(t3);
p1.add(t4);
p1.add(t5);
p1.add(t6);
p1.add(b1);
p1.add(b2);
p1.add(b3);
p1.add(b4);
add(p1);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
int n = Integer.parseInt(t1.getText());
int n1 = Integer.parseInt(t2.getText());
int r = n + n1;
t3.setText(""+r);
}
if(e.getSource()==b2)
{
int n = Integer.parseInt(t1.getText());
int n1 = Integer.parseInt(t2.getText());
int r = n - n1;
t4.setText(""+r);
}
if(e.getSource()==b3)
{
int n = Integer.parseInt(t1.getText());
int n1 = Integer.parseInt(t2.getText());
int r = n * n1;
t5.setText(""+r);
}
if(e.getSource()==b4)
{
int n = Integer.parseInt(t1.getText());
int n1 = Integer.parseInt(t2.getText());
int r = n / n1;
t6.setText(""+r);
}
}
public static void main(String ar[])
{
new my();
}
}