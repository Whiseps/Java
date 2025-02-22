package com.whiseps.happyfamilyy;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    static {
        System.out.println("Loading a new Family class...");
    }


    {
        System.out.println("Creating a new Family object...");
    }

    public Family(Human mother, Human father,Pet pet) {  // As written in Happy Family 2 project instructions to initialize only parents
        this.mother=mother;
        this.father=father;
        this.children=new Human[0];
        this.pet=pet;
    }


    public boolean deleteChild(Human child) {
        if (child == null || children.length == 0) {
            return false;
        }

        int childIndex = -1;
        for (int i = 0; i < children.length; i++) {
            if (children[i].equals(child)) {
                childIndex = i;
                break;
            }
        }

        if (childIndex != -1) {
            children[childIndex].setFamily(null);

            Human[] updatedChildren = new Human[children.length - 1];
            for (int i = 0, j = 0; i < children.length; i++) {
                if (i != childIndex) {
                    updatedChildren[j] = children[i];
                    j++;
                }
            }
            children = updatedChildren;

            return true;
        } else {
            return false;
        }
    }


    public boolean deleteChild(int index) {
        if (index < 0 || index >= children.length) {
            return false;
        }

        children[index].setFamily(null);

        Human[] updatedChildren = new Human[children.length - 1];
        for (int i = 0, j = 0; i < children.length; i++) {
            if (i != index) {
                updatedChildren[j] = children[i];
                j++;
            }
        }
        children = updatedChildren;

        return true;
    }



    public void addChild(Human child) {
        if (child == null) {
            return;
        }

        Human[] newChildren = Arrays.copyOf(children, children.length + 1);
        newChildren[children.length] = child;
        children = newChildren;

        child.setFamily(this);
    }


    public int countFamily() {
        return 2+children.length; // There are always 2 parents
    }

    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public Human[] getChildren() {
        return children;
    }

    public Pet getPet() {
        return pet;
    }


    public void setMother(Human mother) {
        this.mother = mother;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + (mother != null ? mother.toString() : "null") +
                "\n father=" + (father != null ? father.toString() : "null") +
                "\n children=" + (children != null ? Arrays.toString(children) : "null") +
                "\n pet=" + (pet != null ? pet.toString() : "null") +
                '}';
    }

    @Override
    public boolean equals(Object comparedObject) {
        if (this == comparedObject) {
            return true;
        }
        if (comparedObject == null || getClass() != comparedObject.getClass()) {
            return false;
        }
        Family comparedFamily = (Family) comparedObject;

        return Objects.equals(mother, comparedFamily.mother) &&
                Objects.equals(father, comparedFamily.father) &&
                Arrays.equals(children, comparedFamily.children) &&
                Objects.equals(pet, comparedFamily.pet);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mother,father,pet);
        result= result * 31 + Arrays.hashCode(children) ;
        return result;
    }

    /* ======================================================================================================


    finalize() WAS DEPRECATED IN JAVA 9 AND REMOVED IN JAVA 18, BUT SINCE IT IS REQUIRED |
                                                                                         |
                                                                                         V
     ======================================================================================================== */

    @Override
    protected void finalize() throws Throwable {
        throw new UnsupportedOperationException("finalize() method is not supported");
    }
}