import cases.ClassSeconds;

public class ClassMains {
    public static void main(String[] args) {
        
        try {
            ClassFirst classFirst = new ClassFirst(); // no parm
            ClassFirst classFirstswithvar = new ClassFirst(5);
            int second = classFirstswithvar.getSecond(); 
            ClassSeconds classSeconds = new ClassSeconds(6);
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
        // return 0;
    }
}
