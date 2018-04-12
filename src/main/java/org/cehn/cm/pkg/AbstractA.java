package org.cehn.cm.pkg;

/**
 * Title:
 * Description:
 * http://docs.oracle.com/javase/specs/jls/se7/html/jls-6.html#jls-6.6.1
 *
 * A member (class, interface, field, or method) of a reference (class, interface, or array) type or a constructor of a class type is accessible only if the type is accessible and the member or constructor is declared to permit access:

 If the member or constructor is declared public, then access is permitted.
 All members of interfaces are implicitly public.
 Otherwise, if the member or constructor is declared protected, then access is permitted only when one of the following is true:
 Access to the member or constructor occurs from within the package containing the class in which the protected member or constructor is declared.
 Access is correct as described in §6.6.2.
 Otherwise, if the member or constructor is declared private, then access is permitted if and only if it occurs within the body of the top level class (§7.6) that encloses the declaration of the member or constructor.
 Otherwise, we say there is default access, which is permitted only when the access occurs from within the package in which the type is declared.
 *
 * Copyright: Copyright (c)2015
 * Company: YeePay
 *
 * @author chen.liu on 2018/4/12.
 */
public abstract class AbstractA {

    void say() {
        System.out.println("This is AbstractA.");
    }
}
