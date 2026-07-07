public class StreamPrac {

    public static void main(String []args){
      
      //  Square Even numbers from list
        List<Integer>arr = Arrays.asList(7, 22, 81, 6, 4, 67, 92, 4 );
      
        Stream<Integer>strm = arr.stream().filter((Integer v)->v%2==0).map((Integer x)->x*x);
      
        List<Integer>ans = strm.collect(Collectors.toList());
      
        System.out.println(ans);
    }
}

