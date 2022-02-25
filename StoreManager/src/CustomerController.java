import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerController implements ActionListener{
    
    CustomerView thisView;
    DataAccess thisDAO;

    public CustomerController(CustomerView view, DataAccess dataAccess){
        thisView = view;
        thisDAO = dataAccess;
        thisView.retrieveCustomerButton.addActionListener(this);
        thisView.uploadCustomerButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent event){
        if(event.getSource() == thisView.retrieveCustomerButton){
            //retrieve customer from database and display
        }
        if(event.getSource() == thisView.uploadCustomerButton){
            //upload customer to the database
        }
    }
}
