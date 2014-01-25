package clojure.java;

import clojure.lang.*;

public final class io_fn__8658 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.java.io", "make-writer");
  const__1 = (clojure.lang.Var)RT.var("clojure.java.io", "make-output-stream");
 }
 public io_fn__8658() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object opts2) {
  Object __r6274 = x1;
  if (!(__r6274 instanceof clojure.java.io.IOFactory)) {
   __r6274 = ((IFn)const__1.getRawRoot()).invoke(__r6274, opts2);
  } else {
   __r6274 = ((java.lang.Object)((clojure.java.io.IOFactory) __r6274).make_output_stream(((java.lang.Object)opts2)));
  }
  Object __r6273 = __r6274;
  if (!(__r6273 instanceof clojure.java.io.IOFactory)) {
   return ((IFn)const__0.getRawRoot()).invoke(__r6273, opts2);
  } else {
   return ((clojure.java.io.IOFactory) __r6273).make_writer(((java.lang.Object)opts2));
  }
 }
}
