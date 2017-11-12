package WordCount;

public class WordCount {

    public static int count(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }
        String[] words = sentence.split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        System.out.println(count("Java is best"));
    }

}
