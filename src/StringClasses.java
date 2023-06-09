public class StringClasses {
    public static void main(String[] args) {
        try {
            String name = "ye bin kim" ;
            name.equalsIgnoreCase("ye bin kim"); //true
            name.equalsIgnoreCase("ye bin"); //false


            String name_second = new String("Friend jane !");
            name_second.equals("Friend jane !"); //true
            name_second.length(); //13 글자 길이
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println();
        // return 0;
    
    } 
}

// name_second = name_second.replaceAll("e","a"); //ye bin kim
// String[] arrays = name_second.split(" "); //잘라낼 기준 정함 " " 공백 기준으로 자름
// name_second= name_second.substring(0, 5); //"Frien"