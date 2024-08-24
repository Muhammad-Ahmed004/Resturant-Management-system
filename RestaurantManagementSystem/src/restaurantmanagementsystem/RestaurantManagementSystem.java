package restaurantmanagementsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RestaurantManagementSystem extends JFrame implements ActionListener {

    JFrame frame;
    JButton Menu, Branches, Employees, Orders, Inventory;
    JLabel introImage, logoImage, bgImage;

    RestaurantManagementSystem() {

        ImageIcon intro = new ImageIcon(getClass().getResource("intro2.png"));
        introImage = new JLabel();
        introImage.setIcon(intro);
        introImage.setBounds(430, -70, 1000, 500);
        introImage.setVisible(true);

        ImageIcon bg = new ImageIcon(getClass().getResource("bg5.jpg"));
        bgImage = new JLabel();
        bgImage.setIcon(bg);
        bgImage.setBounds(0, 0, 1570, 822);
        bgImage.setVisible(true);

        ImageIcon logo = new ImageIcon(getClass().getResource("urbaneat33.png"));
        logoImage = new JLabel();
        logoImage.setIcon(logo);
        logoImage.setBounds(40, -45, 500, 500);
        logoImage.setVisible(true);

        frame = new JFrame("Urban Eat");
        frame.setBounds(-8, 0, 1570, 822);
        frame.getContentPane().setBackground(Color.gray);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Menu = new JButton("Menu");
        Menu.setBounds(50, 400, 1450, 50);
        Menu.setFocusable(false);
        Menu.addActionListener(this);
        Menu.setBackground(Color.DARK_GRAY);
        Menu.setFont(new Font("Comic Sans", Font.BOLD, 25));
        Menu.setForeground(Color.LIGHT_GRAY);
        Menu.setBorder(BorderFactory.createEtchedBorder(Color.BLACK, Color.BLACK));

        Employees = new JButton("Employees");
        Employees.setBounds(50, 470, 1450, 50);
        Employees.setFocusable(false);
        Employees.addActionListener(this);
        Employees.setBackground(Color.DARK_GRAY);
        Employees.setFont(new Font("Comic Sans", Font.BOLD, 25));
        Employees.setForeground(Color.LIGHT_GRAY);
        Employees.setBorder(BorderFactory.createEtchedBorder(Color.BLACK, Color.BLACK));

        Branches = new JButton("Branches");
        Branches.setBounds(50, 540, 1450, 50);
        Branches.setFocusable(false);
        Branches.addActionListener(this);
        Branches.setBackground(Color.DARK_GRAY);
        Branches.setFont(new Font("Comic Sans", Font.BOLD, 25));
        Branches.setForeground(Color.LIGHT_GRAY);
        Branches.setBorder(BorderFactory.createEtchedBorder(Color.BLACK, Color.BLACK));

        Orders = new JButton("Orders");
        Orders.setBounds(50, 610, 1450, 50);
        Orders.setFocusable(false);
        Orders.addActionListener(this);
        Orders.setBackground(Color.DARK_GRAY);
        Orders.setFont(new Font("Comic Sans", Font.BOLD, 25));
        Orders.setForeground(Color.LIGHT_GRAY);
        Orders.setBorder(BorderFactory.createEtchedBorder(Color.BLACK, Color.BLACK));
        
        Inventory = new JButton("Inventory");
        Inventory.setBounds(50, 680, 1450, 50);
        Inventory.setFocusable(false);
        Inventory.addActionListener(this);
        Inventory.setBackground(Color.DARK_GRAY);
        Inventory.setFont(new Font("Comic Sans", Font.BOLD, 25));
        Inventory.setForeground(Color.LIGHT_GRAY);
        Inventory.setBorder(BorderFactory.createEtchedBorder(Color.BLACK, Color.BLACK));

        frame.add(Menu);
        frame.add(Employees);
        frame.add(Branches);
        frame.add(Orders);
        frame.add(Inventory);
        frame.add(logoImage);
        frame.add(introImage);
        frame.add(bgImage);

    }

    public static void main(String[] args) {
        RestaurantManagementSystem r = new RestaurantManagementSystem();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Menu) {
            frame.dispose();
            Menu Menu = new Menu();
        }
        if (e.getSource() == Employees) {
            SingletonPattern object = SingletonPattern.getInstance();
            object.displayEmployeeInfo();
        }
        if (e.getSource() == Branches) {
            new FactoryPattern();
        }
        if (e.getSource() == Orders) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    Restaurantt.createAndShowGUI();
                    new MediatorPattern();
                }
            });
        }
        if (e.getSource() == Inventory) {
            new CommandPattern();
        }

    }

}
