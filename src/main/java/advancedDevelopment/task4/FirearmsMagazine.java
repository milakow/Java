package advancedDevelopment.task4;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
/**
 * Create a class simulating a magazine for a firearm.
 * The class should have the ability to define the size of the magazine using a constructor.
 * Implement the following methods:
 *
 * loadBullet(String bullet) → adds a bullet to the magazine, doesn't allow loading more bullets than the magazine capacity
 * isLoaded() → returns information whether the firearm is loaded (at least one bullet) or not
 * shot() → one invocation fires (prints in the console) one - the last loaded bullet and prepares the next one,
 *          loaded before the last one. If there are no more bullets, it prints "empty magazine" in the console.
 */
public class FirearmsMagazine {

    private Deque<String> bullets = new LinkedList<>();
    int size;
    String bullet;
    String loadedBullet;

    public FirearmsMagazine(int size) {
        this. size = size;
    }


    public void loadBullet(String bullet) {
        if (size == bullets.size()) {
            throw new IllegalStateException("Magazine is full. You can't add more bullets.");
        } else {
            bullets.addLast(bullet);
            System.out.println("FirearmsMagazine was loaded. Capasity: " + bullets.size());
        }
    }

    public boolean isLoaded() {
        if (bullets.size() > 0) {
            setLoadedBullet(bullets.getLast());
            return true;
        }
        return false;
    }
//    shot() → one invocation fires (prints in the console) one - the last loaded bullet and prepares the next one,
//            *                                                     loaded before the last one. If there are no more bullets, it prints "empty magazine" in the console.

    public void shot() {
        if (!isLoaded()) {
            throw new IllegalStateException("Empty magazine");
//            System.out.println("Empty magazine");
        } else { //add finding bullet
            boolean result = isLoaded();
            System.out.println("Is loaded? : " + result + " with " + getLoadedBullet());
            System.out.println("Shoot!");
            bullets.removeLast();
            System.out.println("Bullets left: " + bullets.size());
        }
    }



    public String getLoadedBullet() {
        return loadedBullet;
    }

    public void setLoadedBullet(String loadedBullet) {
        this.loadedBullet = loadedBullet;
    }

    @Override
    public String toString() {
        return "FirearmsMagazine{" +
                "bullets=" + bullets +
                ", size=" + size +
                ", bullet='" + bullet + '\'' +
                ", loadedBullet='" + loadedBullet + '\'' +
                '}';
    }
}
