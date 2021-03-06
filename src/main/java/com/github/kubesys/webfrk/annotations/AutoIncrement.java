/**
 * Copyrigt (2019, ) Institute of Software, Chinese Academy of Sciences
 */
package com.github.kubesys.webfrk.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.github.kubesys.webfrk.annotations.handlers.AutoIncrementHanler;


/**
 * @author wuheng
 * @since  2019.3.7
 *
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AutoIncrement {

	Class<?> handler() default AutoIncrementHanler.class;
	
	String desc() default "主键，自增长";
}
