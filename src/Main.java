public class Main
{
    public static void main(String[] args)
    {
        Dogs dog1 = new Dogs("Вовчик");
        dog1.run(250);
        dog1.swim(10);
        Cats cat1 = new Cats("Чирик");
        cat1.run(100);
        cat1.swim(0);
        Dogs dog2 = new Dogs("мистер Пиглс");
        dog2.run(250);
        dog2.swim(9);
    }
}
