package hotel_management_system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Log_in extends JFrame implements ActionListener {
    JLabel l2,l1;
    JTextField t1;
    JTextField t2;
    JButton b2,b1;
    Log_in() {

        l1 = new JLabel("Username");
        l1.setBounds(40, 20, 100, 30);
        add(l1);

        l2 = new JLabel("Password");
        l2.setBounds(40, 70, 100, 30);
        add(l2);

        t1 = new JTextField();
        t1.setBounds(150, 25, 200, 25);
        add(t1);

        t2 = new JPasswordField();
        t2.setBounds(150, 75, 200, 25);
        add(t2);

        b2 = new JButton("Login");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(200, 120, 100, 20);
        add(b2);
        b2.addActionListener(this);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel_management_system/icons/login.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(380, 8, 200, 200);
        add(l3);

        setBounds(500, 200, 600, 300);
        setLayout(null);
        setVisible(true);
    }
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == b2) {
                new Reception().setVisible(true);
                this.setVisible(false);
            }
        }
    public static void main(String[] args) {

        new Log_in();
    }

}
