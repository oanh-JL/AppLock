import java.awt.*;

public class BackGround extends AppObject {
    Graphics g;
    public BackGround(Graphics g){

             this.position=new Vector2D(175,175);
            g.setFont(new Font("TimesRoman", Font.BOLD, 20));

            g.setColor(Color.pink);
            g.fillOval(position.x - 150, position.y - 150, 300, 300);

            g.setColor(Color.green);
            g.drawString("9", position.x - 145, position.y +0);
            g.drawString("3", position.x + 135,position.y + 0);
            this.g.drawString("12", position.x - 10, position.y - 130);
            this.g.drawString("6", position.x - 10, position.y + 145);
        }



}
