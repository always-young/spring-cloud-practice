package com.kevin.user.qualifie;

import java.util.ArrayList;
import java.util.List;

/**
 * Code is far away from bug with the animal protecting
 *
 * @author kevin lau (双鹰)
 */
public class Client {

    private List<Intercept> intercepts = new ArrayList<>();

    public String invoke(String req) {
        req = invokeInterceptor(req);
        return "hello for response " + req;
    }

    public void addIntercept(Intercept intercept) {
        intercepts.add(intercept);
    }

    private String invokeInterceptor(String req) {
        for (Intercept intercept : intercepts) {
            req = intercept.filter(req);
        }
        return req;
    }
}
