package Class23;

public interface IDataBase {

    void openData();
    void readData();
    void WriteData();
}

class IBM implements IDataBase{

    @Override
    public void openData() {
        System.out.println("Opening the IBM Database");
    }

    @Override
    public void readData() {
        System.out.println("Reading the data from the IBM Database");
    }

    @Override
    public void WriteData() {
        System.out.println("Writing the data to the database");
    }
}