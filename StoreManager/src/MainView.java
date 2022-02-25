import javax.swing.*;
import java.awt.*;

public class MainView extends JFrame {

    public JButton ProdButton = new JButton("Product");
    public JButton CustButton = new JButton("Customer");
    public JButton OrdButton = new JButton("Order");

    public MainView(){
        this.setTitle("Main View");
        this.setSize(new Dimension(400,150));
        this.getContentPane().setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));    // make this window with box layout

        JPanel ButtonPanel = new JPanel();
        ButtonPanel.add(ProdButton);
        ButtonPanel.add(CustButton);
        ButtonPanel.add(OrdButton);

        this.getContentPane().add(ButtonPanel);
    
    }
}
