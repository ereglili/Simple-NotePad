
import java.awt.Font;

public class FormatFunction {
    
    GUI gui;
    Font Arial,comicSansMS,timesNewRoman;  
    String selectedfont;
    
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
    public void createfont(int fontSize){
        
        Arial = new Font("Arial",Font.PLAIN, fontSize);
        comicSansMS = new Font("Comic Sans MS",Font.PLAIN, fontSize);
        timesNewRoman = new Font("Times New Roman",Font.PLAIN, fontSize);
        
        setfont(selectedfont);
    }
    public void setfont(String font){
        selectedfont = font;
        
        switch (selectedfont) {
            case "Arial":
                gui.textArea.setFont(Arial);
                break;
            case "Comic Sans MS":
                gui.textArea.setFont(comicSansMS);
                break;
            case "Times New Roman":
                gui.textArea.setFont(timesNewRoman);
                break;
        }
    }
}
