import jdk.nashorn.internal.scripts.JO;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class LogNotes {
    private JPanel rotPanel;
    private JTextArea textArea1;
    private JButton sparaButton;
    private JButton nyButton;
    private JButton öppnaButton;
    private JButton button1;
    private String filename;

    public static void main(String[] args) {

        JFrame frame = new JFrame("LogNotes");
        frame.setContentPane(new LogNotes().rotPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(1024, 768);



    }

    public LogNotes() {
        sparaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        öppnaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fc = new JFileChooser();
                fc.setCurrentDirectory(new java.io.File("C:/Users/peda16/Desktop"));
                fc.setDialogTitle("Hello World!");
                fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
                if (fc.showOpenDialog(öppnaButton) == JFileChooser.APPROVE_OPTION)
                {
                    try {
                        Scanner in = new Scanner(fc.getSelectedFile());
                        while (in.hasNext()){textArea1.setText(in.nextLine());}
                    } catch (FileNotFoundException e1) {
                        e1.printStackTrace();

                    }
                }
            }
        });
        nyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText("");
            }
        });
        sparaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                BufferedReader inström = null;

                if (filename == null);
                    filename = "C:\\Users\\peda16\\Desktop\\" + JOptionPane.showInputDialog(null, "What the flip do you what the frickin file to be named?");


            PrintWriter utström = null;
                try {
                    utström = new PrintWriter(new BufferedWriter(new FileWriter(filename)));
                }
                catch (IOException e1) {
                e1.printStackTrace();
                }

                String rad = textArea1.getText();

                utström.println(rad);
                utström.close();
        }});
    }

}

