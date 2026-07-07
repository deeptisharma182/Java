// Count how many numbers are greater than 5 in the list

public class StreamPrac {

    public static void main(String []args){
      List<Integer>arr = Arrays.asList(1, 11, 3, 77,2, 3,7);
         long ans = arr.stream().filter((Integer v)->v>5).count();
         System.out.println(ans);

    }

}

