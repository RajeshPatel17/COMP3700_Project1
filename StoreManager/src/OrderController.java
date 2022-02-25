import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrderController implements ActionListener {
    
    OrderView thisView;
    DataAccess thisDAO;

    public OrderController(OrderView view, DataAccess dataAccess) {
        thisView = view;
        thisDAO = dataAccess;
        thisView.retrieveOrderButton.addActionListener(this);
        thisView.uploadOrderButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent event){
        if(event.getSource() == thisView.retrieveOrderButton){
            //retrieve the order from the database and display
        }
        if(event.getSource() == thisView.uploadOrderButton){
            //upload the order to the database
        }

    }
}
