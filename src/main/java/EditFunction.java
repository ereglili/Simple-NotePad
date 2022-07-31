
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
}
