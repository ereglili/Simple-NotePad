
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class GUI implements ActionListener {
    
    JFrame window;
    JTextArea textArea;
    JScrollPane scrollPane;
    JMenuBar menuBar;
    JMenu menuFile,menuEdit,menuFormat;
    JMenuItem itemNew,itemOpen,itemSave,itemSaveas,itemExit;    
    
    FileFunction file = new FileFunction(this);
    
    public static void main(String[] args) {
        
        new GUI();
    }
    public GUI() {
        
        createWindow();
        createtextArea();
        createMenuBar();
        createFileMenu();
        
        window.setVisible(true);
        
    }
    public void createWindow(){
        
        window = new JFrame("NotePad");
        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void createtextArea(){
        
        textArea = new JTextArea();
        scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED , JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        window.add(scrollPane); 

    }
    public void createMenuBar(){
        menuBar = new JMenuBar();
        window.setJMenuBar(menuBar);
        
        menuFile = new JMenu("File");
        menuBar.add(menuFile);
        
        menuEdit = new JMenu("Edit");
        menuBar.add(menuEdit);
        
        menuFormat = new JMenu("Format");
        menuBar.add(menuFormat);
    }
    public void createFileMenu(){
        itemNew = new JMenuItem("New");
        itemNew.addActionListener(this);
        itemNew.setActionCommand("New");
        menuFile.add(itemNew);
        
        itemOpen = new JMenuItem("Open");
        itemOpen.addActionListener(this);
        itemOpen.setActionCommand("Open");
        menuFile.add(itemOpen);
        
        itemSave = new JMenuItem("Save");
        menuFile.add(itemSave);
        
        itemSaveas = new JMenuItem("Save As");
        menuFile.add(itemSaveas);
        
        itemExit = new JMenuItem("Exit");
        menuFile.add(itemExit);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        switch(command) {
            case "New": file.newFile(); break;
            case "Open": file.Open(); break;
        }
    }
}
