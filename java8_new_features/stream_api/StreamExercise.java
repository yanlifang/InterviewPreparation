/**
 * @author bigO
 * @date 5/9/22 7:19 AM
 * https://blog.devgenius.io/15-practical-exercises-help-you-master-java-stream-api-3f9c86b1cf82
 * https://github.com/gavinklfong/stream-api-exercises
 */

public class StreamExercise {
    @Test
    public void testMapAndFlatMap() {
        List<String> words = new ArrayList<String>();
        words.add("hello");
        words.add("world");

        ////将words数组中的元素再按照字符拆分，然后字符去重，最终达到["h", "e", "l", "o", "w", "r", "d"]
        //        //如果使用map，是达不到直接转化成List<String>的结果
        List<String> stringList = words.stream()
                .flatMap(word - > Arrays.stream(word.split("")))
                .distinct()
                .collect(Collections.toList());
        stringList.forEach(e -> System.out.println(e));
    }

    @Test
    public void testMapAndFlatMap2() {
        List<String> words = new ArrayList<String>();
        words.add("hello");
        words.add("world");

        List<Stream<String>> collect = words.stream()
                .map(word -> Arrays.stream(word.split("")))
                .distinct()
                .collect(Collections.toList());
        collect.forEach(e -> System.out.println(e));
        System.out.println("**** above are stream objects, below are character ****");
        for (Stream<String> stringStream : collect) {
            stringStream.forEach(System.out::println);
        }

    }


}