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
        window.setLayout(null);
        ImageIcon icon = new ImageIcon("RobloxLauncher/images/icon.png");
        window.setIconImage(icon.getImage());
        ImageIcon backgroundImage = new ImageIcon("RobloxLauncher/images/background.png");
        JLabel background = new JLabel(backgroundImage);
        background.setBounds(0, 0, 500, 400);
        
        
        JButton launchButton = new JButton("LAUNCH ROADBLOCKS!!!");
        launchButton.setBounds(150, 275, 200, 35);
        launchButton.addActionListener(e -> {
            launchButton.setText("YAYYY!");
            new javax.swing.Timer(3000, evt -> launchButton.setText("LAUNCH ROADBLOCKS!!!")).start();
            try {
                String os = System.getProperty("os.name").toLowerCase();
                if (os.contains("mac")) {
                    new ProcessBuilder("open", "-a", "Roblox").start();
                } else if (os.contains("win")) {
                    new ProcessBuilder("cmd", "/c", "start", "", "Roblox").start();
                } else if (os.contains("nux") || os.contains("nix")) {
                    new ProcessBuilder("roblox").start();
                } else {
                    System.out.println("Unsupported OS: " + os);
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
        window.add(launchButton);
        window.add(background);
        window.setVisible(true);
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