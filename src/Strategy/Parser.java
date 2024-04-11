package src.Strategy;

import java.util.Arrays;

public class Parser {
    void showResult(String path){
        ParseDoc parser = null;
        String[] ext = path.split("\\.");
        String str = (ext[ext.length - 1]).trim();//получили расширение файла
        if(str.equals("xml")){
            parser = new ParseXML();
        }else if(str.equals("json")){
            parser = new ParseJSON();
        }
        parser.parse(path);



    }

    public static void main(String[] args) {
        new Parser().showResult("test.xml");
    }
}
