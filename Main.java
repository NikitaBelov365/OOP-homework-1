public class Main {
    public static void main(String[] args) {
        Owner me = new Owner();

        me.setName("Nikita");

        Cat myCat = new Cat(me.getName());

        myCat.setAge(4);
        myCat.setName("Igor");
        myCat.greet();
    }
}