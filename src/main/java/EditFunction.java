
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class EditFunction {
    GUI gui;
    public EditFunction(GUI gui){
        this.gui = gui;
        
    }
    public void copy(){
        gui.textArea.copy();
    }
    public void cut(){
        gui.textArea.cut();
    }
    public void paste(){
        gui.textArea.paste();
    }
    public void selectall(){
        gui.textArea.selectAll();
    }
    public void date(){
        Date d = new Date();
        DateFormat df = new SimpleDateFormat(" kk:mm  dd.MM.yyyy");
        gui.textArea.setText(gui.textArea.getText()+df.format(d));
    }
}
