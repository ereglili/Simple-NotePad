
public class FormatFunction {
    
    GUI gui;
    
    public FormatFunction(GUI gui) {
        this.gui = gui;
    }
    
    public void wordwrap(){
        if(gui.wordwrapon==false){
            gui.wordwrapon=true;
            gui.textArea.setLineWrap(true);
            gui.textArea.setWrapStyleWord(true);
            gui.itemWrap.setText("Word Wrap: On");
        }
        
        else if(gui.wordwrapon==true){
            gui.wordwrapon=false;
            gui.textArea.setLineWrap(false);
            gui.textArea.setWrapStyleWord(false);
            gui.itemWrap.setText("Word Wrap: Off");
        }
    }
}
