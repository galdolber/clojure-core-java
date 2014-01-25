package clojure.java;

import clojure.lang.*;

public final class io_fn__8656 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.java.io", "make-reader");
  const__1 = (clojure.lang.Var)RT.var("clojure.java.io", "make-input-stream");
 }
 public io_fn__8656() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object opts2) {
  Object __r6272 = x1;
  if (!(__r6272 instanceof clojure.java.io.IOFactory)) {
   __r6272 = ((IFn)const__1.getRawRoot()).invoke(__r6272, opts2);
  } else {
   __r6272 = ((java.lang.Object)((clojure.java.io.IOFactory) __r6272).make_input_stream(((java.lang.Object)opts2)));
  }
  Object __r6271 = __r6272;
  if (!(__r6271 instanceof clojure.java.io.IOFactory)) {
   return ((IFn)const__0.getRawRoot()).invoke(__r6271, opts2);
  } else {
   return ((clojure.java.io.IOFactory) __r6271).make_reader(((java.lang.Object)opts2));
  }
 }
}
