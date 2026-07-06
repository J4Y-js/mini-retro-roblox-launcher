import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame("ROADBLOCKS LAUNCHER");
        window.setSize(500, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null); // manual positioning, like before

        System.out.println("Looking in: " + new java.io.File("RobloxLauncher/images/background.png").getAbsolutePath()); //debug line to check the path

        // Load the image and put it in a label
        ImageIcon backgroundImage = new ImageIcon("RobloxLauncher/images/background.png"); // error on this line needs fixing -J
        System.out.println("Image width: " + backgroundImage.getIconWidth());
        JLabel background = new JLabel(backgroundImage);
        background.setBounds(0, 0, 500, 400); // covers the entire window
        window.add(background);

        JButton launchButton = new JButton("LAUNCH ROADBLOCKS!!!    ");
        launchButton.setBounds(130, 130, 140, 35);
        window.add(launchButton);
        
        window.setVisible(true);
    }
}