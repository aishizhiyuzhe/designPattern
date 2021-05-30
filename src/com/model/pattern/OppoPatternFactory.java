package com.model.pattern;

import com.model.resource.OppoPhone;
import com.model.resource.Phone;
import com.model.resource.VivoPhone;

public class OppoPatternFactory {
    Phone create(){
        return new OppoPhone();
    }
}
