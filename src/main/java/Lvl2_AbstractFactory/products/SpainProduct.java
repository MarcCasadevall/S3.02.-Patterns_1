package Lvl2_AbstractFactory.products;
import Lvl2_AbstractFactory.interfaces.Address;
import Lvl2_AbstractFactory.interfaces.Phone;

public class SpainProduct {
    public static class SpainPhone implements Phone {
        private String number;

        public SpainPhone(String number) {
            this.number = number;
        }

        @Override
        public String getFormattedNumber() {
            return "+34 " + number;
        }
    }

    public static class SpainAddress implements Address {
        private String street, city, zip;

        public SpainAddress(String street, String city, String zip) {
            this.street = street;
            this.city = city;
            this.zip = zip;
        }

        @Override
        public String getFullAddress() {
            return street + ", " + zip + " " + city;
        }
    }
}
