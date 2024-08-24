package restaurantmanagementsystem;

import javax.swing.JTextArea;

public class Kitchen {

    private final String item1 = "Kung Pao Chicken";
    private final String item2 = "Fried Rice";
    private final String item3 = "Dim Sum";
    private final String item4 = "Tortilla Española";
    private final String item5 = "Gazpacho";
    private final String item6 = "Churros con Chocolate";
    private final String item7 = "Dim Sum";
    private final String item8 = "Tortilla Española";
    private final String item9 = "Gazpacho";
    private final String item10 = "Churros con Chocolate";

    private final int quantity1 = 4;
    private final int quantity2 = 3;
    private final int quantity3 = 5;
    private final int quantity4 = 6;
    private final int quantity5 = 4;
    private final int quantity6 = 7;
    private final int quantity7 = 5;
    private final int quantity8 = 6;
    private final int quantity9 = 4;
    private final int quantity10 = 7;    

    private JTextArea outputTextArea; // Text area to display output

    public void setOutputTextArea(JTextArea outputTextArea) {
        this.outputTextArea = outputTextArea;
    }

    public void buyItems() {
        outputTextArea.append("\t----------List of Item Bought-----------\n\n");
        outputTextArea.append("\tFood Item [ Name: " + item4 + " Quantity: " + quantity4 + " ] bought\n\n");
        outputTextArea.append("\tFood Item [ Name: " + item5 + " Quantity: " + quantity5 + " ] bought\n\n");
        outputTextArea.append("\tFood Item [ Name: " + item6 + " Quantity: " + quantity6 + " ] bought\n\n");
        outputTextArea.append("\tFood Item [ Name: " + item9 + " Quantity: " + quantity9 + " ] bought\n\n");
        outputTextArea.append("\tFood Item [ Name: " + item10 + " Quantity: " + quantity10 + " ] bought\n\n");
    }

    public void sellItems() {
        outputTextArea.append("\t----------List of Item Sold-----------\n\n");
        outputTextArea.append("\tFood Item [ Name: " + item1 + " Quantity: " + quantity1 + " ] sold\n\n");
        outputTextArea.append("\tFood Item [ Name: " + item2 + " Quantity: " + quantity2 + " ] sold\n\n");
        outputTextArea.append("\tFood Item [ Name: " + item3 + " Quantity: " + quantity3 + " ] sold\n\n");
        outputTextArea.append("\tFood Item [ Name: " + item7 + " Quantity: " + quantity7 + " ] sold\n\n");
        outputTextArea.append("\tFood Item [ Name: " + item8 + " Quantity: " + quantity8 + " ] sold\n\n");
    }
}
