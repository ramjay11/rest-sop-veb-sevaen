package com.ramjava.saabunpraimar.service;

import com.ramjava.saabubpaimar.User;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class UpayogakartaSeva {
    private static final Map<String, User> upayogakartaon = new HashMap<>();
    //
    @PostConstruct
    public void initialize() {
        User siber = new User();
        siber.setName("Siber");
        siber.setEmpId(1111);
        siber.setSalary(11000);

        User doray = new User();
        siber.setName("Doray");
        siber.setEmpId(2222);
        siber.setSalary(22000);

        User mowkree = new User();
        siber.setName("Mowkree");
        siber.setEmpId(3333);
        siber.setSalary(33000);

        upayogakartaon.put(siber.getName(), siber);
        upayogakartaon.put(doray.getName(), doray);
        upayogakartaon.put(mowkree.getName(), mowkree);
    }

    public User getUsers(String name) {
        return upayogakartaon.get(name);
    }

}
