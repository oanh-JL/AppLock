import javax.swing.*;
import java.awt.*;

public class AppCanvas extends JPanel {
    BackGround backGround;
    public AppCanvas() {
        this.backGround = new BackGround();
    }

    public void render(Graphics g) {
        this.backGround.render(g);
    }
    @Override
    protected void paintComponent(Graphics g) {
        this.render(g);
    }
}
