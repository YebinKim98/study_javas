public class SetAndGetVariable {
    public static void main(String[] args) throws Exception {


    // 변수 생성

    int A = 1;
    int B = 3;
    int C = 5;
    int D = 7;

    int first = 200;
    int second = 30;
    int third = 50;
    int fourth = 10;


    if (B == 3) {
        A = fourth;
    } 

    if (D != 9) {
        B = C;
    } else {
        B = first;
    }

    if (A == 10) {
        C = third;
    } else {
        D = second;
    } 
    System.out.println(A);
    System.out.println(B);
    System.out.println(C);
    System.out.println(D);
        // return 0;
    }
}