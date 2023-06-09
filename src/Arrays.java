public class Arrays {
    public String[] initialArrays(){
        String[] carsTypes = {"Volvo", "BMW", "Ford", "Mazda", "KIA"};
        return carsTypes ;
    }
    public static void main(String[] args) {
        // String[][] numbers = {
        //                     {"10", "20", "30", "40"},
        //                     {"50", "60", "70"}
        //                     };
        // for (int second=0; second < numbers.length; second = second+1){
        //     for (int third=0;third < numbers[second].length; third = third+1) {
        //         System.out.print(numbers[second][third] + ",");
        //     }
        //     System.out.println();
        // }
  
        Arrays arrays = new Arrays();
        String[] cars = arrays.initialArrays();
        System.out.println(cars.length);
        for(int first=0;first < cars.length;first = first+1) {
            System.out.print(cars[first]+",");        }
    }
        // return 0;
    }
