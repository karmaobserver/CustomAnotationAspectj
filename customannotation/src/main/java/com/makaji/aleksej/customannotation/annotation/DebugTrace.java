package com.makaji.aleksej.customannotation.annotation;

/**
 * Created by Aleksej on 9/13/2017.
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates that the annotated method is being traced (debug mode only) and
 * will use {@link android.util.Log} to print debug data:
 * - Method name
 * - Total execution time
 * - Value (optional string parameter)
 */
@Retention(RetentionPolicy.CLASS)
@Target({ ElementType.CONSTRUCTOR, ElementType.METHOD })
public @interface DebugTrace {}
