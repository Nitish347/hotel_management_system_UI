package hotel_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Update extends JFrame implements ActionListener {
    JButton b1;

    Update(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel_management_system/icons/fifth.jpg"));
        JLabel p1 = new JLabel(i1);
        p1.setBounds(480,60,600,300);
        add(p1);

        JLabel l1 = new JLabel("Update Room Status");
        l1.setBounds(60,0,1000,50);
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("serif",Font.PLAIN, 25));
        add(l1);

        JLabel l2 = new JLabel("Guest Name :");
        l2.setBounds(30,80,100,50);
        add(l2);

        JLabel l3 = new JLabel("Room Number :");
        l3.setBounds(30,120,100,50);
        add(l3);

        JLabel l4 = new JLabel("Availability :");
        l4.setBounds(30,160,100,50);
        add(l4);

        JLabel l5 = new JLabel("Clean Status :");
        l5.setBounds(30,200,100,50);
        add(l5);

        JTextField t1 = new JTextField();
        t1.setBounds(250,95,200,25);
        add(t1);

        JTextField t2 = new JTextField();
        t2.setBounds(250,135,200,25);
        add(t2);


        String []avail = {"Unoccupied","Occupied"};
        JComboBox c2 = new JComboBox(avail);
        c2.setBounds(250,175,200,25);
        add(c2);

        String []status = {"Clean","Dirty"};
        JComboBox c1 = new JComboBox(status);
        c1.setBounds(250,215,200,25);
        add(c1);

        b1 = new JButton("UPDATE");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(175,325,100,30);
        b1.addActionListener(this);
        add(b1);

        setBounds(400, 150, 1000, 500);
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
         new Update();
    }
}
