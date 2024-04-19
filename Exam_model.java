import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Exam_model {
    
    
    public Exam_model(){

    }

    public void addInfo(String[] inField){
        
        File file = new File(inField[0] + ".txt");
       
        try( FileWriter fileWriter = new FileWriter(inField[0] + ".txt",true);){
        

        for(String inf : inField){
            fileWriter.write(inf + " ");
        }
        fileWriter.write("\n");
    }
        catch(IOException e){
            e.printStackTrace();
        } 
        
    
    }
    
}
