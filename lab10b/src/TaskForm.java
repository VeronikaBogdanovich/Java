import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;

public class TaskForm extends JFrame {

    private Task task;

    private JTextField inputListTextField;
    private JTextArea textArea;
    private JTextField inputKTextField;
    private JTextArea resultTextArea;
    private JPanel rootPanel;

    public TaskForm(Task task) {
        this.task = task;
        setContentPane(rootPanel);
        pack();
        setSize(600, 300);
        setVisible(true);

        inputListTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    try {

                        task.addToList(Integer.valueOf(inputListTextField.getText()));
                        inputListTextField.setText("");
                        updateTextArea();
                    } catch (NumberFormatException e1) {
                        e1.printStackTrace();
                        return;
                    }
                }
            }
        });

        inputKTextField.addActionListener(e-> {
            List<Integer> list = task.getList();
            Task.bubbleSort(list);
            Integer k = Integer.valueOf(inputKTextField.getText());
            boolean isShownK = false;

            resultTextArea.setText("[");

            for(Integer item:list){

                if (item >= k && !isShownK) {
                    isShownK = true;
                    resultTextArea.append(" k = "+k+", "+ item+", ");
                    continue;
                }
                resultTextArea.append(item + ",");
            };
            resultTextArea.append("]");

        });
    }

    private void updateTextArea() {
        textArea.setText(task.getList().toString());
    }


}
