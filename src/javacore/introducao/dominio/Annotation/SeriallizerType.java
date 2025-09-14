package javacore.introducao.dominio.Annotation;


import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME) //Funcionar em RUNTIME
@Target(TYPE) //Alvo em que ela vai ser utilizada
public @interface SeriallizerType {

    FielFormatEnum fieldFormat();
}
