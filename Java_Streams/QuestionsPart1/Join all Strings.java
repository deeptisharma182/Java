
public class StreamPrac {

    public static void main(String []args){
      
//        Join all Strings in a list into a single 'space' seperated String
        List<String>temp = Arrays.asList("life","is", "so", "so", "good");
      
        String ans = temp.stream().reduce("", (String a,String b)->a+" "+b);
      
        System.out.println(ans);
    }

}
