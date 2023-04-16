package Seminar_6.S;

public class Main {
    public static void main(String[] args) {
        Text text=new Text("Мама мыла раму");
        Text text2=new Text(" папа мыл раму");
        Word word=new Word("руки");
        Word word2=new Word("раму");
        Word word3=new Word("мыла");
        WordReplacer wordRep=new WordReplacer();
        WordDeleter wordDel=new WordDeleter();
        TextAppender textAp=new TextAppender();
        TextPrinter textPrint=new TextPrinter();

        textPrint.printText(text);
        Text textFinal=new Text(wordRep.replaceWordInText(text,word2,word));
        System.out.println(textFinal);
        Text textFinal2=new Text(wordDel.deleteWordInText(text,word3));
        System.out.println(textFinal2);
        Text textFinal3=new Text(textAp.appendText(text, text2).getText());
        System.out.println(textFinal3);

    }
}
