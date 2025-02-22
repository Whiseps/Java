package com.whiseps.happyfamilyy;

import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FamilyTest {

    private Family griffinFamily;
    private Human peter;
    private Human lois;
    private Pet brian;
    private Human meg;
    private Human chris;
    private Human stewie;
    private Human rick;

    @BeforeEach
    void setUp() {

        peter = new Human("Peter", "Griffin", 1960);
        lois = new Human("Lois", "Griffin", 1968);
        brian = new Pet(Species.DOG, "Brian");


        griffinFamily = new Family(lois, peter, brian);


        meg = new Human("Meg", "Griffin", 1992);
        chris = new Human("Chris", "Griffin", 1995);
        stewie = new Human("Stewie", "Griffin", 2000);

        griffinFamily.addChild(meg);
        griffinFamily.addChild(chris);
        griffinFamily.addChild(stewie);

        rick = new Human("Rick","Sanchez",1960);
    }

    @Test
    void testAddChild() {
        Human newChild = new Human("Newbie", "Griffin", 2025);
        griffinFamily.addChild(newChild);

        // Check if children array increases by one element
        assertEquals(4, griffinFamily.getChildren().length);

        // Check if children array gets updated correctly
        assertTrue(Arrays.asList(griffinFamily.getChildren()).contains(newChild));
    }

    @Test
    void testDeleteChildByObject_CorrectInput() {
        boolean wasRemoved = griffinFamily.deleteChild(meg);

        // Check if the child is removed correctly
        assertEquals(2,griffinFamily.getChildren().length);
        assertTrue(Arrays.asList(griffinFamily.getChildren()).contains(chris));
        assertTrue(Arrays.asList(griffinFamily.getChildren()).contains(stewie));
        assertFalse(Arrays.asList(griffinFamily.getChildren()).contains(meg));

        // Check if method returns the correct value
        assertTrue(wasRemoved);
    }

    @Test
    void testDeleteChildByObject_IncorrectInput() {
        boolean wasRemoved = griffinFamily.deleteChild(rick);

        // Check if the child is "removed" correctly
        assertEquals(3,griffinFamily.getChildren().length);
        assertFalse(Arrays.asList(griffinFamily.getChildren()).contains(rick));
        assertTrue(Arrays.asList(griffinFamily.getChildren()).contains(meg));
        assertTrue(Arrays.asList(griffinFamily.getChildren()).contains(chris));
        assertTrue(Arrays.asList(griffinFamily.getChildren()).contains(stewie));

        // Check if method returns the correct value
        assertFalse(wasRemoved);
    }

    @Test
    void testDeleteChildByIndex_CorrectInput() {
        boolean wasRemoved = griffinFamily.deleteChild(0);

        // Check if the child is removed correctly
        assertEquals(2,griffinFamily.getChildren().length);
        assertTrue(Arrays.asList(griffinFamily.getChildren()).contains(chris));
        assertTrue(Arrays.asList(griffinFamily.getChildren()).contains(stewie));
        assertFalse(Arrays.asList(griffinFamily.getChildren()).contains(meg));

        // Check if method returns the correct value
        assertTrue(wasRemoved);
    }

    @Test
    void testDeleteChildByIndex_IncorrectInput() {
        boolean wasRemoved = griffinFamily.deleteChild(999);

        // Check if the child is "removed" correctly
        assertEquals(3,griffinFamily.getChildren().length);
        assertTrue(Arrays.asList(griffinFamily.getChildren()).contains(meg));
        assertTrue(Arrays.asList(griffinFamily.getChildren()).contains(chris));
        assertTrue(Arrays.asList(griffinFamily.getChildren()).contains(stewie));

        // Check if method returns the correct value
        assertFalse(wasRemoved);
    }

    @Test
    void testCountFamily() {
        int expected = 5;
        assertEquals(expected, griffinFamily.countFamily());
    }

    @Test
    void testEqualsFamily() {
        Family doppelgangers = new Family(lois, peter, brian);
        doppelgangers.addChild(meg);
        doppelgangers.addChild(chris);
        doppelgangers.addChild(stewie);

        assertTrue(doppelgangers.equals(griffinFamily));
    }

    @Test
    void testHashCodeFamily() {
        Family doppelgangers = new Family(lois, peter, brian);
        doppelgangers.addChild(meg);
        doppelgangers.addChild(chris);
        doppelgangers.addChild(stewie);

        assertEquals(doppelgangers.hashCode(),griffinFamily.hashCode());
    }

    @Test
    void testToStringFamily() {
        String expected = "Family{mother=Human{name='Lois', surname='Griffin', year=1968, iq=0, schedule=null}\n" +
                " father=Human{name='Peter', surname='Griffin', year=1960, iq=0, schedule=null}\n" +
                " children=[Human{name='Meg', surname='Griffin', year=1992, iq=0, schedule=null}, Human{name='Chris', surname='Griffin', year=1995, iq=0, schedule=null}, Human{name='Stewie', surname='Griffin', year=2000, iq=0, schedule=null}]\n" +
                " pet=DOG{nickname='Brian', age=0, trickLevel=0, habits=null, Can fly=false, Number of legs=4, Has fur=true}}";

        assertEquals(expected, griffinFamily.toString());
    }

    @Test
    void testEqualsPet() {
        Pet brianCopy = new Pet(Species.DOG, "Brian");

        assertTrue(brianCopy.equals(brian));
    }

    @Test
    void testHashCodePet() {
        Pet brianCopy = new Pet(Species.DOG, "Brian");

        assertEquals(brian.hashCode(),brianCopy.hashCode());
    }
}
