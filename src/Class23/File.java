package Class23;

public abstract class File {
    abstract void open();

    void edit (){
        System.out.println("Edits");
}
    void close(){
         System.out.println("Closes");
    }
}
class JavaFile extends File{
    void open(){
        System.out.println("Open Java File");
    }
    void edit (){
        System.out.println("Edit Java File");
    }
    void close(){
        System.out.println("Close Java File");
    }
}
class WordFile extends File {
    void open(){
        System.out.println("Open Word File");
    }
    void edit (){
        System.out.println("Edit Word File");
    }
    void close(){
        System.out.println("Close Word File");
    }
}
class PdfFile extends File {
    void open(){
        System.out.println("Open PdfFile File");
    }
    void edit (){
        System.out.println("Edit PdfFile File");
    }
    void close(){
        System.out.println("Close PdfFile File");
    }
}

