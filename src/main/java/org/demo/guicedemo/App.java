package org.demo.guicedemo;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class  App {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new MainModule(),
                new CommandLineModule(args));
        Applets.get(injector, args[0]).run();
    }


}
