package datasource;

import databases.ConnectToSqlDB;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

    public class MySqlData {
        static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        String filepath = "/Users/amir/Desktop/AutomationFrameworkGroup2/Generic/src/secret.properties";

        public List<String> getItemsListFromDB()throws Exception, IOException, SQLException, ClassNotFoundException {
            List<String> list = new ArrayList<>();
            list = connectToSqlDB.readDataBase("SearchFor", "item", filepath);
            return list;
        }
    }

