public class Main {
    public static void main(String[] args) {
        Medic medic = new Medic();
        Warior warior = new Warior();
        Magic magic = new Magic();

        Hero[] heroes = {medic, warior, magic};
        String[] jak = {" лечение", "защита", "магия"};

        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility(jak[i]);
        }
    }
}

