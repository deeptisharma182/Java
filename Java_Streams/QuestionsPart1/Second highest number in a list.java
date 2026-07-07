// Second highest number in a list
public class StreamPrac {

    public static void main(String []args){
      //Second highest number in a list 
      
        List<Integer>nums = Arrays.asList(88, 2, 1, 90, 56, 23,11, 67);
      
        Optional<Integer>ans = nums.stream().sorted((Integer a, Integer b)->b-a).skip(1).findFirst();
      
        System.out.println(ans.get());
       
    }
}
