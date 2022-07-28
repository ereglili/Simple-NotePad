
import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileWriter;  


public class FileFunction {
    
    GUI gui;
    String fileName,fileAddress;
    
    
    public FileFunction(GUI gui){
    
        this.gui = gui;
}
    public void newFile(){
        
        gui.textArea.setText("");
        gui.window.setTitle("NewFile");
        fileName = null;
        fileAddress = null;
    }
    public void Open() {
        
        FileDialog fd = new FileDialog(gui.window, "Open", FileDialog.LOAD);
        fd.setVisible(true);
        
        if(fd.getFile()!=null) {
            fileName = fd.getFile();
            fileAddress = fd.getDirectory();
            gui.window.setTitle(fileName);
        }
        System.out.println("File Adress and File Name :  "+fileAddress+fileName);
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileAddress + fileName));
            
            gui.textArea.setText("");
            
            String line = null;
            
            while((line = br.readLine())!=null) {
                gui.textArea.append(line+ "\n");
        }
            br.close();
        } catch (Exception e) {
    }
            System.out.println("FİLE NOT OPENED!");
        }
    
    
    
    public void Save(){
        if(fileName==null){
            Saveas();
        }
        else{
            try {
                
            } catch (Exception e) {
                System.out.println("SOMETHING WRONG!");
            }
        }
    }
    
    public void Saveas(){
        FileDialog fd = new FileDialog(gui.window, "Save", FileDialog.SAVE);
        fd.setVisible(true);
        
        if(fd.getFile()!=null){
            fileName = fd.getFile();
            fileAddress = fd.getDirectory();
            gui.window.setTitle(fileName);
        }
        
        try {
            FileWriter fw = new FileWriter(fileAddress+fileName);
            fw.write(gui.textArea.getText());
            fw.close();
        } catch (Exception e) {
            System.out.println("SOMETHING WRONG!");
        }
    }
    }
    
        
        
   
