package JavaCore.Predavanje6.RPGHeroes;

public class Main {
    public static void main(String[] args) {

        DwarfWarrior dw = new DwarfWarrior();
        dw.dead=false;
        dw.mana=50;
        dw.health=100;

        ElfMage em = new ElfMage(false,50,100);

        em.show();
        em.receiveHit();
        em.show();
        em.primaryFire();
        em.show();
        em.receiveHit();
        em.receiveHit();
        em.show();
        em.receiveHit();
        em.show();

    }
}
