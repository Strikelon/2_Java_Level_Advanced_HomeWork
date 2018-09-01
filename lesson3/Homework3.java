package java2.hm2_3;

import java.util.LinkedHashSet;

public class Homework3 {
    public static void main(String[] args){

        //Задание №1

        LinkedHashSet<String> months = new LinkedHashSet<String>();
        months.add("Январь");
        months.add("Февраль");
        months.add("Март");
        months.add("Апрель");
        months.add("Февраль");
        months.add("Май");
        months.add("Июнь");
        months.add("Апрель");
        months.add("Июль");
        months.add("Август");
        months.add("Февраль");
        months.add("Сентябрь");
        months.add("Октярь");
        months.add("Май");
        months.add("Ноябрь");
        months.add("Декабрь");
        months.add("Май");
        System.out.println(months);
        System.out.println("Количество уникальных слов: "+months.size()+"\n");

        //Задание №2

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Strikalov","233-45-56");
        phoneBook.add("Levin","234-67-90");
        phoneBook.add("Ivanov","995-99-95");
        phoneBook.add("Anderson","900-23-67");
        phoneBook.add("Brown","333-44-57");
        phoneBook.add("Smirnov","177-18-18");
        phoneBook.add("Ivanov","255-13-14");
        phoneBook.add("Kutsenko","007-18-18");
        phoneBook.add("Smirnov","605-98-98");
        phoneBook.add("Ivanov","234-45-45");

        System.out.println("Телефоны для фамилии Strikalov: "+phoneBook.get("Strikalov"));
        System.out.println("Телефоны для фамилии Ivanov: "+phoneBook.get("Ivanov"));
        System.out.println("Телефоны для фамилии Smirnov: "+phoneBook.get("Smirnov"));


    }
}
