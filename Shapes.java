package sk.itsovy.other;

import java.util.Scanner;

public class Shapes {

    public void rectangle1() {
        int i=8;
        for (int row=1; row<=i; row++) {
            System.out.print("#");
        }
        System.out.println();
        for (int column=i-2; column>0; column--) {
            System.out.print("#");
            for (int space=i-2; space > 0; space--) {
                System.out.print(" ");
            }
            System.out.print("#");
            System.out.println();
        }
        for (int row=1; row<=i; row++) {
            System.out.print("#");
        }
    }

    public void rectangle2() {
        for (int rows=1; rows<=8; rows++) {
            for (int columns=1; columns<=8; columns++)
                if (rows==1 || rows==8 || columns==1 || columns==8) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            System.out.println();
        }
    }

    public void rectangle3() {
        Scanner in=new Scanner(System.in);

        System.out.println("Number of rows: ");
        int rows = in.nextInt();
        System.out.println("Number of columns: ");
        int columns = in.nextInt();
        System.out.println("Character: ");
        char c = in.next().charAt(0);

        int x=rows, y=columns;

        for (; rows>0; rows--) {
            for (; columns>0; columns--) {
                System.out.print(c+" ");
            }
            columns+=y;
            System.out.println();
        }

        rows+=x;
        System.out.println();

        for (; rows>0; rows--) {
            for (; columns>0; columns--)
                if (rows==(x-x+1) || rows==x || columns==(y-y+1) || columns==y) {
                    System.out.print(c+" ");
                } else {
                    System.out.print("  ");
                }
            columns+=y;
            System.out.println();
        }
    }

    public void triangle1() {
        for (int i=1; i<11; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void triangle2() {
        for (int i=1; i<11; i++) {
            for (int j=10; j>=i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void triangle3() {
        for (int i=1; i<11; i++) {
            for (int m=9; m>=i; m--) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void triangle4() {
        for (int i=1; i<11; i++) {
            for (int m=2; m<=i; m++) {
                System.out.print(" ");
            }
            for (int j=10; j>=i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void triangle5() {
        for (int i=2; i<16; i+=2) {
            for (int m=12; m>=i; m-=2) {
                System.out.print(" ");
            }
            for (int j=1; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void triangleUpsideDown() {
        Scanner obj=new Scanner(System.in);

        System.out.println("n: ");
        int n = obj.nextInt();

        for (int r=n; r>=1; r--) {
            for (int s=n-r; s>0; s--) {
                System.out.print(" ");
            }
            for (int c=1; c<=(2*r-c); c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void rhombus() {
        Scanner obj=new Scanner(System.in);
        System.out.println("rows: ");
        int n=obj.nextInt();

        for (int i=n; i>0; i--) {
            for (int space=i-1; space>0; space--) {
                System.out.print("  ");
            }
            for (int row=n; row>0; row--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}