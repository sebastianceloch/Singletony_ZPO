public class FakeDatabaseConnector {

    private static FakeDatabaseConnector instance;

    private FakeDatabaseConnector(){
        System.out.println("Connected to DB");
    }

    public static synchronized FakeDatabaseConnector getInstance(){
        if(instance == null){
            instance = new FakeDatabaseConnector();
        }
        return instance;
    }

    public void execQuery(String query){
        System.out.println("Executing " + query);
    }

    public void closeConnection(){
        System.out.println("Closing DB");
        instance = null;
    }
}
