package JavaCore.Predavanje6.RPGHeroes;

public class DwarfWarrior extends BaseHero {


    @Override
    public void receiveHit() {
        this.health -= 10;
        this.dead = this.health <= 0;
    }

    @Override
    public void primaryFire() {
        this.mana -= 5;
        System.out.println("Firring primary weapon...");

    }

    @Override
    public void secondaryFire() {
        this.mana -= 10;
        System.out.println("Firring secondary weapon...");

    }

    public void show() {
        System.out.println("Dwarf warrior Health: " + this.health +
                ", Mana: " + this.mana +
                ", Dead: " + this.dead);
    }
}
