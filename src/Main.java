public class Main
{
    public static void main(String[] args)
    {
        Cat[] catsArray = new Cat[4];
        catsArray[0] = new Cat("Дуся", 13,false);
        catsArray[1] = new Cat("Вася", 11,false);
        catsArray[2] = new Cat("Игнат", 14,false);
        catsArray[3] = new Cat("Захар", 16,false);
        Plate plate = new Plate(50);
        plate.info();
        for (int i =0; i < catsArray.length; i++) {
            catsArray[i].eat(plate);
            plate.info();
        }
    }
}
