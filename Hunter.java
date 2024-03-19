package com.spartaglobal.clf;

public class Hunter extends Person implements IShootable {
// I have made some changes
    private IShootable shootable;
    public Hunter(String fName, String lName, int age, IShootable shootable, String haircolour) {
        super(fName, lName, age);
        this.shootable = shootable;
        this.haircolour = haircolour;
    }
    public String shoot() {

        return getFullName() + " is " + shootable.shoot() + " hope I got them!!!";

    }

    public void setWeapon(IShootable shootable) {
        this.shootable = shootable;
    }


 // silly comment here
    @Override
    public String toString() {
        return super.toString() + " is a Hunter with a " + shootable;
    }
}

// super awesome code, love Ellen

// JUST WANTED TO ADD MORE RANDOM TEXT 



    public String message(){
        return "great";
    }

}


