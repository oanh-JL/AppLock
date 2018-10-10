public class Vector2D {
    public int x;
    public int y;

    public Vector2D() {
    }

    public Vector2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Vector2D clone() {
        return new Vector2D(this.x, this.y);
    }

}
