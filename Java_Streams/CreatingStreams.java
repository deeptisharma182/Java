//List->Stream
List<Integer>temp = Arrays.asList(1,2,3,4,5);
Stream<Integer>strm = temp.stream();

//Array->Stream
String []strs = {"whrdb", "qiuwh", "poij", "hebd"};
Stream<String>strm2 = Arrays.stream(strs);

//Random Values
Stream<Integer>strmX = Stream.of(1, 6, 10, 5, 77);
