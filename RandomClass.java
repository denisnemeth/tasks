package sk.itsovy.other;

import java.util.Scanner;
import java.util.Random;

public class RandomClass {
    Random rnd;

    public void randomInt() {
        Random rnd=new Random();

        int a=0;
        int b=0;
        int c=0;

        while(a==b || b==c || c==a) {
            a=rnd.nextInt(6)+1;
            b=rnd.nextInt(6)+1;
            c=rnd.nextInt(6)+1;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public void randomInt2() {
        Random rnd=new Random();

        int a=rnd.nextInt(6)+1;
        int b;
        int c=0;

        do {
            b=rnd.nextInt(6)+1;
        } while (a==b || a==c);
        do {
            c=rnd.nextInt(6)+1;
        } while(b==c || a==c);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public void randomInt3() {
        Random rnd=new Random();

        int a=rnd.nextInt(26)+97;
        int b=rnd.nextInt(10)+48;
        int c=rnd.nextInt(101)+100;
        int d=rnd.nextInt(21)-10;
        int e=rnd.nextInt(4)-1;
        int f=rnd.nextInt(503)+113;
        int g=rnd.nextInt((10)+1)*5;
        int tcE=rnd.nextInt(((45)+5)*2);
        int tcO=rnd.nextInt(((45)+5)*2+1);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(tcE);
        System.out.println(tcO);
    }

    public void generateInt() {
        Random rnd=new Random();

        /*int x=11*(rnd.nextInt((81)+10));
        System.out.println(x);*/

        int count=0;
        int div;
        int prime;

        do {
            prime = rnd.nextInt(4500) + 500;
            prime=2*prime+1;
            div=0;
            for (int i=2; i<=Math.sqrt(prime); i++) {
                if (prime%i==0) {
                    div++;
                }
            }
        } while (div>0);
        System.out.println(prime);
    }

    public void generatePswd(int n) {
        Random rnd = new Random();

        String password = "";
        for (int i = 0; i < 5; i++) {
            int num = rnd.nextInt(26) + 65;
            char letter = (char) num;
            password = password + letter;
        }
        for (int i = 0; i < 5; i++) {
            int num = rnd.nextInt(26) + 97;
            char letter = (char) num;
            password = password + letter;
        }
        for (int i = 0; i < 5; i++) {
            int num = rnd.nextInt(10) + 48;
            char letter = (char) num;
            password = password + letter;
        }
        System.out.println(password);
    }

    public void generatePswd2(int n, boolean rules) {
        if (rules==true && (n<6 || n>20)) {
            n=10;
        }
        String password="";
        int count=0, num=0, upper=0, lower=0, digits=0;
        if (rules==false) {
            upper=lower=digits=1;
        }
        do {
            int type=rnd.nextInt(3);
            switch (type) {
                case 0:
                    num = rnd.nextInt(26) + 65; upper++; break;
                case 1:
                    num = rnd.nextInt(26) + 97; lower++; break;
                case 2:
                    num = rnd.nextInt(10) + 48; digits++; break;
            }
            char c=(char) num;
            password=password+c;
            count++;
            if (count==n && (upper==0 || lower==0 || digits==0)) {
                count=0;
                password="";
                lower=upper=digits=0;
            }
        } while (count<n);
        System.out.println(password);
    }

    public void example() {
        Random rnd=new Random();
        Scanner sc=new Scanner(System.in);

        System.out.println();
        System.out.println("What's your name?");
        String name=sc.nextLine();
        System.out.println("Nice to meet you "+name+"!");
        System.out.println();
        int count=0;
        int p=1;
        for (int i=0; i<10; i++) {
            int a=rnd.nextInt(90)+10;
            int b=rnd.nextInt(90)+10;
            int c=0;
            int m=rnd.nextInt(4);
            String z="";

            switch(m) {
                case 0:
                case 1: z="+"; c=a+b; break;
                case 2: z="-"; c=a-b; break;
                case 3: z="*"; c=a*b; break;
            }

            System.out.print(p+") "+a+z+b+"=");
            int answer=sc.nextInt();

            if (c==answer) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println("Incorrect!");
            }
            p++;
        }
        count=count*10;
        System.out.println();
        System.out.println("Your accuracy is "+count+"%.");
    }
}
