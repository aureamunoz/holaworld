package me.auri;

import me.auri.service.HolaService;

import java.util.NoSuchElementException;
import java.util.ServiceLoader;

public class HolaProvider {
    private static HolaProvider provider;

    private ServiceLoader<HolaService> loader;

    private HolaProvider() {

        loader = ServiceLoader.load(HolaService.class);

    }

    public static HolaProvider getInstance() {

        if (provider == null) {

            provider = new HolaProvider();

        }

        return provider;

    }

    public HolaService serviceImpl() {

        HolaService service = loader.iterator().next();

        if (service != null) {

            return service;

        } else {

            throw new NoSuchElementException(

                    "No implementation for HolaProvider");

        }

    }
}
