package clojure.java;

import clojure.lang.*;

public final class io_reader extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.java.io", "make-reader");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
 }
 public io_reader() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object x1, java.lang.Object opts2) {
  Object __r6247 = x1;
  if (!(__r6247 instanceof clojure.java.io.IOFactory)) {
   Object __r6248;
   Object __r6249 = opts2;
   if (__r6249 != null && !(__r6249 == Boolean.FALSE)) {
    __r6248 = ((IFn)const__1.getRawRoot()).invoke(const__2.getRawRoot(), opts2);
   } else {
    __r6248 = null;
   }
   return ((IFn)const__0.getRawRoot()).invoke(__r6247, __r6248);
  } else {
   Object __r6250;
   Object __r6251 = opts2;
   if (__r6251 != null && !(__r6251 == Boolean.FALSE)) {
    __r6250 = ((IFn)const__1.getRawRoot()).invoke(const__2.getRawRoot(), opts2);
   } else {
    __r6250 = null;
   }
   return ((clojure.java.io.IOFactory) __r6247).make_reader(((java.lang.Object)__r6250));
  }
 }
 public int getRequiredArity() {
  return 1;
 }
}
