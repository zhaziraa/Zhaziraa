package homeWork;

public class Player {
    private Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[]{
                new BigGun("Большой пистолет"),
                new WaterPistol("Водяной пистолет")
        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void showWeaponMenu() {
        System.out.println("Выберите оружия: ");

        for (int i = 1; i < weaponSlots.length; i++) {
            System.out.println(i + "." + weaponSlots[i].getName());
            System.out.println(i + (+1) + "." + weaponSlots[0].getName());
            System.out.println("0. Выход из меню");
        }
    }

    public void shotWitchWeapon(int slot) {
        if (slot > 0 && slot <= weaponSlots.length) {
            weaponSlots[slot - 1].shot();
        } else if (slot == 0) {
            System.out.println("Выход из меню");
        } else {
            System.out.println("Неверный индекс слота! Попробуйте еще раз.");
        }
    }
}