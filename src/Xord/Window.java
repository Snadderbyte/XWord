package Xord;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Window extends JFrame implements ActionListener {
    private List<JTextField> textFields;
    private JButton checkButton;

    public Window(int rows, int cols, Solution solution) {
        GridLayout xwordLayout = new GridLayout(rows, cols);
        JPanel xwordPanel = new JPanel();
        xwordPanel.setLayout(xwordLayout);


        textFields = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                String s = "";
                if (i == rows - 1 && j == cols - 1) {
                    s = "aa";
                }

                JTextField field = new JTextField(s);
                xwordPanel.add(field);
                textFields.add(field);
            }
        }

        JPanel controlPanel = new JPanel(new GridLayout(1, 0));
        checkButton = new JButton("Check the XWords");
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(checkAllFields(solution));
            }
        });
        controlPanel.add(checkButton);

        GridBagConstraints constraints = new GridBagConstraints();


        setLayout(new GridBagLayout());
        setSize(cols * 23 , rows * 27);
        constraints.gridy = 0;
        constraints.gridwidth = cols;
        add(xwordPanel, constraints);
        constraints.gridy = 1;
        add(controlPanel, constraints);
        setVisible(true);
    }

    public String getText(int index) {
        return textFields.get(index).getText();
    }

    public void setTextFieldText(String s, int i) {
        textFields.get(i).setText(s);
    }

    public boolean checkField(int index, String s) {
        if (textFields.get(index).getText().compareTo(s) == 0 && s != null)
            return true;
        return false;
    }
    public boolean checkAllFields(Solution s) {
        for (int i = 0; i < s.getList().size(); i++) {
            if (!checkField(i, s.getElement(i)))
                return false;
        }
        return true;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
