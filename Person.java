package ru.geekbrains.java;

public class Person {
    String fullName;
    String position;
    String eMail;
    String phone;
    String pay;
    int age;

    public Person(String fullName, String position, String eMail, String telNumber, String pay, int age) {
        this.fullName = fullName;
        this.position = position;
        this.eMail = eMail;
        this.phone = telNumber;
        this.pay = pay;
        this.age = age;
    }

    int getAge() {

        return age;

    }

    void readDetails() {
        System.out.println(fullName + ", " + position + ", " + eMail + ", " + phone + ", " + pay + ", " + age);
    }


    public static void main(String[] args) {
        Person persArray[] = new Person[5];
        persArray[0] = new Person("И. Н. Сергеевич", "разработчик", "fdjgkdfg@gmail.com",
                "+79285687451", "200$", 18);
        persArray[1] = new Person("И. И. Иванович", "сотрудник безопасности", "fjhsky@gmail.com",
                "+79504215471", "250$", 20);
        persArray[2] = new Person("Д. Н. Владимирович", "инженер", "аhysk@gmail.com",
                "+79202054152", "150$", 42);
        persArray[3] = new Person("А. Г. Петросовна", "уборщица", "аhsybak@mail.ru",
                "+79521415252", "350$", 55);
        persArray[4] = new Person("С. К. Алексеевна", "руководитель", "rushyf@yandex,ru",
                "+79312451212", "500$", 25);
        for (Person item : persArray
        ) {
            if (item.getAge() > 40) {
                item.readDetails();


            }
        }
    }
}
