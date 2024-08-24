package restaurantmanagementsystem;

import javax.swing.*;

public class MediatorPattern {

    public MediatorPattern() {
        
        //Restaurantt.createAndShowGUI();
        Customer customer1 = new Customer("Fahad Mehmood", "Wednesday, 31 May 2023");
        Customer customer2 = new Customer("Fahad Mehmood", "Wednesday, 31 May 2023");
        Customer customer3 = new Customer("Fahad Mehmood", "Wednesday, 31 May 2023");
        Customer customer4 = new Customer("Fahad Mehmood", "Wednesday, 31 May 2023");
        Customer customer5 = new Customer("Fahad Mehmood", "Wednesday, 31 May 2023");
        Customer customer6 = new Customer("Fahad Mehmood", "Wednesday, 31 May 2023");
        Customer customer7 = new Customer("Fahad Mehmood", "Wednesday, 31 May 2023");
        Customer customer8 = new Customer("Fahad Mehmood", "Wednesday, 31 May 2023");
        Customer customer9 = new Customer("Fahad Mehmood", "Wednesday, 31 May 2023");
        Customer customer10 = new Customer("Fahad Mehmood", "Wednesday, 31 May 2023");

        customer1.placeOrder("Pizza");
        customer2.placeOrder("Pizza");
        customer3.placeOrder("Pizza");
        customer4.placeOrder("Pizza");
        customer5.placeOrder("Pizza");
        customer6.placeOrder("Pizza");
        customer7.placeOrder("Pizza");
        customer8.placeOrder("Pizza");
        customer9.placeOrder("Pizza");
        customer10.placeOrder("Pizza");
    }

    }