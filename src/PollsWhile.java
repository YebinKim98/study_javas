import java.util.Scanner;

public class PollsWhile {
    public static void main(String[] args) {
        try {
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            String answer = "";
            System.out.println("선택에 따라 안내글을 보여드립니다.");
            boolean loops = true;

            while (loops) {
                System.out.println("P-설문시작, S-설문통계, Poll-설문시작, Exit-설문종료");
                System.out.print("입력하세요:");
                answer = myObj.nextLine();
                if(answer.equals("P")||answer.equals("Poll")) {
                    System.out.println("-----설문 시작-----");
                } else if (answer.equals("S" )||answer.equals("Statistic")) {
                    System.out.println("-----설문 통계-----");
                } else if (answer.equals("Exit")||answer.equals("E")) {
                    System.out.println("-----설문 종료-----");
                    break;
                } else {
                    System.out.println("잘못 입력되었습니다.다시 입력해주세요.");
                }
            }
        } catch (Exception e) {
            System.out.println();
        } finally {
            System.out.println();
        }
        System.out.println();
        // return 0;
    }
}
