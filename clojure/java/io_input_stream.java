package clojure.java;

import clojure.lang.*;

public final class io_input_stream extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.java.io", "make-input-stream");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
 }
 public io_input_stream() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object x1, java.lang.Object opts2) {
  Object __r6257 = x1;
  if (!(__r6257 instanceof clojure.java.io.IOFactory)) {
   Object __r6258;
   Object __r6259 = opts2;
   if (__r6259 != null && !(__r6259 == Boolean.FALSE)) {
    __r6258 = ((IFn)const__1.getRawRoot()).invoke(const__2.getRawRoot(), opts2);
   } else {
    __r6258 = null;
   }
   return ((IFn)const__0.getRawRoot()).invoke(__r6257, __r6258);
  } else {
   Object __r6260;
   Object __r6261 = opts2;
   if (__r6261 != null && !(__r6261 == Boolean.FALSE)) {
    __r6260 = ((IFn)const__1.getRawRoot()).invoke(const__2.getRawRoot(), opts2);
   } else {
    __r6260 = null;
   }
   return ((clojure.java.io.IOFactory) __r6257).make_input_stream(((java.lang.Object)__r6260));
  }
 }
 public int getRequiredArity() {
  return 1;
 }
}
