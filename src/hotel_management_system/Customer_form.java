package hotel_management_system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Customer_form  extends JFrame implements ActionListener {
    JButton b1;
    Customer_form(){
        setBounds(400, 150, 800, 600);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel_management_system/icons/fourth.jpg"));
        JLabel p1 = new JLabel(i1);
        p1.setBounds(450,0,400,1000);
        add(p1);

        JLabel l1 = new JLabel("New Customer Form");
        l1.setBounds(100,0,1000,80);
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("serif",Font.PLAIN, 30));
        add(l1);

        JLabel l2 = new JLabel("ID TYPE :");
        l2.setBounds(30,80,50,50);
        add(l2);


        JLabel l3 = new JLabel("ID Number :");
        l3.setBounds(30,120,100,50);
        add(l3);

        JLabel l9 = new JLabel("Name :");
        l9.setBounds(30,160,100,50);
        add(l9);

        JLabel l4 = new JLabel("Gender :");
        l4.setBounds(30,200,100,50);
        add(l4);

        JLabel l5 = new JLabel("Allocated Room Number :");
        l5.setBounds(30,240,200,50);
        add(l5);

        JLabel l6 = new JLabel("Checked In :");
        l6.setBounds(30,280,100,50);
        add(l6);

        JLabel l7 = new JLabel("Checked Out :");
        l7.setBounds(30,320,100,50);
        add(l7);

        JLabel l8 = new JLabel("Deposit :");
        l8.setBounds(30,360,100,50);
        add(l8);

        String []id = {"Passport","Voter ID","Aadhar Card","Driving license"};
        JComboBox c1 = new JComboBox(id);
        c1.setBounds(250,95,200,20);
        add(c1);

        JTextField t1 = new JTextField();
        t1.setBounds(250,135,200,20);
        add(t1);

        JTextField t2 = new JTextField();
        t2.setBounds(250,175,200,20);
        add(t2);

        JRadioButton r1 = new JRadioButton("Male");
        r1.setBounds(250,215,100,20);
        add(r1);
        JRadioButton r2 = new JRadioButton("Female");
        r2.setBounds(370,215,80,20);
        add(r2);
        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        JTextField t3 = new JTextField();
        t3.setBounds(250,255,200,20);
        add(t3);

        JTextField t4 = new JTextField();
        t4.setBounds(250,295,200,20);
        add(t4);

        JTextField t5 = new JTextField();
        t5.setBounds(250,335,200,20);
        add(t5);

        JTextField t6 = new JTextField();
        t6.setBounds(250,375,200,20);
        add(t6);

        b1 = new JButton("BOOK");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(150,450,100,30);
        b1.addActionListener(this);
        add(b1);

        setLayout(null);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            this.setVisible(false);
        }
    }
    public static void main(String[] args) {
        new Customer_form();
    }
}
