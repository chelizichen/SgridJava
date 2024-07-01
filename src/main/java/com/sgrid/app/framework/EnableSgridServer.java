package com.sgrid.app.framework;
import org.springframework.context.annotation.Import;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Import(SgridConf.class)
public @interface EnableSgridServer {
    
}
