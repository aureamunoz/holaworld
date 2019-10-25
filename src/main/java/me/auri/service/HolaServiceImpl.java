package me.auri.service;

public class HolaServiceImpl  implements HolaService{

    @Override
    public void sayHello(String name) {
        System.out.println("Hola "+name);
    }
}
