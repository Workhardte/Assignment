
package foodordermanagement;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class FoodOrderManagement extends Frame {
   
    private Label welcomeLabel;
    private Button viewMenuButton;
    private Button placeOrderButton;

   
    public FoodOrderManagement() {
       
        setTitle("QuickFood Order Management");
        setSize(600, 400);

      
        setLayout(new FlowLayout());

       
        welcomeLabel = new Label("Welcome to QuickFood!!");
         welcomeLabel.setForeground(Color.MAGENTA);
        add(welcomeLabel);

       
        viewMenuButton = new Button("View Menu");
         viewMenuButton.setForeground(Color.BLUE);
        viewMenuButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openMenuWindow();
            }
        });
        add(viewMenuButton);

       
        placeOrderButton = new Button("Place Order");
         placeOrderButton.setForeground(Color.BLUE);
        placeOrderButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openPlaceOrderWindow();
            }
        });
        add(placeOrderButton);

       
        setLocationRelativeTo(null);

       
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
////The purpose of using a private void openMenuWindow function in code
    //is to create a method that can be called to open a menu window in program.
    //This function is typically used to encapsulate the logic for displaying the menu window, 
    //making the code more modular and easier to maintain.
    
    private void openMenuWindow() {
        MenuWindow menuWindow = new MenuWindow(this);
        menuWindow.setVisible(true);
    }
//The purpose of using private void openPlaceOrderWindow would typically be to create
    //a method that opens a new window or dialog for placing an order in a software application.
    //This method is likely meant to encapsulate the logic for opening the order window,
    //making the code more organized and easier to maintain.
  
    private void openPlaceOrderWindow() {
        PlaceOrderWindow placeOrderWindow = new PlaceOrderWindow(this);
        placeOrderWindow.setVisible(true);
    }

    public static void main(String[] args) {
       FoodOrderManagement mainFrame = new FoodOrderManagement();
        mainFrame.setVisible(true);
    }
}


class MenuWindow extends Frame {
    public MenuWindow(Frame parent) {
     
        setTitle("Menu");
        setSize(300, 200);

        
        setLocation(parent.getX() + parent.getWidth() / 2 - getWidth() / 2,
                parent.getY() + parent.getHeight() / 2 - getHeight() / 2);

       
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

       
        setLayout(new FlowLayout());
       // Label l5=new Label("List Of Items:");
       add(new Label("List Of Items:"));
        add(new Label("Pizza"));
        add(new Label("Burger"));
        add(new Label("Sushi"));
        

      
        Button backButton = new Button("Back");
        backButton.setForeground(Color.PINK);
        backButton .setBounds(150, 100, 50, 20);
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        add(backButton);
    }
}


class PlaceOrderWindow extends Frame {
    public PlaceOrderWindow(Frame parent) {
       
        setTitle("Place Your Order");
        setSize(300, 200);

        
        setLocation(parent.getX() + parent.getWidth() / 2 - getWidth() / 2,
                parent.getY() + parent.getHeight() / 2 - getHeight() / 2);

       
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

       
        setLayout(new FlowLayout());
        TextField nameField = new TextField(20);
        add(new Label("Enter your name:"));
        add(nameField);

    
        Button submitButton = new Button("Submit Order");
         submitButton.setForeground(Color.CYAN);
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                String name = nameField.getText();
                String message = "thank you " + name + "."+"your order has been submitted"+".";
                JOptionPane.showMessageDialog(null, message);
            }
        });
        add(submitButton);

      
        Button backButton = new Button("Back");
        backButton.setForeground(Color.CYAN);
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        add(backButton);
    }
}
