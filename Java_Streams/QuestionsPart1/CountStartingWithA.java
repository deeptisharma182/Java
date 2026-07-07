public class StreamPrac {

    public static void main(String []args){
      // Count Strings Starting With 'a'
       List<String>temp = Arrays.asList("xnbds","aknbds", "rtghj", "aanddf", "abds");
       long ans = temp.stream().filter((String x)-> x.charAt(0)=='a').count();
        System.out.println(ans);
    
    }
}
