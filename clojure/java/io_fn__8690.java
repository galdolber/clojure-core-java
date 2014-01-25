package clojure.java;

import clojure.lang.*;

public final class io_fn__8690 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.java.io", "make-input-stream");
 }
 public io_fn__8690() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object opts2) {
  try {
   Object __r6285 = ((java.net.URL)((java.net.URI)x1).toURL());
   if (!(__r6285 instanceof clojure.java.io.IOFactory)) {
    return ((IFn)const__0.getRawRoot()).invoke(__r6285, opts2);
   } else {
    return ((clojure.java.io.IOFactory) __r6285).make_input_stream(((java.lang.Object)opts2));
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
