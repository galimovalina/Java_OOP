package Seminar_6.S;

public class WordDeleter {
    public String deleteWordInText(Text text, Word wordToDelete) {
        String inputText = text.getText();
        if (inputText.contains(wordToDelete.getWord())) {
            inputText = inputText.replace(wordToDelete.getWord(), "");
        }
        return inputText;
    }
}
