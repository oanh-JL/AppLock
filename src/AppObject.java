import java.awt.*;

public class AppObject {
    Renderer renderer;
    public Vector2D position;
    public AppObject(Graphics g){
        this.position=new Vector2D(0,0);
    }
    public  void run(){

    }
    public void render(Graphics g){
        if(this.renderer!=null){
            this.renderer.render(g,this);
        }

    }


}
