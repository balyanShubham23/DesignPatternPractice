package Java.DesignPatterns.Singleton;

public class DataBaseConnection {

    private static DataBaseConnection dataBaseConnection = null;

    private DataBaseConnection(String name){}

    public static DataBaseConnection getInstance(String name)
    {
        if(dataBaseConnection == null)
        {
            synchronized (DataBaseConnection.class)
            {
                if(dataBaseConnection == null)
                {
                    dataBaseConnection = new DataBaseConnection(name);
                }
            }
        }

        return dataBaseConnection;
    }
}
