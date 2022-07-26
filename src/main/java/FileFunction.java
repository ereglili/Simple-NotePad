
import java.awt.FileDialog;


public class FileFunction {
    
    GUI gui;
    
    
    public FileFunction(GUI gui){
    
        this.gui = gui;
}
    public void newFile(){
        
        gui.textArea.setText("");
        gui.window.setTitle("NewFile");
    }
    public void Open() {
        
        FileDialog fd = new FileDialog(gui.window, "Open", FileDialog.LOAD);
        fd.setVisible(true);
        
        
            
        }
    }
    
        
        
   
