package Repls;

public class SyntaxTechnologies {
    String schoolName;
    int batch;
    int year;
    String lastDayOfClass;
    SyntaxTechnologies(){

    }
    SyntaxTechnologies(String schoolName, int batch, int year, String lastDayOfClass){
        this.schoolName=schoolName;
        this.batch=batch;
        this.year=year;
        this.lastDayOfClass=lastDayOfClass;
    }
    void displayMethod(){
        System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);
    }
}
class main78 {
    public static void main (String[] args){
        SyntaxTechnologies ans1=new SyntaxTechnologies();
        SyntaxTechnologies ans2=new SyntaxTechnologies("Syntax",6,2020,"07/30/2020");
        ans1.displayMethod();
        ans2.displayMethod();
    }
}

