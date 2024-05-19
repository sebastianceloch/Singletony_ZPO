public class Main {
    public static void main(String[] args) {

        FakeDatabaseConnector connector = FakeDatabaseConnector.getInstance();

        connector.execQuery("SELECT * FROM users WHERE nickname=czarek");

        connector.closeConnection();
    }
}