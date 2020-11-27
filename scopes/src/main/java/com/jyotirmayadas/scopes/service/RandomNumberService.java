package com.jyotirmayadas.scopes.service;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

import java.util.Random;

@Service
@Scope(value = WebApplicationContext.SCOPE_REQUEST,
//        value = WebApplicationContext.SCOPE_SESSION, // different per browser
//        value = WebApplicationContext.SCOPE_APPLICATION, // same for all browser, just like singleton inherited from spring
//        proxyMode = ScopedProxyMode.TARGET_CLASS
        proxyMode = ScopedProxyMode.INTERFACES // default proxy mode
)
public class RandomNumberService implements NumberService {

    private final int value;

    public RandomNumberService() {
        this.value = new Random().nextInt(1000);
    }

    public int getValue() {
//        new RuntimeException().printStackTrace();
        return value;
    }
}
