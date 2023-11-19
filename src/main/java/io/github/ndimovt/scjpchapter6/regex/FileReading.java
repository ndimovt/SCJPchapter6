package io.github.ndimovt.scjpchapter6.regex;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileReading {
    private String read(){
        String line;
        RegexBase rb = new RegexBase();
        StringBuilder regex = new StringBuilder();
        try{
            FileReader fr = new FileReader(rb.createFile());
            BufferedReader bfr = new BufferedReader(fr);
            while((line = bfr.readLine()) != null){
                regex.append(line);
            }
            close(fr,bfr);
        }catch (FileNotFoundException fnf){
            fnf.printStackTrace();
        }catch (IOException ie){
            ie.printStackTrace();
        }
        return regex.toString();
    }
    public void result() {
        String[] barcodes = read().split(",");
        Pattern p = Pattern.compile("^\\d{3}");
        String result;
        for (String pref : barcodes) {
            Matcher m = p.matcher(pref);
            while(m.find()){
                result = m.group();
                if(result.equals("380")){
                    System.out.println(pref + " Bulgaria");
                } else if (result.equals("383")) {
                    System.out.println(pref + " Slovenia");
                } else if (result.equals("389")) {
                    System.out.println(pref + " Montenegro");
                }
            }
        }
    }

    private void close(FileReader fileReader, BufferedReader bufferedReader) throws IOException{
        if(fileReader != null){
            fileReader.close();
        }
        if(bufferedReader != null){
            bufferedReader.close();
        }
    }
}
