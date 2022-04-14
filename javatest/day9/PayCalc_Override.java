class Pay1212 {

    private String name;
    private int bonbong;
    int tax;
    int silsu;

    public Pay1212() {}
    public Pay1212(String name, int bonbong) {
        this.name = name;
        this.bonbong = bonbong;
    }

//
//  setter(합법적으로 숨겨진 영역에 접근해서 데이터 저장)

    public void setName(String name) {// String name = 매개변수
        this.name = name;
    }

    //  getter(합법적으로 숨겨진 영역의 데이터를 가져온다)
    public String getName() {
        return name;
    }

    public void setBonbong(int bonbong) {
        this.bonbong = bonbong;
    }

    public int getBonbong() {
        return bonbong;
    }

    public int taxCalc() {
        return (int) (bonbong * 0.045 + 0.5);
    }

    public int silsuCalc() {
        return bonbong - tax;
    }

    public void printCalc() {
        System.out.println("--------------------");
        System.out.println("---12월 급여 내역---");
        System.out.println("--------------------");
        System.out.println("성명: " + name);
        System.out.println("본봉: " + bonbong);
        System.out.println("세금: " + tax);
        System.out.println("실수령액: " + silsu);

    }
}
public class PayCalc_Override {

    public static void main(String[] args) {
        Pay1212 p1 = new Pay1212();
        Pay1212 p2 = new Pay1212();
        Pay1212 p3 = new Pay1212();


        Pay1212 p4 = new Pay1212("홍길동", 4000000);
        p4.printCalc();

        p1.setName("왕눈이");
        p1.setBonbong(2000000);
        p1.tax = p1.taxCalc();
        p1.silsu = p1.silsuCalc();
        p1.printCalc();

        p2.setName("아로미");
        p2.setBonbong(2500000);
        p2.tax = p2.taxCalc();
        p2.silsu = p2.silsuCalc();
        p2.printCalc();

        p3.setName("투투");
        p3.setBonbong(1500000); // 150만원
        p3.tax = p3.taxCalc();
        p3.silsu = p3.silsuCalc();
        p3.printCalc();

        Extra e = new Extra();
        e.setName("이청우");
        e.setBonbong(5500000);
        e.setYear(3);
        e.setChild(2);
        e.printCalc();

        Extra e2 = new Extra("이청우",5500000,3,1);
        e2.printCalc();

    }
}

class Extra extends Pay1212 {
    private int year;
    private int child;

    public Extra() {}

    public Extra(String name, int bonbong, int year, int child) {
        super(name,bonbong);
        this.year = year;
        this.child = child;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }
    public void setChild(int child) {
        this.child = child;
    }
    public int getChild() {
        return child;
    }

    public int calcExtra() {
        int pay = 0;
//   return pay;
        if (year == 0) {
            System.out.println("신입사원입니다.");
        } else if (year == 1) {
            pay = pay + 200000;
            System.out.println("경력1년입니다.");
        } else if (year == 2) {
            pay = pay + 400000;
        } else if (year == 3) {
            pay = pay + 600000;
        } else if (year == 4) {
            pay = pay + 800000;
        } else {
            pay = pay + 1500000;

        }

        if (year >= 1) {
            if (child > 1) {
                pay = pay + (child * 200000);

            }
        }
        return pay;
    }


    @Override
    public int silsuCalc() {
        return getBonbong() + calcExtra() - taxCalc();
    }
    @Override
    public void printCalc() {
        System.out.println("--------------------");
        System.out.println("---12월 급여 내역---");
        System.out.println("--------------------");
        System.out.println("성명: " + getName());
        System.out.println("본봉: " + getBonbong());
        System.out.println("세금: " + tax);
        System.out.println("수당: " + calcExtra());
        System.out.println("실수령액: " + silsu);

    }
}