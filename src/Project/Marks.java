package Project;

public abstract class Marks {
    abstract void getPercentage();

    int sub1;
    int sub2;
    int sub3;
    int sub4;

    static class StudentA extends Marks {
        StudentA(int s1, int s2, int s3) {
            sub1 = s1;
            sub2 = s2;
            sub3 = s3;
        }

        @Override
        public void getPercentage() {
            System.out.println("The avarage is " + (sub1 + sub2 + sub3) / 3);
        }
    }

    static class StudentB extends Marks {
        StudentB(int s1, int s2, int s3, int s4) {
            sub1 = s1;
            sub2 = s2;
            sub3 = s3;
            sub4 = s4;
        }

        @Override
        public void getPercentage() {
            System.out.println("The avarage is " + ((sub1 + sub2 + sub3 + sub4) / 4));
        }
    }
}


