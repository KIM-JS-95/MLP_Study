package test;

class Score123 {
    private String name;

    private int kuk;
    private int eng;
    private int math;

    public Score123(String name, int kuk, int eng, int math) {
        this.name = name;
        this.kuk = kuk;
        this.eng = eng;
        this.math = math;
    }

    public Score123() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKuk() {
        return kuk;
    }

    public void setKuk(int kuk) {
        this.kuk = kuk;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int total() {
        return kuk + eng + math;
    }

    public float avg() {
        return total() / 3;
    }

    public void printScore() {
        System.out.println("================================");
        System.out.println("================성적표===========");
        System.out.println("================================");
        System.out.println("이름: " + name);
        System.out.println("국어점수: " + kuk);
        System.out.println("영어점수: " + eng);
        System.out.println("수학점수: " + math);
        System.out.println("총합점수: " + total());
        System.out.println("평균점수: " + avg());
    }
}


class Grade extends Score123 {

    public Grade(String name, int kuk, int eng, int math) {
        super(name, kuk, eng, math);
    }

    public Grade() {
    }

    @Override
    public void printScore() {
        super.printScore();
        System.out.println("평 점: "+ calcGrade());
    }

    public String calcGrade() {
        String grade = null;
        int score = (int)avg()/10;
        switch (score) {
            case 10:
                grade="A 등급입니다.";
                break;
            case 9:
                grade="B 등급입니다.";
                break;
            case 8:
                grade="C 등급입니다.";
                break;
            case 7:
                grade="D 등급입니다.";
                break;
            default:
                grade="F 등급입니다.";
                break;
        }
        return grade;
    }

}

public class gradeTest {
    public static void main(String[] args) {
        Score123 s1 = new Score123();

        s1.setName("김길동");
        s1.setKuk(80);
        s1.setEng(70);
        s1.setMath(60);

        s1.printScore();

        Score123 s2 = new Score123("이길동", 100, 20, 90);
        s2.printScore();


        Grade g1 = new Grade();
        g1.setName("삼길동");
        g1.setKuk(80);
        g1.setEng(80);
        g1.setMath(80);
        g1.printScore();
    }
}
