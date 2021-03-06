public class Plate {
    int food;
    Plate(int food)
    {
        this.food = food;
    }
    protected void info ()
    {
        System.out.println("В тарелке " + food + " еды");
        System.out.println();
    }
    protected void decreaseFood(int appetite)
    {
        this.food -= appetite;
    }
    void addFood()
    {
        food += 25;
    }
}
