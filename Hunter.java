package com.spartaglobal.clf;

public class Hunter extends Person implements IShootable {
    private IShootable shootable;
    public Hunter(String fName, String lName, int age, IShootable shootable) {
        super(fName, lName, age);
        this.shootable = shootable;
    }
    public String shoot() {
        return getFullName() + " is " + shootable.shoot();
    }

    public void setWeapon(IShootable shootable) {
        this.shootable = shootable;
    }

    @Override
    public String toString() {
        return super.toString() + " is a Hunter which has a " + shootable;
    }
}