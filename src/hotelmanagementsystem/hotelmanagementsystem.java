/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotelmanagementsystem;

/**
 *
 * @author Ngocpu
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;

public class hotelmanagementsystem extends JFrame implements ActionListener {

    JLabel l1;
    JButton b1;

    public hotelmanagementsystem() {

        setSize(900, 750);
        setLocationRelativeTo(null);// setContentPane(300,300,1366,390);   frame size                setLocation(300,300);

        l1 = new JLabel("");
        b1 = new JButton("Next");

        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/res.jpg"));
        Image i3 = i1.getImage().getScaledInstance(900, 750, Image.SCALE_SMOOTH);
        ImageIcon i2 = new ImageIcon(i3);
        l1 = new JLabel(i2);

        JLabel lid = new JLabel("WELLCOME TO HOME HOTEL");
        lid.setBounds(130, 30, 1000, 100);
        lid.setFont(new Font("Baloo Chettan", Font.BOLD, 45));
        lid.setForeground(Color.white);
        l1.add(lid, BorderLayout.CENTER);

        
        b1.setBounds(650, 600, 150, 50);
        l1.setBounds(0, 0, 900, 750);

        l1.add(b1);
        add(l1);

        b1.addActionListener(this);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        new Login().setVisible(true);
        this.setVisible(false);

    }

    public static void main(String[] args) {
        hotelmanagementsystem window = new hotelmanagementsystem();
        window.setVisible(true);
    }
}
