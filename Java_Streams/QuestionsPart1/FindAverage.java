//    Find average of all numbers in the list
{
        List<Integer>lst = Arrays.asList(2, 8, 5, 3, 48, 55);

//        Integer ans  = lst.stream().reduce(0,(Integer a, Integer b)->a+b);
//        long countt = lst.stream().count();
//        System.out.println(ans/countt);
        
        OptionalDouble avg = lst.stream().mapToInt(Integer :: intValue).average();
        System.out.println(avg);
}
