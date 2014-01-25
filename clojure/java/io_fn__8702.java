package clojure.java;

import clojure.lang.*;

public final class io_fn__8702 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.java.io", "make-input-stream");
 }
 public io_fn__8702() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object opts2) {
  Object __r6293 = new java.io.ByteArrayInputStream((byte[])((byte[])x1));
  if (!(__r6293 instanceof clojure.java.io.IOFactory)) {
   return ((IFn)const__0.getRawRoot()).invoke(__r6293, opts2);
  } else {
   return ((clojure.java.io.IOFactory) __r6293).make_input_stream(((java.lang.Object)opts2));
  }
 }
}
