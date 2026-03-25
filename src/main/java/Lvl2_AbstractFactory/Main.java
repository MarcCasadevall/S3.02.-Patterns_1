package Lvl2_AbstractFactory;

import Lvl2_AbstractFactory.factories.SpainContactFactory;
import Lvl2_AbstractFactory.factories.USAContactFactory;
import Lvl2_AbstractFactory.interfaces.ContactFactory;

public class Main {
    public static void main(String[] args) {

        ContactFactory spainFactory = new SpainContactFactory(
                "Carrer Major 34", "Barcelona", "08001", "123456789"
        );
        Contact contactSpain = new Contact(spainFactory);
        System.out.println(contactSpain.toString());


        ContactFactory usaFactory = new USAContactFactory(
                "154 5th Avenue", "New York", "NY 10001", "987654321"
        );
        Contact contactUSA = new Contact(usaFactory);
        System.out.println(contactUSA.toString());
    }
}