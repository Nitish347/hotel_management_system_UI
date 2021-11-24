package hotel_management_system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Add_Employee extends JFrame implements ActionListener {
    JButton b1;
    Add_Employee(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel_management_system/icons/sixth.png"));
        JLabel p1 = new JLabel(i1);
        p1.setBounds(350,100,600,300);
        add(p1);

        JLabel l1 = new JLabel("ADD EMPLOYEE");
        l1.setBounds(100,0,1000,80);
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("serif",Font.PLAIN, 30));
        add(l1);

        JLabel l2 = new JLabel("NAME :");
        l2.setBounds(30,80,50,50);
        add(l2);

        JLabel l3 = new JLabel("AGE :");
        l3.setBounds(30,120,100,50);
        add(l3);

        JLabel l9 = new JLabel("GENDER :");
        l9.setBounds(30,160,100,50);
        add(l9);

        JLabel l4 = new JLabel("JOB :");
        l4.setBounds(30,200,100,50);
        add(l4);

        JLabel l5 = new JLabel("SALARY :");
        l5.setBounds(30,240,200,50);
        add(l5);

        JLabel l6 = new JLabel("PHONE No. :");
        l6.setBounds(30,280,100,50);
        add(l6);

        JLabel l7 = new JLabel("AADHAR:");
        l7.setBounds(30,320,100,50);
        add(l7);

        JLabel l8 = new JLabel("EMAIL :");
        l8.setBounds(30,360,100,50);
        add(l8);

        JTextField t = new JTextField();
        t.setBounds(250,95,200,20);
        add(t);

        JTextField t1 = new JTextField();
        t1.setBounds(250,135,200,20);
        add(t1);

        String []gendre = {"Male","Female"};
        JComboBox c2 = new JComboBox(gendre);
        c2.setBounds(250,175,200,25);
        add(c2);

        String []job = {"House keeping","Kitchen staff","Room Service","Manager","Accountant","Chef"};
        JComboBox c1 = new JComboBox(job);
        c1.setBounds(250,215,200,25);
        add(c1);

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

        b1 = new JButton("SAVE");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(190,450,100,30);
        b1.addActionListener(this);
        add(b1);

        setBounds(400, 150, 900, 600);
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
        new Add_Employee();
    }
}
