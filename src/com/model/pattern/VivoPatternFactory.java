package com.model.pattern;

import com.model.resource.Phone;
import com.model.resource.VivoPhone;

public class VivoPatternFactory {
    Phone create(){
        return new VivoPhone();
    }
}
