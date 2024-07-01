package SNAKEGAME;

import javax.swing.*;

public class snakegame extends JFrame {

    snakegame(){
        super("Snake Game");
        add(new Board());
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    public static void main(String[] args){
        new snakegame().setVisible((true));;
    }
}
