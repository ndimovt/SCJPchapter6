package io.github.ndimovt.scjpchapter6.serialization;

import java.io.*;

public class Deserialize {
    public void deserializeCat(Cat cat) {
        try {
            File dir = new File("C:\\Users\\Nikolai\\IdeaProjects\\fileworking\\src\\main\\java\\io\\github\\ndimovt\\scjpchapter6\\serialization");
            File file = new File(dir, "serialization.ser");
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            cat = (Cat) ois.readObject();
            System.out.println(cat.toString());
            closeStream(ois);
        }catch (ClassNotFoundException cnfe){
            cnfe.printStackTrace();
        }catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }catch (IOException ie){
            ie.printStackTrace();
        }
    }
    private void closeStream(ObjectInputStream objectInputStream) throws IOException{
        if(objectInputStream != null){
            objectInputStream.close();
        }
    }
}
