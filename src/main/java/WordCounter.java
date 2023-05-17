
public class WordCounter {
    private Map<String, Integer> wordCount;

    public WordCounter() {
        this.wordCount = new HashMap<>();
    }

    public void countWords(String sentence) {
        String[] words = sentence.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        for (String word : words) {
            int count = wordCount.getOrDefault(word, 0);
            wordCount.put(word, count + 1);
        }
    }

    public void printWordCount() {
        System.out.println("Word\tOccurrences");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
    }
}
