public class Main {
    public static void main(String[] args) {
        Pet pet1 = new Pet("dog", "Roster", 5, 73, new String[]{"eat", "drink", "sleep"});

        Human father = new Human("Walter", "White", 1975);
        Human mother = new Human("Skyler", "White", 1970);

        Human child = new Human("Walter", "White", 1995, 90, new String[][]{
                {"Monday", "study"},
                {"Tuesday", "play chess"},
                {"Wednesday", "play football"}
        });


        Family family1=new Family(mother,father,pet1);
        family1.addChild(child);

        System.out.println(family1.toString());

        System.out.println("\n==============================\n");

        Pet brian = new Pet("dog", "Brian", 8, 100, new String[]{"drink martinis", "write novels", "talk"});

        Human lois = new Human("Lois", "Griffin", 1975);
        Human peter = new Human("Peter", "Griffin", 1970);

        Human stewie = new Human("Stewie", "Griffin", 1999, 160, new String[][]{
                {"Monday", "plan world domination"},
                {"Tuesday", "build a time machine"},
                {"Wednesday", "argue with Brian"}
        });


        Family family2=new Family(lois,peter,brian);
        family2.addChild(stewie);

        System.out.println(family2.toString());
    }
}