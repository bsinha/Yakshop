/**
 * (C) Copyright © 1999- 2014. All rights reserved.
 */


package com.yakshop.herd.domain.xml;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.yakshop package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.yakshop
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Herd }.
     *
     * @return the herd
     */
    public Herd createHerd() {
        return new Herd();
    }

    /**
     * Create an instance of {@link Labyak }.
     *
     * @return the labyak
     */
    public Labyak createLabyak() {
        return new Labyak();
    }

}
