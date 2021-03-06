package GUI;

import animal.Animal;
import animal.Mammal;
import animal.Reptile;
import exceptions.InvalidNameException;
import exceptions.InvalidWeightException;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * SimpleGUI.java This program uses variety of GUI objects and it allows the
 * user to interact with the objects.
 */
public class SimpleGUI extends JFrame implements ActionListener {

    /**
     * variable to keep track of objects in the array
     */
    private int count = 0;
    /**
     * Array to hold mammal and reptile objects
     */
    private final Animal[] animalsArray = new Animal[10];
    /**
     * GUI component for getting the name
     */
    private GetInputPanel namePanel = null;
    /**
     * GUI component for getting color
     */
    private GetInputPanel colorPanel = null;
    /**
     * GUI component for getting length
     */
    private GetComboPanel lengthPanel = null;
    /**
     * GUI component for getting the weight
     */
    private GetInputPanel weightPanel = null;
    /**
     * GUI component for getting the age
     */
    private GetComboPanel agePanel = null;
    /**
     * Button for adding a reptile to the collection
     */
    private JButton addReptileButton = null;
    /**
     * Button for adding a reptile to the collection
     */
    private JButton addMammalButton = null;
    /**
     * Button for displaying animals in the collection
     */
    private JButton displayAnimalsButton = null;
    /**
     * A temporary GUI component for validating data
     */
    protected JTextArea verifyArea = new JTextArea("\nFill in the input fields"
            + " and click on an animal picture to add an animal to the array\n "
            + "-----------------------------------------"
            + "-------------------------------------------------"
            + "--------------------", 20, 35);

    /**
     * Main method launching the application.
     */
    public static void main(String[] args) {
        SimpleGUI frame = new SimpleGUI();
        frame.setSize(750, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * Constructor creates the SimpleGUI frame with a title
     */
    public SimpleGUI() {
        super("Animal Project");
        createGUI();
    }

    /**
     * method createGUI creates GUI objects and adds them to the frame
     */
    private void createGUI() {
        Container c = this.getContentPane();
        c.setLayout(new BorderLayout(3, 5)); // 5 pixels hor and vert gap

        JPanel inputPanel = new JPanel();     //contains various input panels
        inputPanel.setLayout(new GridLayout(3, 1));
        namePanel = new GetInputPanel(20, "     Animal's Name: ");
        inputPanel.add(namePanel);
        colorPanel = new GetInputPanel(20, "    Animal's Color: ");
        inputPanel.add(colorPanel);
        lengthPanel = new GetComboPanel("Animal's Length (cm)", 1000);
        inputPanel.add(lengthPanel);
        weightPanel = new GetInputPanel(6, "   Animal's Weight (lb): ");
        inputPanel.add(weightPanel);
        agePanel = new GetComboPanel("Animal's Age (years)", 125);
        inputPanel.add(agePanel);

        JPanel buttonPanel = new JPanel();  //contains buttons
        buttonPanel.setLayout(new GridLayout(1, 3, 5, 5));

        addReptileButton = new JButton();
        addMammalButton = new JButton();
        try {
            Image reptiles = ImageIO.read(getClass().getResource("reptiles."
                    + "jpg"));
            addReptileButton.setIcon(new ImageIcon(reptiles));
        } catch (IOException e) {
        }
        addMammalButton = new JButton();
        try {
            Image mammals = ImageIO.read(getClass().getResource("mammals.jpg"));
            addMammalButton.setIcon(new ImageIcon(mammals));
        } catch (IOException e) {
        }

        displayAnimalsButton = new JButton("Display Animals");

        addReptileButton.setToolTipText("Press to add Reptile");
        addMammalButton.setToolTipText("Press to add Mammal");

        buttonPanel.add(addReptileButton);
        buttonPanel.add(addMammalButton);
        buttonPanel.add(displayAnimalsButton);

        JScrollPane p = new JScrollPane(verifyArea);

        c.add(inputPanel, BorderLayout.NORTH);
        c.add(buttonPanel, BorderLayout.CENTER);
        c.add(p, BorderLayout.SOUTH);

        addReptileButton.addActionListener(this);
        addMammalButton.addActionListener(this);
        displayAnimalsButton.addActionListener(this);
        setVisible(true);
    }

    /**
     * Responds to the "Display" and "Add" buttons
     *
     * @param ev Returns the command string associated with this action.
     */
    public void actionPerformed(ActionEvent ev) {
        Object object = ev.getSource();

        if (object == addReptileButton) {
            handleAnimalButton("reptile");

        } else if (object == addMammalButton) {
            handleAnimalButton("mammal");

        } else if (object == displayAnimalsButton) {
            handleDisplayButton();
        }
    }

    /**
     * Handles the reptile and mammal buttons.
     *
     * @param type string value used to determine if mammal or reptile
     * @throws InvalidNameException if name < 3
     * throws InvalidWeightException if weight <=0
     */
    private void handleAnimalButton(String type) {

        if (count != 10) {

            try {
                verifyArea.append(
                        "\nAdd " + type + " button pressed...\n"
                );
                if (type.equals("mammal")) {
                    animalsArray[count] = new Mammal(namePanel.getText(),
                            weightPanel.getValue(), agePanel.getValue(),
                            colorPanel.getText());
                } else {
                    animalsArray[count] = new Reptile(namePanel.getText(),
                            weightPanel.getValue(), agePanel.getValue(),
                            lengthPanel.getValue());
                }
                count++;
                verifyArea.append(type + " Sucessfully added! " + (10 - count)
                        + " space(s) left in the array.\n" + "\n");
            } catch (InvalidWeightException x) {
                verifyArea.append("Failed to add " + type
                        + "! Weight must be greater than 0!\n");
            } catch (InvalidNameException z) {
                verifyArea.append("Failed to add " + type + "! Name length "
                        + "must be greater than two characters!\n");
            }
        } else {
            verifyArea.append("\nFAILED TO ADD " + type.toUpperCase() + "."
                    + " NO SPACE LEFT " + "IN THE ARRAY!\n");
        }
    }

    /**
     * handles the display button by displaying all animals in the array
     */
    private void handleDisplayButton() {
        if (animalsArray[0] == null) {
            verifyArea.append("\n The array is empty. No animals to display.\n");
        } else {
            verifyArea.append("\nDisplay button pressed...\n");
            for (int i = 0; i < count; i++) {
                verifyArea.append(animalsArray[i].toString() + "\n");
            }
        }
    }

    /**
     * A panel prompting for String input. It contains a label and a text field.
     */
    class GetInputPanel extends JPanel {

        private JTextField inputField;  //used for the user input

        /**
         * Constructor sets up a label and the text field
         *
         * @param size the size of the input text field
         * @param prompt the message specifying expected input
         */
        public GetInputPanel(int size, String prompt) {
            inputField = new JTextField(size);
            add(new JLabel(prompt));
            add(inputField);
        }

        /**
         * Gets the text from the text field
         *
         * @return Returns the text from the text field
         */
        public String getText() {
            return inputField.getText();
        }

        /**
         * Converts the text field value into a number and displays an error
         * message when inputed data contains non digit characters
         *
         * @return the integer represented by the user input
         */
        public double getValue() {
            double value = 0.0;
            try {
                value = Double.parseDouble(inputField.getText());
            } catch (NumberFormatException ex) {

            }
            return value;
        }
    }

    /**
     * This panel represents a panel with a label and a combo box.
     */
    class GetComboPanel extends JPanel {

        JLabel label;   //explains the purpose of the combo box
        JComboBox combo; //used for the user input

        /**
         * Constructor sets up a panel with a label and a combo box.
         *
         * @param message the text indicating the purpose of the combo box
         * @param numChoices the range of choices displayed in the combo box
         */
        public GetComboPanel(String message, int numChoices) {
            String[] data = new String[numChoices];
            for (int i = 0; i < data.length; i++) {
                data[i] = i + 1 + "";
            }
            combo = new JComboBox(data);
            add(new JLabel(message));
            add(combo);
        }

        /**
         * Gets the value from the combo box
         *
         * @return value selected from the combo box
         */
        public int getValue() {
            int a;
            a = Integer.parseInt((String) combo.getSelectedItem());
            return a;
        }

    }
}
