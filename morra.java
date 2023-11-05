import javax.swing.*;
import java.awt.*;
import java.awt.ActionListener.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;

public class convert{
    private static String DB_URL = ("");
    private static String DB_USER = ("");
    private static String DB_PASSWORD = ("");
    
   public static void main(String[]args){
       
       //calling the class
   }
    public static void creatGUI(){
        JFrame frame = new JFrame("convrt");
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(6,2));
        //creating text fields 

        JTextField usdtextField = new JTextField;
        JTextField usgtextField = new JTextField;
        JTextField eurotextField = new JTextField;

        JButton convertButton = new JButton("Convert");
        
    
    
    }
}
