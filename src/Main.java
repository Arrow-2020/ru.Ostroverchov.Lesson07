public class Main
{
    public static
    void main(String[] args)
    {
        Cat[] cats = {new Cat("Котецкий", 50),
                new Cat("Рыжик", 50), new Cat("Кузен", 25),
                new Cat("Леопольд", 5), new Cat("Мурзик", 20)};
/* наполнение миски и программа автоматический определит
какой из котов сможет наесться а какой нет*/
        Plate plate = new Plate( 90);

        for (Cat cat : cats)
        {
            cat.eat(plate);
            cat.info();
        }
    }
}
