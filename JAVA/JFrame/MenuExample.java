package JFrame;

import javax.swing.*;

public class MenuExample {
    
    MenuExample(){
        JMenu menu,submenu,Edit;
        JMenuItem i1,i2,i3,i4;
        JFrame f = new JFrame();
        JMenuBar mb = new JMenuBar();
        menu = new JMenu("Menu");
        Edit =new JMenu("Edit");
        submenu = new JMenu("Menue bar");
        i1 = new JMenuItem("Item 1");
        i2 = new JMenuItem("Item 2");
        i3 = new JMenuItem("Item 3");
        i4 = new JMenuItem("Item 4");
        menu.add(i1);
        menu.add(i2);
        submenu.add(i3);
        submenu.add(i4);
        menu.add(submenu);
        mb.add(menu);
        mb.add(Edit);
        f.setJMenuBar(mb);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        
    }
    public static void main(String[] args) {
        new MenuExample();
    }
}
