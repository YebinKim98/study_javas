package cases;
import java.util.Scanner;

public class ForBucketets {
    public static void main(String[] args) {
        try {
            String bucket_1 = "";
            String bucket_2 = "";           
            String bucket_3 = "";
            String[] bucket = {"", "", ""};

            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            for (int first=0;first < 3; first=first+1) {
                System.out.print((first+1)+"번째 담기:");
                bucket_1 = myObj.nextLine(); // Read user input

            }

            System.out.println("---담은 내용물---");
            System.out.print(bucket[0]+",");
            System.out.print(bucket[1]+",");
            System.out.print(bucket[2]+",");

        } catch (Exception e) {
            // TODO: handle exception
        } finally {

        }
        System.out.println();
        // return 0;
    }
}
