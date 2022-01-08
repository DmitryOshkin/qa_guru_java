package yandex.oshkin;

public class RunCode {

    public static void main(String[] args) {

        Neighbours sveta = new Neighbours();
        sveta.name = "Светлана";
        sveta.flatNumber = 13;
        sveta.numberOfRooms = 2;
        sveta.floor = 4;
        sveta.entrance = 1;
        sveta.income = 120000;
        sveta.gender = "Жен.";
        sveta.status = "Свободна";
        sveta.childrens = 1;
        sveta.car = "Toyota";
        sveta.phoneNumber = "89321234567";

        Neighbours slava = new Neighbours();
        slava.name = "Вячеслав";
        slava.flatNumber = 18;
        slava.numberOfRooms = 3;
        slava.floor = 5;
        slava.entrance = 1;
        slava.income = 180000;
        slava.gender = "Муж";
        slava.status = "Женат";
        slava.childrens = 2;
        slava.car = "Nissan";
        slava.phoneNumber = "89321234567";

        sveta.printInfo();
        slava.printInfo();
        sveta.changeUpIncome();
        sveta.sayIncome();
        slava.bornBaby();
        slava.sayChildrens();

    }
}
