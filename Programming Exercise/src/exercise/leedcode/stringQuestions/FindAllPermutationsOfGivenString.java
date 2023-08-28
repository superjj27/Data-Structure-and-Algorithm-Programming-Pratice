package exercise.leedcode.stringQuestions;

//find all permutations of given string
public class FindAllPermutationsOfGivenString {

    public void permutation(String input) {
        permutation("", input);
    }

    private void permutation(String perm, String word) {
        if (word.isEmpty()) {
            System.out.println(perm + word);
        } else {
            for (int i = 0; i < word.length(); i++) {
                permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1));
            }
        }
    }

    public static void main(final String[] args) {
      FindAllPermutationsOfGivenString test = new FindAllPermutationsOfGivenString();
        test.permutation("ABC");
    }
}
