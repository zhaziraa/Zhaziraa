package homeWork;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();

        System.out.format("У игрока %d слотов с оружием,"
                        + " введите номер, чтобы выстрелить,"
                        + " -1 чтобы выйти%n",
                player.getSlotsCount()
        );

        int slot;
        player.showWeaponMenu();
        Scanner scanner = new Scanner(System.in);

        System.out.println(scanner.nextInt());

        while (true) {
            System.out.print("Введите номер слота: ");
            slot = scanner.nextInt();

            if (slot == -1) {
                break;
            }

            if (slot >= 0 && slot < player.getSlotsCount()) {
                player.shotWitchWeapon(slot);
            } else {
                System.out.println("Неверный номер слота. Попробуйте еще раз.");
            }
        }
        System.out.println("Игра окончена!");
    }
}
