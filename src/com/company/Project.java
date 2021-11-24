package com.company;

import javax.swing.*;

public class Project {
    public static void main(String[] args) {
        JFrame f = new JFrame("Hotel Management");
        f.setSize(1000,700);
        JLabel name,contact,id,date_to,date_from,room_type,num_rooms,availiable_rooms;

        //********************************* LABEL *********************************************************

        name = new JLabel("Name of customer : ");
        contact = new JLabel("Contact number : ");
        id = new JLabel("ID number : ");
        date_from = new JLabel("From : ");
        date_to = new JLabel("To : ");
        room_type = new JLabel("Choose Room Type :- AC/Non AC : ");
        num_rooms = new JLabel("Choose number of rooms : ");
        availiable_rooms = new JLabel("Availiable rooms : ");

        name.setBounds(10,0, 200,50);
        contact.setBounds(10,40,200,50);
        id.setBounds(10,80,200,50);
        date_from.setBounds(10,120,100,50);
        date_to.setBounds(160,120,200,50);
        room_type.setBounds(10,160,200,50);
        num_rooms.setBounds(10,200,200,50);
        availiable_rooms.setBounds(10,240,200,50);

        f.add(name);
        f.add(contact);
        f.add(id);
        f.add(date_from);
        f.add(date_to);
        f.add(room_type);
        f.add(num_rooms);
        f.add(availiable_rooms);

        //********************************* Text Field ************************************************

        JTextField name1,contact1,id1,date_to1,date_from1;
        name1 = new JTextField("");
        contact1 = new JTextField();
        id1 = new JTextField();
        date_to1 = new JTextField();
        date_from1 = new JTextField();

        name1.setBounds(120,18, 300,25);
        contact1.setBounds(120,50, 300,25);
        id1.setBounds(120,98, 300,25);
        date_to1.setBounds(70,138, 80,25);
        date_from1.setBounds(200,138, 80,25);

        f.add(name1);
        f.add(contact1);
        f.add(id1);
        f.add(date_to1);
        f.add(date_from1);

        //******************************* Combobox ****************************************************

        JComboBox room_type1,num_rooms1,availiable_rooms1;

        String []type = {"AC","Non AC"};
        room_type1 = new JComboBox(type);
        String []room_number = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};
        num_rooms1 = new JComboBox(room_number);

        room_type1.setBounds(220,175,80,20);
        num_rooms1.setBounds(220,220,80,20);

        f.add(room_type1);
        f.add(num_rooms1);

        //*******************************************************************************************

        f.setLayout(null);
        f.setVisible(true);
    }
}
