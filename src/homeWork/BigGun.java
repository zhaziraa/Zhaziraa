package homeWork;

public class BigGun extends Weapon {
    private String name;

    public BigGun(String name) {
        this.name = name;
    }

    public void shot() {
        System.out.println("Выстрел из " + name);
    }

    public String getName() {
        System.out.println("Выстрел из: " + name);
        return name;
    }
}