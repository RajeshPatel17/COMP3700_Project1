import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainController implements ActionListener{
    
    MainView thisMainView;

    public MainController(MainView view){
        thisMainView = view;
        thisMainView.ProdButton.addActionListener(this);
        thisMainView.CustButton.addActionListener(this);
        thisMainView.OrdButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == thisMainView.CustButton){
            //loadCustomerPanel
        }
        if(event.getSource() == thisMainView.OrdButton){
            //loadOrderPanel
        }
        if(event.getSource() == thisMainView.ProdButton){
            StoreManager.getInstance().getProductView().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            StoreManager.getInstance().getProductView().setVisible(true);
        }
    }

}
