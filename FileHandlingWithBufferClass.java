import java.io.*;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;

public class FileHandlingWithBufferClass {
    private static final String NULL = null;

    public static void main(String[] args){
      try{
     BufferedWriter writer = new BufferedWriter(new FileWriter("MyEducation.txt"));
      writer.write("I have completed +2 in Nepal, which is high school board examination");
      writer.write("\nI started my secondary education journey from Greenplant Boarding School.");
      writer.close();

     
        BufferedReader reader = new BufferedReader(new FileReader("MyEducation.txt"));
        String line;
        while((line = reader.readLine())!= NULL){
        System.out.println(line);
        }
        reader.close();

      BufferedWriter appendWriter = new BufferedWriter(new FileWriter("MyEducation.txt",true));
      appendWriter.write("\nI am currently searching for an internship in Butwal, Nepal.");
      appendWriter.close();

      BufferedReader newReader = new BufferedReader(new FileReader("MyEducation.txt"));
      String readAll;
      while((readAll = newReader.readLine())!= null){
        System.out.println(readAll);
      }
      newReader.close();
    }catch(IOException e){
      e.printStackTrace();
    }
    }
  }