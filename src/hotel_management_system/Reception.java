package hotel_management_system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception  extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4;
    Reception() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel_management_system/icons/third.jpg"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(200,0,640,426);
        add(l1);
        b1 = new JButton("New Customer Form");
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        b1.setBounds(20,20,150,30);
        add(b1);
        b1.addActionListener(this);

        b2 = new JButton("Update Room");
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLACK);
        b2.setBounds(20,140,150,30);
        add(b2);
        b2.addActionListener(this);

        b3 = new JButton("Add Employee");
        b3.setBackground(Color.WHITE);
        b3.setForeground(Color.BLACK);
        b3.setBounds(20,260,150,30);
        add(b3);
        b3.addActionListener(this);

        setBounds(400, 150, 800, 426);
        setLayout(null);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            new Customer_form().setVisible(true);
        }
        if (e.getSource() == b2) {
            new Update().setVisible(true);
        }
        if (e.getSource() == b3) {
            new Add_Employee().setVisible(true);
        }
    }
    public static void main(String[] args) {
        new Reception();
    }
}
