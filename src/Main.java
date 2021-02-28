public class Main
{
    public static void main(String[] args)
    {
        Сотрудник[] Person =new Сотрудник[5];
        Person[0]= new Сотрудник("Жмышенко В.Н.","Охранник","erock@mail.ru","89371335545",15000,54);
        Person[1]= new Сотрудник("Каазаков В.А.","СММ","kozak777@mail.ru","88005553535",200000,24);
        Person[2]= new Сотрудник("Иванов И.Н.","Юрист","vanek@mail.ru","89371779930",30000,37);
        Person[3]= new Сотрудник("Леонтьев А.А.","Аниматор","prazdnik@mail.ru","89377777777",23000,41);
        Person[4]= new Сотрудник("Николаева И.Н.","Уборщица","clear@mail.ru","89371256543",17000,25);
        for (int i = 0; i <Person.length ; i++)
        {
            
            if(Person[i].age >= 40)
            {
                Person[i].сотрудникИнф();
            }

        }
    }
}
