package com.company.lesson9;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();

        phone1.model = "Apple";
        phone1.number = "8067111111";
        phone1.weight = 7.8;

        phone2.model = "Samsung";
        phone2.number = "808995665";
        phone2.weight = 10.8;

        System.out.println(phone1.model);
        System.out.println(phone1.number);
        System.out.println(phone1.weight);

        System.out.println(phone2.model);
        System.out.println(phone2.number);
        System.out.println(phone2.weight);

    }
}
