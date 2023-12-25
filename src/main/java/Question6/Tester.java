
package Question6;

public class Tester {
    public static void main(String[] args) {
        BurgerStall s1 = new BurgerStall("MacBurger", 25);
        BurgerStall s2 = new BurgerStall("RamlyBurger", 50);
        
        System.out.println(s1.getStallID() + " sold " + s1.getTotalBurgersSold() + " burgers");
        System.out.println(s2.getStallID() + " sold " + s2.getTotalBurgersSold() + " burgers");
        System.out.println("Total burgers sold in all stall : " + BurgerStall.getTotalBurgersSoldAllStall());
    }
}
