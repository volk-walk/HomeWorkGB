public class Animals
{
    String name ;

    Animals (String name)
    {
        this.name=name;
    }
    protected void run(int distanceRun)
    {
        System.out.println(name + "пробежал" + distanceRun);
    }
    protected void swim(int distanceSwim)
    {
        System.out.println(name + "проплыл" + distanceSwim);
    }
}
