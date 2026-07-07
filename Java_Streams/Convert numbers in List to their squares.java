public class StreamPrac {

    public static void main(String []args){
      
       //Convert numbers in List to their squares
      
        List<Integer>nums = Arrays.asList(2,8,4,5,10,25,7,66,43);
        Stream<Integer>strm = nums.stream().map((Integer x)->x*x);
        List<Integer>result = strm.collect(Collectors.toList());;
        System.out.println(result);
    }
}

  
