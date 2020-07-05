package org.demo.guicedemo;

import com.google.inject.AbstractModule;
import org.demo.helloworlddemo.HelloWorldModule;

public class MainModule extends AbstractModule {

    @Override
    protected void configure() {
        install(new HelloWorldModule());
    }
}
