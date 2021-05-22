import javax.swing.JFrame;

public class DisplaySim {
    private static JFrame displayWindow;
    private int width;
    private int height;

    public static void main(String[] args) {
        
    }

    public void display() {
        displayWindow = new JFrame("Particle Simulator");
        displayWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        displayWindow.setSize(width, height);
        displayWindow.setLocationRelativeTo(null);
        displayWindow.setResizable(false);
        displayWindow.setVisible(true);
    }

    public DisplaySim(int x, int y) {
        width = x; 
        height = y;
    }
}
