using System;
using System.Data.SqlClient;
namespace PROD_DB
{
    public sealed class DBConnection{
        private static DBConnection connectionInstance = null;
        private static SqlConnection connection;
        private static Boolean connected;

        private DBConnection() {
            try
            {
                connection = new SqlConnection("user id=username;" +
                                      "password=password;server=serverurl;" +
                                      "Trusted_Connection=yes;" +
                                      "database=database; " +
                                               "connection timeout=30");
                Console.WriteLine("Connected to DATABASE");
                connected = true;
            } catch (Exception e) {
                Console.WriteLine(e.ToString());
            }

        }


        public static DBConnection Instance()
        {
            if (connectionInstance == null) {
                connectionInstance = new DBConnection();
            }
            return connectionInstance;

        }

        public void close() {
            try {
                connection.Close();
            } catch (Exception e) {
                Console.WriteLine(e.ToString());
            }
        }
    }
}
