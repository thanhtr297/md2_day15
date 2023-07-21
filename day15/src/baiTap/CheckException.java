package baiTap;

public class CheckException {
    public void checkE(int a,int b , int c) throws TriangleException{
        if (a+b<=c || a+c<=b || b + c <= a) {
            throw new TriangleException("Loi: Tam giac khong hop le!");
        } else {
            System.out.println("Tam giac hop le!");
        }
    }
}
