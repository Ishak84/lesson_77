public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {
                new Magic(100, 0, "Zero"),
                new Medic(50, 0, "Heal", 50),
                new Warrior(100, 20, "Hear")};
        for (Hero hero: heroes) {
            hero.applySuperAbility();
            if (hero instanceof Medic){
                ((Medic) hero).increaseExperience();
            }
        }
    }
}