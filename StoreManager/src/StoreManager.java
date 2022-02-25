public class StoreManager {

    private static StoreManager instance = null;

    private SQLiteDataAdapter dao;

    private ProductView productView = null;

    private MainView mainView = null;


    public ProductView getProductView() {
        return productView;
    }
    public MainView getMainView() {
        return mainView;
    }

    private ProductController productController = null;
    private MainController mainController = null;
    public static StoreManager getInstance() {
        if (instance == null)
            instance = new StoreManager("SQLite");
        return instance;
    }

    public SQLiteDataAdapter getDataAccess() {
        return dao;
    }

    private StoreManager(String db) {
        // do some initialization here!!!
        if (db.equals("SQLite"))
            dao = new SQLiteDataAdapter();

        dao.connect();
        mainView = new MainView();
        mainController = new MainController(mainView);
        productView = new ProductView();
        productController = new ProductController(productView, dao);
    }






}
