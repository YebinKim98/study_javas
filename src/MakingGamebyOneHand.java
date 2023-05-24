public class MakingGamebyOneHand {
  public static void main(String[] args) throws Exception{

  //변수 3개 선언, 변수 두개에 1과2를 넣음
  int first = 1;
  int second = 0;
  int third = 2;
  
  // 변수 넣은 값은 교차 입력
  second = third;
  third = first;
  first = second;

  System.out.println(first);
  System.out.println(second);
  System.out.println(third);
    // return 0;
  }
}