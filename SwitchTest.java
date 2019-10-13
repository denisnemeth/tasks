package sk.itsovy.other;

import java.util.Scanner;

public class SwitchTest {

    public void months() {
        Scanner obj=new Scanner(System.in);

        System.out.println("Month: ");
        int m = obj.nextInt();

        if (m==1) { System.out.println("January");
        } else if (m==2) { System.out.println("February");
        } else if (m==3) { System.out.println("March");
        } else if (m==4) { System.out.println("April");
        } else if (m==5) { System.out.println("May");
        } else if (m==6) { System.out.println("June");
        } else if (m==7) { System.out.println("July");
        } else if (m==8) { System.out.println("August");
        } else if (m==9) { System.out.println("September");
        } else if (m==10) { System.out.println("October");
        } else if (m==11) { System.out.println("November");
        } else if (m==12) { System.out.println("December");
        } else { System.out.println("ERROR"); }

        switch (m) {
            case 1: System.out.println("January"); break;
            case 2: System.out.println("February"); break;
            case 3: System.out.println("March"); break;
            case 4: System.out.println("April"); break;
            case 5: System.out.println("May"); break;
            case 6: System.out.println("June"); break;
            case 7: System.out.println("July"); break;
            case 8: System.out.println("August"); break;
            case 9: System.out.println("September"); break;
            case 10: System.out.println("October"); break;
            case 11: System.out.println("November"); break;
            case 12: System.out.println("December"); break;
            default: System.out.println("ERROR");
        }

        if (m==12 || m==1 || m==2) { System.out.println("Winter");
        } else if (m==3 || m==4 || m==5) { System.out.println("Spring");
        } else if (m==6 || m==7 || m==8) { System.out.println("Summer");
        } else if (m==9 || m==10 || m==11) { System.out.println("Autumn");
        } else { System.out.println("ERROR"); }

        switch (m) {
            case 1:
            case 2:
            case 12: System.out.println("Winter"); break;
            case 3:
            case 4:
            case 5: System.out.println("Spring"); break;
            case 6:
            case 7:
            case 8: System.out.println("Summer"); break;
            case 9:
            case 10:
            case 11: System.out.println("Autumn"); break;
            default: System.out.println("ERROR");
        }
    }

    public void quadEquation() {
        System.out.println("Hello, I am a program for solving quadratic equations! :)");

        Scanner obj = new Scanner(System.in);
        System.out.println("a: ");
        int a = obj.nextInt();
        System.out.println("b: ");
        int b = obj.nextInt();
        System.out.println("c: ");
        int c = obj.nextInt();
        double D = b * b - 4 * (a * c);

        if (a == 0) {
            System.out.println("a can't be 0");
            System.out.println();
            quadEquation();
        } else if (D < 0) {
            System.out.println("Doesn't have a root");
        } else if (D == 0) {
            int x = -b / (2 * a);
            System.out.println("x = "+x);
        } else {
            double x1 = ((-b + Math.sqrt(D)) / (2 * a));
            double x2 = ((-b - Math.sqrt(D)) / (2 * a));
            System.out.println("x1 = "+x1);
            System.out.println("x2 = "+x2);
        }
    }

    public void zodiacSigns() {
        Scanner obj=new Scanner(System.in);
        System.out.println("Day: ");
        int d = obj.nextInt();
        System.out.println("Month: ");
        int m = obj.nextInt();

        if ((m<1 || d<1 || d>31) || (((m==4 || m==6 || m==9 || m==11) && d==31) || (m==2 && d>28))) {
            System.out.println("Wrong date!");
        } else if ((m==3 && d>=21) || (m==4 && d<=19)) {
            System.out.println("Aries");
        } else if ((m==4 && d>=20) || (m==5 && d<=20)) {
            System.out.println("Taurus");
        } else if ((m==5 && d>=21) || (m==6 && d<=20)) {
            System.out.println("Gemini");
        } else if ((m==6 && d>=21) || (m==7 && d<=22)) {
            System.out.println("Cancer");
        } else if ((m==7 && d>=23) || (m==8 && d<=22)) {
            System.out.println("Leo");
        } else if ((m==8 && d>=23) || (m==9 && d<=22)) {
            System.out.println("Virgo");
        } else if ((m==9 && d>=23) || (m==10 && d<=22)) {
            System.out.println("Libra");
        } else if ((m==10 && d>=23) || (m==11 && d<=21)) {
            System.out.println("Scorpio");
        } else if ((m==11 && d>=22) || (m==12 && d<=21)) {
            System.out.println("Sagittarius");
        } else if ((m==12 && d>=22) || (m==1 && d<=19)) {
            System.out.println("Capricorn");
        } else if ((m==1 && d>=20) || (m==2 && d<=18)) {
            System.out.println("Aquarius");
        } else if ((m==2 && d>=19) || (m==3 && d<=20)) {
            System.out.println("Pisces");
        }
    }
}
