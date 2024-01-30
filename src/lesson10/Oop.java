package lesson10;

public class Oop {
    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human);
        Medic medic = new Medic();
        System.out.println(medic);
    }
}

class Human {
    String skill;

    public Human(){
        skill = "can walk";
    }

    @Override
    public String toString() {
        return "Human{" +
                "skill=" + skill +
                '}';
    }
}

class Medic extends Human{
    String extraSkill;
    public Medic(){
        extraSkill = "can give pills";
    }
    @Override
    public String toString() {
        return "Human{" +
                "skill=" + skill +
                "\textraSkill=" + extraSkill +
                '}';
    }
}

class Surgeon extends Human{
    String extraSkill;
    public Surgeon(){
        extraSkill = "can cure humans";
    }
}
