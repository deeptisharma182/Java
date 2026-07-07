public class StreamPrac {

    public static void main(String []args){
      //Find the max number in list
        List<Integer>arr = Arrays.asList(3,4, 7, 10, 66 , 33, 1 ,2 , 8);
        Integer ans = arr.stream().reduce(0,(Integer a, Integer b)-> Math.max(a,b));
        System.out.println(ans);
    }

}
