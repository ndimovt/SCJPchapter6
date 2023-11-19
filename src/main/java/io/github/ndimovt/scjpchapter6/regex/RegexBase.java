package io.github.ndimovt.scjpchapter6.regex;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class RegexBase {
    private GenerateNumber gn = new GenerateNumber();
    private File file;
    public File createFile() {
        try {
            File directory = new File("C:\\Users\\Nikolai\\IdeaProjects\\fileworking\\src\\main\\java\\io\\github\\ndimovt\\scjpchapter6\\regex");
            file = new File(directory,"barcodes.txt");
            file.createNewFile();
        }catch (IOException ie){
            ie.printStackTrace();
        }
        return file;

    }
    public void populateFile(){
        try {
            FileWriter fw = new FileWriter(createFile());
            PrintWriter prw = new PrintWriter(fw);
            for (int i = 0; i <20 ; i++) {
                prw.write(gn.barcode()+",");
            }
            prw.flush();
            close(fw,prw);
        }catch (IOException ie){
            ie.printStackTrace();
        }
    }
    private void close(FileWriter fileWriter, PrintWriter pw) throws IOException{
        if(fileWriter != null){
            fileWriter.close();
        }
        if(pw != null){
            pw.close();
        }
    }

}
