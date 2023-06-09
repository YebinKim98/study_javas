public class Methodsifs {
    public static void main(String[] args) {
        try {
            if (time < 12) {
                System.out.println("오전입니다.");
            } else if (time < 18) {
                System.out.println("오후입니다.");
            } else {
                System.out.println("밤입니다.");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
