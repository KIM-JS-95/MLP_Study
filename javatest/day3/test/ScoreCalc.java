package test;

class Score {

    private String name;
    private int kuk;
    private int eng;
    private int math;

    private static Score score;
    public Score(){}

    public static Score getInstance(){
        if (score == null) {
            score = new Score();
        }

        return score;
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
        return (int) kuk + eng + math;
    }

    public double avg() {
        return (double) this.total() / 3;
    }

    public void printScore() {
        System.out.println("성적처리");
        System.out.println("-----------------");
        System.out.println("국어: " + kuk);
        System.out.println("영어: " + eng);
        System.out.println("수학: " + math);
        System.out.println("총점수 : " + this.total());
        System.out.println("평균 : " + this.avg());

    }

}

public class ScoreCalc {

    public static void main(String[] args) {

        Score s1 = Score.getInstance();
        Score s2 = Score.getInstance();
        Score s3 = Score.getInstance();

        s1.setName("홍길동");
        s1.setKuk(90);
        s1.setEng(80);
        s1.setMath(80);

        s1.printScore();

        s2.setName("홍길동");
        s2.setKuk(90);
        s2.setEng(80);
        s2.setMath(80);

        s2.printScore();

        s3.setName("홍길동");
        s3.setKuk(90);
        s3.setEng(80);
        s3.setMath(80);

        s3.printScore();
    }

}