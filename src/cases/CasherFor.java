package cases;
import java.util.Scanner;

public class CasherFor {
    public static void main(String[] args) {
        try {
            int[] bucket = new int[5]; // 공간이 5인 bucket배열
            int sum = 0;
            System.out.println("---계산 시작---");

            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            for (int first=0;first < bucket.length; first=first+1) {
                System.out.print((first+1)+"번째 가격:");
                bucket[first] = myObj.nextInt(); // Read user input

                if(bucket[first] > 100) {//100초과일때
                    System.out.println("100원초과 0원 적용"); 
                    bucket[first] = 0; //가격은 0원이다
                } else if (bucket[first] == 0) { // 0원이 되면
                        break; // for문 나가기
                }   
                sum = sum + bucket[first]; //가격 더하기
        }
            System.out.println("---담은 총합 ---");
            System.out.println("합계: " + sum); //sum 출력

        } catch (Exception e) {
            // TODO: handle exception
        } finally {

        }
        System.out.println();
        // return 0;
    }
}
