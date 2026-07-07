public class StreamPrac {

    public static void main(String []args){
        // Find the first number greater than 10 from the list
        List<Integer>arr = Arrays.asList(7, 2, 81, 6, 4, 67, 92, 4 );

        Optional<Integer>frst = arr.stream().filter((Integer v)->v>10).findFirst();
        System.out.println(frst.get());
    }

}
