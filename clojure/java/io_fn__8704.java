package clojure.java;

import clojure.lang.*;

public final class io_fn__8704 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.java.io", "make-reader");
 }
 public io_fn__8704() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object opts2) {
  Object __r6294 = new java.io.CharArrayReader((char[])((char[])x1));
  if (!(__r6294 instanceof clojure.java.io.IOFactory)) {
   return ((IFn)const__0.getRawRoot()).invoke(__r6294, opts2);
  } else {
   return ((clojure.java.io.IOFactory) __r6294).make_reader(((java.lang.Object)opts2));
  }
 }
}
