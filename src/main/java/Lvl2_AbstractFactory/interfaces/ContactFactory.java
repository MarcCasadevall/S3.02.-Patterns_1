package Lvl2_AbstractFactory.interfaces;

public interface ContactFactory {
    Address createAddress();
    Phone createPhone();
}