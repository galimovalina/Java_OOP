package Seminar_6.S;

public class TextAppender {
    public Text appendText(Text currentText, Text newText){
        return new Text(currentText.getText()+newText.getText());
    }

}
