import javax.swing.*;
import java.awt.*;
class swingx extends JFrame
{
JLabel l;
JTextField t;
JTextArea ta;
JButton b;
JComboBox cb;
JList lt;
JCheckBox ch1,ch2;
JRadioButton rb1,rb2;
public swingx()
{
setVisible(true);
setLayout(new FlowLayout());
setSize(500,500);
l = new JLabel("NAME");
t = new JTextField(20);
ta = new JTextArea(5,10);
JScrollPane jsp = new JScrollPane(ta);
b = new JButton("CLASS");
String country [] = {"india","australia","usa"};
cb = new JComboBox(country);
lt = new JList(country);
ch1 = new JCheckBox("JAVA");
ch2 = new JCheckBox("python");
rb1 = new JRadioButton("male");
rb2 = new JRadioButton("female");
ButtonGroup bg = new ButtonGroup();
bg.add(rb1);
bg.add(rb2);
add(l) ;
add(t) ;
add(jsp) ;
add(ch1) ;
add(ch2) ;
add(rb1) ;
add(rb2) ;
add(cb) ;
add(lt) ;
add(b) ; 

}
public static void main(String ar[])
{
new swingx();
}


} 