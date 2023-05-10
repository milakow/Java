package advancedDevelopment.task4;

import org.w3c.dom.ls.LSOutput;

public class FirearmsMagazineDemo {

    public static void main(String[] args) {
        FirearmsMagazine firearmsMagazine = new FirearmsMagazine(6);
        firearmsMagazine.loadBullet("bullet1");
        firearmsMagazine.loadBullet("bullet2");
        firearmsMagazine.loadBullet("bullet3");
//        System.out.println(firearmsMagazine.getNumberOfBulletInside());
        System.out.println(firearmsMagazine);
        System.out.println(firearmsMagazine.isLoaded());
        System.out.println("===============");
        firearmsMagazine.shot();
        System.out.println("===============");
        firearmsMagazine.shot();
        firearmsMagazine.shot();
        firearmsMagazine.shot();



    }
}
