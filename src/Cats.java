public class Cats extends Animals {
    Cats(String name) {
        super(name);
    }

    protected void run(int distanceRun) {
        if (distanceRun < 200) {
            System.out.println(name + " пробежал " + distanceRun + " м");
        } else {
            System.out.println(name + " не может столько пробежать");
        }

    }

    protected void swim(int distanceSwim)
    {
        System.out.println(name + " не умеет плавать");
        System.out.println();
    }

}
