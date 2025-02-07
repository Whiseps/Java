public class Main {
    public static void main(String[] args) {
        Pet pet1 = new Pet("dog", "Roster", 5, 73, new String[]{"eat", "drink", "sleep"});

        Human mother = new Human("Walter", "White", 1975);
        Human father = new Human("Skyler", "White", 1970);

        Human child = new Human("Walter", "White", 1995, 90, pet1, mother, father, new String[][]{
                {"Monday", "study"},
                {"Tuesday", "play chess"},
                {"Wednesday", "play football"}
        });

        System.out.println(child);
        System.out.println(child.pet);

        child.greetPet();
        child.describePet();

        child.feedPet(true);
        child.feedPet(false);

        pet1.foul();
        pet1.eat();
        pet1.respond();

        System.out.println("\n==============================\n");

        Pet brian = new Pet("dog", "Brian", 8, 100, new String[]{"drink martinis", "write novels", "talk"});

        Human lois = new Human("Lois", "Griffin", 1975);
        Human peter = new Human("Peter", "Griffin", 1970);

        Human stewie = new Human("Stewie", "Griffin", 1999, 160, brian, lois, peter, new String[][]{
                {"Monday", "plan world domination"},
                {"Tuesday", "build a time machine"},
                {"Wednesday", "argue with Brian"}
        });

        System.out.println(stewie);
        System.out.println(stewie.pet);

        stewie.greetPet();
        stewie.describePet();

        stewie.feedPet(true);
        stewie.feedPet(false);

        brian.foul();
        brian.eat();
        brian.respond();
    }
}
