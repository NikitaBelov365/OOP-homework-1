public class Second {
    public static void main(String[] args) {


        Rectangle firstRect = new Rectangle();
        Rectangle secondRect = new Rectangle(5, 4);


        System.out.println(firstRect.getHeight());
        System.out.println(firstRect.getWidth());
        firstRect.setWidth(2);
        firstRect.setHeight(3);
        System.out.println(firstRect.getWidth());
        System.out.println(firstRect.getHeight());
        System.out.println(firstRect.calculateArea());
        System.out.println(firstRect.calculatePerimeter());
    }
}
