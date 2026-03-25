package Lvl2_AbstractFactory;

import Lvl2_AbstractFactory.interfaces.Address;
import Lvl2_AbstractFactory.interfaces.ContactFactory;
import Lvl2_AbstractFactory.interfaces.Phone;

public class Contact {
    private Address address;
    private Phone phone;

    public Contact(ContactFactory factory) {
        this.address = factory.createAddress();
        this.phone = factory.createPhone();
    }

    @Override
    public String toString() {
        return "Address: " + address.getFullAddress() + " | Phone: " + phone.getFormattedNumber();
    }
}