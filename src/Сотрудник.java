public class Сотрудник
{

    String name;
    String Должность;
    String email;
    String number;
    int Зарплата;
    int age;

    Сотрудник(String name,String Должность,String email,String number,int Зарплата,int age)
    {
      this.name=name;
      this.Должность=Должность;
      this.email=email;
      this.number=number;
      this.Зарплата=Зарплата;
      this.age=age;
    }
    public void сотрудникИнф ()
    {
        System.out.print("ФИО: " + name + ",");
        System.out.print("Должность: " + Должность + ",");
        System.out.print("Эмэйл: " + email + ",");
        System.out.print("Номер: " + number + ",");
        System.out.print("Зарплата: " + Зарплата + ",");
        System.out.print("Возраст: " + age + ".");
        System.out.println();
    }

}
