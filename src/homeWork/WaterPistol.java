package homeWork;

public class WaterPistol extends Weapon {
    private String name;

    public WaterPistol(String name) {
        this.name = name;
    }
    public void shot() {
        System.out.println("Выстрел из " + name);
    }
    public String getName() {
        System.out.println("Это водяной выстрел!");
        return name;
    }
}