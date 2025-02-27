public class StringOccurances {
    public static void main(String[] args) {
        String input = "hello world";
        char letter = 'o';
        System.out.println(countOccurrences(input, letter));
    }

    public static int countOccurrences(String input, char letter) {
        int count = 0;
        for (int word = 0; word < input.length(); word++) {
            if (input.charAt(word) == letter) {
                count++;
            }
        }
        return count;
    }
}
