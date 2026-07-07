  public class StreamPrac {

    public static void main(String []args){
        List<List<Integer>>temp = Arrays.asList(Arrays.asList(3, 4, 5, 6),
                                                Arrays.asList(22, 23,24, 25),
                                                Arrays.asList(1001,1111,4444, 7777),
                                                Arrays.asList(322,666, 832, 0));

        List<Integer>ans = temp.stream().flatMap(List :: stream).collect(Collectors.toList());
        System.out.println(ans);
    }
