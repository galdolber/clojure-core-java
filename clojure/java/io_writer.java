package clojure.java;

import clojure.lang.*;

public final class io_writer extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.java.io", "make-writer");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
 }
 public io_writer() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object x1, java.lang.Object opts2) {
  Object __r6252 = x1;
  if (!(__r6252 instanceof clojure.java.io.IOFactory)) {
   Object __r6253;
   Object __r6254 = opts2;
   if (__r6254 != null && !(__r6254 == Boolean.FALSE)) {
    __r6253 = ((IFn)const__1.getRawRoot()).invoke(const__2.getRawRoot(), opts2);
   } else {
    __r6253 = null;
   }
   return ((IFn)const__0.getRawRoot()).invoke(__r6252, __r6253);
  } else {
   Object __r6255;
   Object __r6256 = opts2;
   if (__r6256 != null && !(__r6256 == Boolean.FALSE)) {
    __r6255 = ((IFn)const__1.getRawRoot()).invoke(const__2.getRawRoot(), opts2);
   } else {
    __r6255 = null;
   }
   return ((clojure.java.io.IOFactory) __r6252).make_writer(((java.lang.Object)__r6255));
  }
 }
 public int getRequiredArity() {
  return 1;
 }
}
