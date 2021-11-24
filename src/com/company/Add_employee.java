package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Add_employee  extends JFrame implements ActionListener {

    Add_employee() {


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel_management_system/icons/third.jpg"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(200,0,640,426);
        add(l1);

//        JLabel l2 = new JLabel("RECEPTION");
//        l2.setBounds(350,0,1000,50);
//        l2.setForeground(Color.BLACK);
//        l2.setFont(new Font("serif",Font.PLAIN, 50));
//        l1.add(l2);
        JButton b1 = new JButton("New Customer Form");
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        b1.setBounds(20,20,150,30);
        add(b1);
        b1.addActionListener(this);

        JButton b2 = new JButton("Update Room");
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLACK);
        b2.setBounds(20,140,150,30);
        add(b2);
        b2.addActionListener(this);

        JButton b3 = new JButton("Add Employee");
        b3.setBackground(Color.WHITE);
        b3.setForeground(Color.BLACK);
        b3.setBounds(20,260,150,30);
        add(b3);
        b3.addActionListener(this);

        JButton b4 = new JButton("Next");
        b4.setBackground(Color.WHITE);
        b4.setForeground(Color.BLACK);
        b4.setBounds(1300,700,150,30);
        l1.add(b4);
        b4.addActionListener(this);


        setBounds(250, 0, 800, 426);

        setLayout(null);
        setVisible(true);




    }
    @Override
    public void actionPerformed(ActionEvent e) {
    }



    public static void main(String[] args) {
        new Add_employee();

    }
}