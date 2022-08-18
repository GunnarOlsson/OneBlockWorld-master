package dev.mathsito.atlas.commandsII.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Alden Bansemer (MathsitoP)
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
public @interface AtlasParam {

    String filter() default "";
    String[] suggestions() default {};

}

