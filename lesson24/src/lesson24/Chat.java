package lesson24;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Chat extends JFrame{
    JPanel jpN = new JPanel(new GridLayout());
    JPanel jpS = new JPanel(new GridLayout());

    JButton jb = new JButton("ОТПРАВИТЬ");
    JTextArea jta = new JTextArea();
    JScrollPane jsp = new JScrollPane(jta);
    JTextField jtf = new JTextField();

    JMenuBar mainMenu = new JMenuBar();
    JMenu mFile = new JMenu("Файл");
    JMenu mHelp = new JMenu("Помощь");
    JMenuItem miFileExit = new JMenuItem("Выход");
    JMenuItem miHelpAbout = new JMenuItem("О программе");

    PrintWriter pw = new PrintWriter(new FileWriter("1.txt"));

    Chat() throws IOException {
        super("Чат");
        setSize(600, 800);
        setMinimumSize(new Dimension(600, 800));

        jta.setLineWrap(true);
        jta.setEditable(false);

        //Действия
        jb.addActionListener(e -> {
            sendMessage();
        });
        jtf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) sendMessage();
            }
        });

        jpN.add(jsp);
        jpS.add(jtf);
        jpS.add(jb);

        add(jpN);
        add("South", jpS);

        //Меню
        setJMenuBar(mainMenu);
        mainMenu.add(mFile);
        mainMenu.add(mHelp);
        mFile.add(miFileExit);
        mHelp.add(miHelpAbout);
        miFileExit.addActionListener(e -> System.exit(0));
        miHelpAbout.addActionListener(e -> JOptionPane.showMessageDialog(null,"Чат", "О программе", JOptionPane.INFORMATION_MESSAGE));

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    //Отправка сообщения и запись в файл
    void sendMessage() {
        String out = jtf.getText();
        jta.append(getTime() + ": " + out + "\n");
        pw.append(getTime() + ": " + out + "\n");
        pw.flush();
        jtf.setText("");
        jtf.grabFocus();
    }

    //Возвращение текущего времени
    public String getTime() {
        return new SimpleDateFormat("HH:mm:ss").format(new Date());
    }

}