import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class GUIApp extends JFrame implements KeyListener, MouseListener, MouseMotionListener {

    private JLabel statusLabel;
    private JTable table;
    private DefaultTableModel tableModel;

    public GUIApp() {
        setTitle("Swing Application Example");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Set layout manager
        setLayout(new BorderLayout());

        // Create menu bar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);


        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        JMenu helpMenu = new JMenu("Help");
        menuBar.add(helpMenu);


        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(exitItem);
        exitItem.addActionListener(e -> System.exit(0));

        JMenuItem aboutItem = new JMenuItem("About");
        helpMenu.add(aboutItem);
        aboutItem.addActionListener(e -> showAboutDialog());


        statusLabel = new JLabel("Status: Ready");
        add(statusLabel, BorderLayout.SOUTH);


        String[] columnNames = {"Column 1", "Column 2", "Column 3"};
        tableModel = new DefaultTableModel(columnNames, 0);
        table = new JTable(tableModel);
        add(new JScrollPane(table), BorderLayout.CENTER);


        addRowToTable("Data 1", "Data 2", "Data 3");
        addRowToTable("Data A", "Data B", "Data C");


        addKeyListener(this);
        addMouseListener(this);
        addMouseMotionListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }

    private void showAboutDialog() {
        JOptionPane.showMessageDialog(this, "Wassup\nVersion 1.0", "About", JOptionPane.INFORMATION_MESSAGE);
    }

    private void addRowToTable(String col1, String col2, String col3) {
        tableModel.addRow(new Object[]{col1, col2, col3});
    }

    @Override
    public void keyTyped(KeyEvent e) {
        statusLabel.setText("Key Typed: " + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        statusLabel.setText("Key Pressed: " + e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        statusLabel.setText("Key Released: " + e.getKeyChar());
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        statusLabel.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        statusLabel.setText("Mouse Pressed at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        statusLabel.setText("Mouse Released at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        statusLabel.setText("Mouse Entered at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        statusLabel.setText("Mouse Exited");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        statusLabel.setText("Mouse Dragged to (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        statusLabel.setText("Mouse Moved to (" + e.getX() + ", " + e.getY() + ")");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GUIApp example = new GUIApp();
            example.setVisible(true);
        });
    }
}