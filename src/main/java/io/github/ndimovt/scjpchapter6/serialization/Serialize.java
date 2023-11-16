package io.github.ndimovt.scjpchapter6.serialization;

import java.io.*;

public class Serialize {
    public void serializeCat(Cat serializeCat){
        try{
            File fileDir = new File("C:\\Users\\Nikolai\\IdeaProjects\\fileworking\\src\\main\\java\\io\\github\\ndimovt\\scjpchapter6\\serialization");
            File file = new File(fileDir,"serialization.ser");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(serializeCat);
            closingStreams(outputStream);
            if(file.exists()) {
                System.out.println("Serialization successful");
            }
        }catch (FileNotFoundException fileNotFoundException){
            System.out.println("Serialization not successful! Directory or file are corrupted!");
            fileNotFoundException.printStackTrace();
        }catch (IOException ie){
            ie.printStackTrace();
        }
    }
    private void closingStreams(ObjectOutputStream ous) throws IOException {
        if(ous != null){
            ous.close();
        }
    }
}
