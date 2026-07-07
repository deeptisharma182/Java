public class StreamPrac {

    public static void main(String []args){
      //Find sum of even numbers in a list
        List<Integer>nums = Arrays.asList(3,4, 7, 10, 1 ,2 , 8);
        Integer ans = nums.stream().filter((Integer x)->x%2==0).reduce(0, (Integer a, Integer b)->a+b);
        System.out.println(ans);
    }
}
