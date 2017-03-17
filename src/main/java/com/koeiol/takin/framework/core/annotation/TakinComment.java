package com.koeiol.takin.framework.core.annotation;

import java.lang.annotation.*;

/**
 * Created by xuhua@koeiol.com.
 */
@Target(value = { ElementType.TYPE, ElementType.FIELD })
@Retention(value = RetentionPolicy.RUNTIME)
@Documented
public @interface TakinComment {

    String value();

}
