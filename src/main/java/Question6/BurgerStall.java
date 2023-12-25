
package Question6;

public class BurgerStall {
    
    private String ID;
    private int totalBurgersSold;
    private static int totalBurgersSoldAllStall;
    
    BurgerStall(String id, int num) {
        this.ID = id;
        this.totalBurgersSold += num;
        totalBurgersSoldAllStall += num;
    }

    public String getStallID() {
        return this.ID;
    }
    
    public int getTotalBurgersSold() {
        return this.totalBurgersSold;
    }
    
    public static int getTotalBurgersSoldAllStall() {
        return totalBurgersSoldAllStall;
    }
}
