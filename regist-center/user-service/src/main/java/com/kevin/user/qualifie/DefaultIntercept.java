package com.kevin.user.qualifie;

/**
 * Code is far away from bug with the animal protecting
 *
 * @author kevin lau (双鹰)
 */
public class DefaultIntercept implements Intercept {

    @Override
    public String filter(String req) {
        if (req.contains("kevin")) {
            return req.replace("kevin", "wwx");
        }
        return req;
    }
}
