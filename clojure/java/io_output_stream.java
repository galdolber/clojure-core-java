package clojure.java;

import clojure.lang.*;

public final class io_output_stream extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.java.io", "make-output-stream");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
 }
 public io_output_stream() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object x1, java.lang.Object opts2) {
  Object __r6262 = x1;
  if (!(__r6262 instanceof clojure.java.io.IOFactory)) {
   Object __r6263;
   Object __r6264 = opts2;
   if (__r6264 != null && !(__r6264 == Boolean.FALSE)) {
    __r6263 = ((IFn)const__1.getRawRoot()).invoke(const__2.getRawRoot(), opts2);
   } else {
    __r6263 = null;
   }
   return ((IFn)const__0.getRawRoot()).invoke(__r6262, __r6263);
  } else {
   Object __r6265;
   Object __r6266 = opts2;
   if (__r6266 != null && !(__r6266 == Boolean.FALSE)) {
    __r6265 = ((IFn)const__1.getRawRoot()).invoke(const__2.getRawRoot(), opts2);
   } else {
    __r6265 = null;
   }
   return ((clojure.java.io.IOFactory) __r6262).make_output_stream(((java.lang.Object)__r6265));
  }
 }
 public int getRequiredArity() {
  return 1;
 }
}
