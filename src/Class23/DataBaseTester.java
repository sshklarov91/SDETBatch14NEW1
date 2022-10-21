package Class23;

import javax.xml.crypto.Data;

public class DataBaseTester {
    public static void main(String[] args) {
        DataBase dataBase=new Oracle();
        dataBase.openDatebase();
        dataBase.readData();
        dataBase.writeData();
        dataBase.closeDatabase();
        }
    }

