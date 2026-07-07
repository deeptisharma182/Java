public class StreamPrac {

    public static void main(String []args){
      
      List<Integer>lst = Arrays.asList(2, 4, 7, 8, 9 ,10);

        Integer summ = lst.stream().reduce(0,(Integer a, Integer b)->a+b);
        System.out.println(summ);
      
        Integer prod = lst.stream().reduce(1, (Integer a, Integer b)->a*b);
        System.out.println(prod);
    }
}
