public class StoreManager {

    private static StoreManager instance = null;

    private SQLiteDataAdapter dao;

    
    private MainView mainView = null;
    private OrderView orderView = null;
    private CustomerView customerView = null;
    private ProductView productView = null;

    private ProductController productController = null;
    private MainController mainController = null;
    private OrderController orderController = null;
    private CustomerController customerController = null;

    private StoreManager(String db) {
        // do some initialization here!!!
        if (db.equals("SQLite"))
            dao = new SQLiteDataAdapter();

        dao.connect();
        mainView = new MainView();
        mainController = new MainController(mainView);
        orderView = new OrderView();
        orderController = new OrderController(orderView, dao);
        customerView = new CustomerView();
        customerController = new CustomerController(customerView, dao);
        productView = new ProductView();
        productController = new ProductController(productView, dao);
    }

    public MainView getMainView() {
        return mainView;
    }

    public ProductView getProductView() {
        return productView;
    }

    public OrderView getOrderView() {
        return orderView;
    }

    public CustomerView getCustomerView() {
        return customerView;
    }

    public static StoreManager getInstance() {
        if (instance == null)
            instance = new StoreManager("SQLite");
        return instance;
    }

    public SQLiteDataAdapter getDataAccess() {
        return dao;
    }

}
