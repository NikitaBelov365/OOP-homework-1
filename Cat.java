public class Cat {
    private String name;
    private int age;
    private String owner;
    public Cat (String owner) {
    this.owner = owner;
    }
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void greet() {
        String formattedString = String.format("Мяу! Меня зовут %s. Мне %d года(лет). Мой владелец %s", name, age, owner);
        System.out.println(formattedString);
    }
}


