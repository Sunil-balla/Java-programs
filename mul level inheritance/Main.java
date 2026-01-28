class GrandParent {
    void grandParentMet() {
        System.out.println("Grand Parent method");
    }
}

class Parent extends GrandParent{
    void parentMet() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    void childMet() {
        System.out.println("Child method");
    }
}

public class Main
{
	public static void main(String[] args) {
	Child obj = new Child();
	obj.childMet();
	obj.parentMet();
	obj.grandParentMet();
	//obj.add();
	//this.()
	}
}
