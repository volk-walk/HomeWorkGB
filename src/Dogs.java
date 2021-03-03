public class Dogs extends Animals
{
    Dogs (String name)
    {
        super(name);
    }
    protected void run(int distanceRun)
    {
        if (distanceRun<500)
        {
            System.out.println(name + " пробежал " + distanceRun + " м");
        }
        else
        {
            System.out.println(name + " не может столько пробежать");
        }

    }
    protected void swim(int distanceSwim)
    {
        if (distanceSwim<10)
        {
            System.out.println(name + " проплыл " + distanceSwim + " м");
        }
        else
        {
            System.out.println(name + " не может столькоо проплыть");
        }
        System.out.println();
    }
}
