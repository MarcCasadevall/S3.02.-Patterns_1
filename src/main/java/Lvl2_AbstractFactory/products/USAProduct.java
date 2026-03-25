package Lvl2_AbstractFactory.products;
import Lvl2_AbstractFactory.interfaces.Address;
import Lvl2_AbstractFactory.interfaces.Phone;

public class USAProduct {
    public static class USAPhone implements Phone {
        private String number;

        public USAPhone(String number) {
            this.number = number;
        }

        @Override
        public String getFormattedNumber() {
            return "+1 " + number; // Añade prefijo de USA
        }
    }

    public static class USAAddress implements Address {
        private String street, city, zip;

        public USAAddress(String street, String city, String zip) {
            this.street = street;
            this.city = city;
            this.zip = zip;
        }

        @Override
        public String getFullAddress() {
            return street + ", " + city + ", " + zip; // Formato USA
        }
    }
}
