public class StreamPrac {

    public static void main(String []args){

    //        Partition a List -> even odd
          List<Integer>nums = Arrays.asList(88, 2, 1, 90,27, 3, 56, 23,11, 67);

          Map<Boolean, List<Integer>>mp = nums.stream().collect(Collectors.partitioningBy((Integer a)->a%2==0));

          System.out.println("Even numbers -> "+mp.get(true));
          System.out.println("Odd numbers -> "+ mp.get(false));


    }

}
