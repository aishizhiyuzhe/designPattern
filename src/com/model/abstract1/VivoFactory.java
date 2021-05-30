package com.model.abstract1;

import com.model.resource.Phone;
import com.model.resource.VivoPhone;

public class VivoFactory implements AbstractFactory {

    @Override
    public Phone create() {
        return new VivoPhone();
    }
}
