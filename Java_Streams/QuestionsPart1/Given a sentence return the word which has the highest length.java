public class StreamPrac {

    public static void main(String []args){

       //Given a sentence return the word which has the highest length
        String temp = "I am learning streams API in java";

        Optional<String> ans = Arrays.stream(temp.split(" ")).sorted((a,b)->b.length()-a.length()).findFirst();
        System.out.println(ans.get());

    }

}
