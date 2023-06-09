public class ClassFirst {
    int second = 0;
    ClassFirst(){
        System.out.println();
    }
    ClassFirst(int first){
        this.second = first;
        System.out.println(first);
    }

    public int getsecond() {
       return this.second;
    }
    public int getSecond() {
        return 0;
    }
}
