package com.fasterxml.jackson.xml.annotate;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.codehaus.jackson.annotate.JacksonAnnotation;

/**
 * Annotation that can be used to define name of root element used
 * for the root-level object when serialized, which normally uses
 * name of the type (class). It is similar to JAXB <code>XmlRootElement</code>.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@JacksonAnnotation
public @interface JacksonXmlRootElement
{
    String namespace() default "";
    String localName() default "";
}
