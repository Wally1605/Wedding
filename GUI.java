import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener{
    JFrame frame;
    JPanel panel;
    JPanel panel2;

    JLabel intro;
    JLabel h1;
    JLabel h2;
    JLabel h3;
    JLabel h4;

    JLabel brideName;
    JTextField brideFirst;
    JTextField brideLast;
    JLabel groomName;
    JTextField groomFirst;
    JTextField groomLast;
    JLabel wed;
    JTextField wedDate;
    JTextField wedLoc;
    JButton submit;
    JLabel names;
    JLabel location;
    JLabel date;
    public GUI(){
        frame = new JFrame();

        panel = new JPanel();
        panel.setBackground(Color.PINK);

        h1 = new JLabel("❤",SwingConstants.CENTER);
        h1.setForeground(Color.red);

        intro = new JLabel("Wedding!");
        intro.setFont(new Font("Garamond",Font.BOLD,18));

        h2 = new JLabel("❤",SwingConstants.CENTER);
        h2.setForeground(Color.red);

        brideName = new JLabel("Bride's first/last:");
        brideName.setFont(new Font("Garamond",Font.PLAIN,14));

        brideFirst = new JTextField();
        brideFirst.setBackground(Color.lightGray);

        brideLast = new JTextField();
        brideLast.setBackground(Color.lightGray);

        groomName = new JLabel("Groom's first/last:");
        groomName.setFont(new Font("Garamond",Font.PLAIN,14));

        groomFirst = new JTextField();
        groomFirst.setBackground(Color.lightGray);

        groomLast = new JTextField();
        groomLast.setBackground(Color.lightGray);
        wed = new JLabel("Wedding Details: ");
        wed.setFont(new Font("Garamond",Font.PLAIN,14));

        wedDate = new JTextField("Enter Date");
        wedDate.setBackground(Color.lightGray);

        wedLoc = new JTextField("Enter Location");
        wedLoc.setBackground(Color.lightGray);
        submit = new JButton("Submit");
        submit.setBackground(Color.lightGray);
        submit.addActionListener(this);

        h3 = new JLabel("❤",SwingConstants.CENTER);
        h3.setForeground(Color.red);

        h4 = new JLabel("❤",SwingConstants.CENTER);
        h4.setForeground(Color.red);

        names = new JLabel("Couple: ");
        names.setFont(new Font("Garamond",Font.BOLD,15));

        location = new JLabel("Location: ");
        location.setFont(new Font("Garamond",Font.BOLD,15));

        date = new JLabel("Date: ");
        date.setFont(new Font("Garamond",Font.BOLD,15));

        panel.setBorder(BorderFactory.createEmptyBorder(10,20,10,20));
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(h1,gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(intro,gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(h2,gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(brideName,gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(brideFirst,gbc);

        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(brideLast,gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(groomName,gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(groomFirst,gbc);

        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(groomLast,gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(wed,gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(wedDate,gbc);

        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(wedLoc,gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(h3,gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(submit,gbc);

        gbc.gridx = 2;
        gbc.gridy = 4;
        panel.add(h4,gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 3;
        panel.add(names,gbc);


        gbc.gridx = 0;
        gbc.gridy = 6;
        panel.add(location,gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        panel.add(date,gbc);


        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Wedding");
        frame.pack();
        frame.setVisible(true);

    }


    public void actionPerformed(ActionEvent e) {
        Person person1 = new Person(brideFirst.getText(),brideLast.getText());
        Person person2 = new Person(groomFirst.getText(),groomLast.getText());
        Couple married = new Couple(person1, person2);
        Wedding event = new Wedding(wedDate.getText(), married, wedLoc.getText());
        names.setText(event.getNames());
        location.setText("Location: "+event.getLocation());
        date.setText("Date: "+event.getDate());


    }
}
