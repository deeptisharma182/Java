public class StreamPrac {

    public static void main(String []args){

        List<Integer>lst = Arrays.asList(2, 8, 5, 3, 48, 55);
        Integer ans = lst.stream().filter((Integer v)->v%2==0)
                                  .map((Integer x)->x*x)
                                  .reduce(0,(Integer x, Integer y)->x+y);
        System.out.print(ans);
    }
}
