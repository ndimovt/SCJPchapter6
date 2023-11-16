package io.github.ndimovt.scjpchapter6.fileworking;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileUtility {
    private File file;
    private BufferedReader bufferedReader;
    private FileReader fileReader;
    private File getFile(){
        return file = new File("C:\\Users\\Nikolai\\IdeaProjects\\fileworking\\src\\main\\java\\io\\github\\ndimovt\\scjpchapter6\\fileworking\\working file.txt");
    }
    private String result(){
        String readingResult = null;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            fileReader = new FileReader(getFile());
            bufferedReader = new BufferedReader(fileReader);
            while(( readingResult = bufferedReader.readLine()) != null){
                stringBuilder.append(readingResult);
            }
            closeStreams(fileReader, bufferedReader, null);
        }catch (IOException ie){
            ie.printStackTrace();
        }
        return stringBuilder.toString();
    }
    private String capitalLetters(){
        StringBuilder clStringBuilder = new StringBuilder();
        Pattern p = Pattern.compile("[A-Z]");
        Matcher m = p.matcher(result());
        while(m.find()){
            clStringBuilder.append(m.group());
        }
        return clStringBuilder.toString();
    }
    private String smallLetters(){
        StringBuilder slStringBuilder = new StringBuilder();
        Pattern p = Pattern.compile("[a-z]");
        Matcher m = p.matcher(result());
        while(m.find()){
            slStringBuilder.append(m.group());
        }
        return slStringBuilder.toString();
    }
    private String numbers(){
        StringBuilder numSB = new StringBuilder();
        Pattern p = Pattern.compile("[\\d]");
        Matcher m = p.matcher(result());
        while(m.find()){
            numSB.append(m.group());
        }
        return numSB.toString();
    }
    public void createAndWrite(String fileName, String choice){
        try {
            File directory = new File("C:\\Users\\Nikolai\\IdeaProjects\\fileworking\\src\\main\\java\\io\\github\\ndimovt\\fileworking");
            File file = new File(directory, fileName + ".txt");
            if (!file.isFile()) {
                file.createNewFile();
            } else {
                System.out.println("File \"" + fileName + "\" already exists in this directory!");
            }
            PrintWriter pw = new PrintWriter(file);
            if(choice.equalsIgnoreCase("numbers")){
                pw.print(numbers());
                pw.flush();
                closeStreams(null,null,pw);
            } else if (choice.equalsIgnoreCase("capital letters")) {
                pw.print(capitalLetters());
                pw.flush();
                closeStreams(null,null,pw);
            } else if (choice.equalsIgnoreCase("small letters")) {
                pw.print(smallLetters());
                pw.flush();
                closeStreams(null,null,pw);
            }
        } catch (IOException ie) {
            ie.printStackTrace();
        }

    }
    public void delete(String name){
            File delDir = new File("C:\\Users\\Nikolai\\IdeaProjects\\fileworking\\src\\main\\java\\io\\github\\ndimovt\\scjpchapter6\\fileworking");
            File delFile = new File(delDir, name+".txt");
            if(delFile.isFile()){
                delFile.delete();
                System.out.println(name+" deleted successfully!");
            }else {
                System.out.println(name+" doesn't exist in current directory!");
            }
    }
    private void closeStreams(FileReader fileReader, BufferedReader bufferedReader, PrintWriter printWriter) throws IOException{
        if(fileReader != null){
            fileReader.close();
        }
        if(bufferedReader != null){
            bufferedReader.close();
        }
        if(printWriter != null){
            printWriter.close();
        }
    }


}
