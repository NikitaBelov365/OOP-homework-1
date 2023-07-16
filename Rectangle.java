public class Rectangle {
    private int width;
    private int height;

    Rectangle() {
        this.height = 0;
        this.width = 0;
    }
    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int calculateArea() {
        return getHeight()*getWidth();
    }

    public int calculatePerimeter() {
        return 2*(getHeight()+getWidth());
    }
}
