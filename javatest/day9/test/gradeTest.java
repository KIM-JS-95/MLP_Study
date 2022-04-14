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
        System.out.println("================");
        System.out.println("======성적표=====");
        System.out.println("================");
        System.out.println("국어점수: " + kuk);
        System.out.println("영어점수: " + eng);
        System.out.println("수학점수: " + math);
        System.out.println("총합점수: " + total());
        System.out.println("평균점수: " + avg());
    }
}


class Grade extends Score123 {

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
    }
}
