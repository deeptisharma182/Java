 // Find All Distinct Elements From List (Remove Dupl)

public class StreamPrac {

    public static void main(String []args){

    // Find All Distinct Elements From List (Remove Dupl)
        List<Integer>lst = Arrays.asList(2, 55, 8, 8, 5, 2, 3, 48, 55, 6, 3);

        Set<Integer>anss= lst.stream().collect(Collectors.toSet());

        System.out.print(anss);
    }

}
