import javax.swing.*;
import javax.sound.sampled.*;
import java.io.IOException;
import java.io.File;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame("ROADBLOCKS LAUNCHER (SAFE)");
        window.setSize(500, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null); // manual positioning, like before

        ImageIcon icon = new ImageIcon("RobloxLauncher/images/icon.png");
        window.setIconImage(icon.getImage());

        // Load the image and put it in a label
        ImageIcon backgroundImage = new ImageIcon("RobloxLauncher/images/background.png");
        JLabel background = new JLabel(backgroundImage);
        background.setBounds(0, 0, 500, 400); // covers the entire window
        
        
        JButton launchButton = new JButton("LAUNCH ROADBLOCKS!!!");
        launchButton.setBounds(150, 275, 200, 35);
        launchButton.addActionListener(e -> {
    try {
        ProcessBuilder pb = new ProcessBuilder("open", "-a", "Roblox");
        pb.start();
    } catch (IOException ex) {
        ex.printStackTrace();
    }
});

        window.add(launchButton);
        window.add(background);
        window.setVisible(true);

        // Add this after window.setVisible(true), or wherever you want playback to start
try {
    File musicFile = new File("RobloxLauncher/audio/music.wav");
    AudioInputStream audioStream = AudioSystem.getAudioInputStream(musicFile);
    Clip clip = AudioSystem.getClip();
    clip.open(audioStream);
    clip.start();
} catch (Exception e) {
    e.printStackTrace();
}

    }
}