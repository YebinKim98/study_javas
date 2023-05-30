public class Methods {
    // <access_modifier> <return_type> <method_name>( list_of_parameters)
    // {
    // //body
    // }
    public int minus(int first, int second){
        int result = 0;
        try {
           result = first - second;
        } catch (Exception e) {
            // TODO: handle exception
        }
        return result;
    }
    public int add(int first, int second){
        int result = 0;
        try {
            result = first + second;
        } catch (Exception e) {
            // TODO: handle exception
        }
        return result ;
    }
    
    public static void main(String[] args) {
        // - 인스턴스는 1회
        // - 초기 값은 2를 넘지 않음.
        // - main 결과값은 17
        try {
            int x = 2;
            int y = 1;

            Methods Methods = new Methods();
            x = Methods.add(x,y);
            x = Methods.add(x,y);
            x = Methods.add(x,y);
            x = Methods.add(x,y);
            x = Methods.add(x,y);
            x = Methods.add(x,y);
            x = Methods.add(x,y);
            x = Methods.add(x,y);
            x = Methods.add(x,y);
            x = Methods.add(x,y);
            x = Methods.add(x,y);
            x = Methods.add(x,y);
            x = Methods.add(x,y);
            x = Methods.add(x,y);
            x = Methods.add(x,y);
            x = Methods.add(x,y);
            x = Methods.minus(x,y);

            System.out.println(x);   
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        // return 0;
    }
}