package Application;

import javax.swing.*;

public class Main {

    public static void main(String[] args) throws Exception{

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                GUI gui = new GUI();
            }
        });

    }
}
