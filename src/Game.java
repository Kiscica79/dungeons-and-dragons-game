import model.Character;
import model.Monster;

import java.util.Scanner;

public class Game {



    public static void main(String[] args) {

        // Kérd meg a felhasználót, hogy adja meg a karaktere nevét és ezt olvasd be egy változóba!
        // (Használj Scannert!)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add meg a karaktered nevét ");
        String user = scanner.nextLine();

        // Példányosíts egy Charactert (hívd meg a konstruktorát) ezzel a változóval!
        Character player  = new Character(user);


        // Készíts egy 3 hosszúságú tömböt Monster-ekből!
        Monster[] monster = new Monster[3];

        // Töltsd fel szörnyekkel! Példa: monsters[0] = new Monster("Goblin", 50);
        monster[0] = new Monster("Goblin", 50);
        monster[1] = new Monster("Troll", 23);
        monster[2] = new Monster("Dragon", 89);

        // Készíts egy gameOver nevű logikai változót, állítds az értékét false-ra!
        boolean gameover = false;

        // Írj egy ciklust, ami addig tart amíg nincs vége a játéknek (amíg a gameOver nem true) ÉS
        // amíg a karakter élete 0-nál nagyobb!
        while (gameover != true && player.getHealth() > 0) {

        }

        // Írd ki: Choose a monster to fight or quit:
        System.out.println("Choose a monster to fight or quit: ");

        // Írd ki: 0: Quit
        System.out.println("0: Quit");

        // Írd ki a Monstereket tartalmazó tömb összes elemének a nevét ebben a formátumban:
        // 1: Goblin
        // 2: Troll
        // 3: Dragon
        for (int i = 0; i < monster.length; i++) {
            System.out.println(i+1+": "+monster[i].getName());
        }

        // Olvasd be egy choice nevű változóba a felhasználótól, hogy mit választ: kilép vagy valamelyik
        // szörnnyel harcol!
        System.out.println("Mit választasz? Kilépsz(0) vagy Játszol (1,2 vagy 3)?");
        int choice = scanner.nextInt();

        // Ha azt választja, hogy kilép (0), írd ki: Thanks for playing! Goodbye.
        // És állítsd be a gameOver változó értékét true-ra!
        if (choice == 0) {
            System.out.println("Thanks for playing! Goodbye.");
            gameover = true;
        }

        // Ha jó inputot ad meg (1 és tömb hossza között) és harcol:
        // Tárold el egy Monster típusú változóban, hogy melyiket választotta a felhasználó!
        if (choice == 1 || choice == 2 || choice == 3) {

        }

        // Írj egy ciklust, ami addig megy, amíg a szörny és a játékos élete is nagyobb mint 0!

        // Támadja meg a felhasználó karaktere a szörnyet!

        // Ha a szörny élete továbbra is nagyobb, mint 0, akkor a szörny támadjon vissza!

        // Ha rossz inputot ad meg, írd ki: Invalid choice!

    }
}
