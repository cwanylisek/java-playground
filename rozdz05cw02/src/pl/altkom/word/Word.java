package pl.altkom.word;

public class Word {
    public static void main(String[] args) {
        String text = "Dowolna treść, nie ma to znaczenia, możecie wymyśleć cokolwiek.";
        int textLength = text.length();
        String backwords = "";
        for (int testVar = textLength - 1; testVar >= 0; testVar--) {
            char mark = text.charAt(testVar);
            if (Character.isLetter(mark)) {
                mark = Character.toLowerCase(mark);
            } else {
                mark = Character.toUpperCase(mark);
            }
            backwords += mark;
        }
        System.out.println(text);
        System.out.println(backwords);
    }

}
