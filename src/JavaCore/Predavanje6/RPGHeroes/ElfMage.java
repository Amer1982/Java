package JavaCore.Predavanje6.RPGHeroes;

public class ElfMage extends BaseHero{

    public ElfMage(boolean dead, double mana, double health) {
        this.dead=dead;
        this.mana=mana;
        this.health=health;
    }

    @Override
    public void receiveHit() {
        this.health-=30;
        this.dead=this.health<=0;

    }

    @Override
    public void primaryFire() {
        this.mana-=15;
        System.out.println("Firring primary weapon...");

    }

    @Override
    public void secondaryFire() {
        this.mana-=50;
        System.out.println("Firring secondary weapon...");
    }

public void show (){
    System.out.println("Elf Warrior Health: " + this.health +
            ", Mana: " + this.mana +
            ", Dead: " + this.dead);



}
}
