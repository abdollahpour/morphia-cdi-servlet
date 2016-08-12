package com.wpic.boilerplate.provider;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;

/**
 * Created by hamed on 8/12/16.
 */
@RequestScoped
public class SampleProvider {

    @Produces
    public String sayMyName() {
        return "Java";
    }

}
