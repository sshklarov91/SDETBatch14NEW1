package Class23;

public class InterfaceTester {
    public static void main(String[] args) {
        IDataBase iDataBase=new IBM();
        iDataBase.openData();
        iDataBase.readData();
        iDataBase.WriteData();
    }

}
