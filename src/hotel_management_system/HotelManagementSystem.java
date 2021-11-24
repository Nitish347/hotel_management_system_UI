package hotel_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HotelManagementSystem extends JFrame implements ActionListener {
    HotelManagementSystem() {
        setSize(1920, 1080);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel_management_system/icons/first.jpg"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0,0,2888,5135);
        add(l1);

        JLabel l2 = new JLabel("Hotel Management System");
        l2.setBounds(350,40,1000,100);
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("serif",Font.PLAIN, 80));
        l1.add(l2);

        JButton b1 = new JButton("Next");
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        b1.setBounds(1300,700,150,30);
        l1.add(b1);
        b1.addActionListener(this);

        //setLayout(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new Log_in().setVisible(true);
        this.setVisible(false);
    }

    public static void main(String[] args) {
        new HotelManagementSystem();

    }
}
