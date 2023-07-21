package baiTap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CheckException check = new CheckException();
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Nhap vao canh thu nhat: ");
            int a = sc.nextInt();
            System.out.print("Nhap vao canh thu hai: ");
            int b = sc.nextInt();
            System.out.print("Nhap vao canh thu ba: ");
            int c = sc.nextInt();
            try {
                check.checkE(a,b,c);
            } catch (TriangleException ey) {
                System.out.println(ey.getMessage());
            }
        } catch (Exception e) {
            System.out.println("So khong hop le!");
        }
    }

}

