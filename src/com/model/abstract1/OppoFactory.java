package com.model.abstract1;

import com.model.resource.OppoPhone;
import com.model.resource.Phone;
import com.model.resource.VivoPhone;

public class OppoFactory implements AbstractFactory {

    @Override
    public Phone create() {
        return new OppoPhone();
    }
}
