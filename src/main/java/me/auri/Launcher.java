package me.auri;

import me.auri.service.HolaService;

public class Launcher {

    public static void main(String... args){
        HolaService holaService = HolaProvider.getInstance().serviceImpl();
        holaService.sayHello("Auri");
    }

}
