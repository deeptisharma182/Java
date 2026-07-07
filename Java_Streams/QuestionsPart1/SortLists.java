public class StreamPrac {

    public static void main(String []args){
      //Sort a list
        List<Integer>lst = Arrays.asList(9, 2, 8, 5, 3, 48, 55);

        //Ascending Order
        List<Integer>ansAsc = lst.stream().sorted().collect(Collectors.toList());
        System.out.println(ansAsc);

      
        //Descending Order
        List<Integer>ansDesc = lst.stream().sorted((Integer a, Integer b)->b-a).collect(Collectors.toList());
        System.out.println(ansDesc);

    }

}
