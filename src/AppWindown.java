import javax.swing.*;

public class AppWindown extends JFrame {
    AppCanvas appCanvas;
    public AppWindown(){
        this.setSize(500,500);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.appCanvas=new AppCanvas();
        this.add(appCanvas);
        this.setVisible(true);

    }
}
