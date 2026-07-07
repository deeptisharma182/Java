public class StreamPrac {

    public static void main(String []args){      
        List<Integer>nums = Arrays.asList(1,2,3,4,5, 90, 7, 66, 43);
        Stream<Integer>strm = nums.stream().filter((Integer v)->v%2==0);
        List<Integer>anss = strm.collect(Collectors.toList());
        System.out.println(anss);
    }
                                           
}
