package Lvl2_AbstractFactory.factories;

import Lvl2_AbstractFactory.interfaces.Address;
import Lvl2_AbstractFactory.interfaces.ContactFactory;
import Lvl2_AbstractFactory.interfaces.Phone;
import Lvl2_AbstractFactory.products.SpainProduct;

public class SpainContactFactory implements ContactFactory {
    private String street, city, zip, phone;

    public SpainContactFactory(String street, String city, String zip, String phone) {
        this.street = street; this.city = city; this.zip = zip; this.phone = phone;
    }

    @Override
    public Address createAddress() { return new SpainProduct.SpainAddress(street, city, zip); }

    @Override
    public Phone createPhone() { return new SpainProduct.SpainPhone(phone); }
}