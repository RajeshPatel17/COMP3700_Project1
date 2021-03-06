public interface DataAccess {
    void connect();

    void saveProduct(ProductModel product);

    ProductModel loadProduct(int productID);

    boolean saveOrder(OrderModel order);

    OrderModel loadOrder(int orderID);
    
    boolean saveCustomer(CustomerModel customer);

    CustomerModel loadCustomer(int customerID);
}
