package exercise.codility;

//Reduce a string containing instances of the letters "A", "B" and "C" via the following rule: remove one occurrence of "AA", "BB" or "CC".
public class DisappearingPairs {

    private static final String[] pairs = {"AA", "BB", "CC"};
    public static String findDisappearingPairs(String S) {

        StringBuilder sb = new StringBuilder();
        sb.append(S);

        for (int i=0; i<pairs.length;) {
            String temp = sb.toString().replaceAll(pairs[i], "");
            if (temp.length() < sb.length()) {
                sb = new StringBuilder().append(temp);
                i = 0;
            } else {
                i++;
            }
        }
        return sb.toString();
    }

    public static void main(final String[] args) {
        // ABABAAB
        // ABABB
        // ABABB
        // ABA
        String S = "ABABACCAB";
        System.out.println(findDisappearingPairs(S));
    }
}
