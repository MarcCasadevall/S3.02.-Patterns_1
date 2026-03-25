package Lvl2_AbstractFactory.factories;

import Lvl2_AbstractFactory.interfaces.Address;
import Lvl2_AbstractFactory.interfaces.ContactFactory;
import Lvl2_AbstractFactory.interfaces.Phone;
import Lvl2_AbstractFactory.products.USAProduct;

public class USAContactFactory implements ContactFactory {
    private String street, city, zip, phone;

    public USAContactFactory(String street, String city, String zip, String phone) {
        this.street = street; this.city = city; this.zip = zip; this.phone = phone;
    }

    @Override
    public Address createAddress() { return new USAProduct.USAAddress(street, city, zip); }

    @Override
    public Phone createPhone() { return new USAProduct.USAPhone(phone); }
}