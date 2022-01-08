package yandex.oshkin;

public class Neighbours {
    String name;
    int flatNumber;
    int numberOfRooms;
    int floor;
    int entrance;
    double income;
    String gender;
    String status;
    int childrens;
    String car;
    String phoneNumber;

    public void printInfo() {
        sayName();
        sayEntrance();
        sayFlatNumber();
        sayFloor();
        sayNumberOfRooms();
        sayIncome();
        sayGender();
        sayStatus();
        sayCar();
        sayChildrens();
        sayPhoneNumber();
    }

    public void sayName() {
        System.out.println("Сосед/Соседка " + name);
    }

    public void sayEntrance() {
        System.out.println("С " + entrance + " подъезда");
    }

    public void sayFlatNumber() {
        System.out.println("Живет в квартире номер " + flatNumber);
    }

    public void sayFloor() {
        System.out.println("На " + floor + " этаже");
    }

    public void sayNumberOfRooms() {
        System.out.println("В квартире " + numberOfRooms + " комната/комнаты/комнат");
    }

    public void sayIncome() {
        System.out.println("Зарабатывает " + income + " рублей в месяц");
    }

    public void sayGender() {
        System.out.println("Половая принадлежность " + gender);
    }

    public void sayStatus() {
        System.out.println("Семейное положение " + status);
    }

    public void sayCar() {
        System.out.println("Ездит на " + car);
    }

    public void sayPhoneNumber() {
        System.out.println("Номер телефона: " + phoneNumber);
    }

    public void sayChildrens() {
        System.out.println("Количество детей " + childrens);
    }

    public void changeUpIncome() {
        //System.out.println("Поздравляем с прибавкой к ЗП");
        income = income + 15000;
    }

    public void changeDownIncome() {
        //System.out.println("Сожалеем вам урезали доход");
        income = income - 15000;
    }

    public void bornBaby() {
        //System.out.println("Поздравляем с пополнением");
        childrens = childrens + 1;
    }


}
