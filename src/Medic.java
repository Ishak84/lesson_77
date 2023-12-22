public class Medic extends Hero{
    private int healPoint;

    public Medic(int health, int damage, String superAbility, int healPoint) {
        super(health, damage, superAbility);
        this.healPoint = healPoint;
    }

    public void increaseExperience(){
        int increaseHealPoint = (int) (healPoint * 1.1);
        System.out.println("Experience get: " + increaseHealPoint);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic used ability: + 10HP");
    }
}
