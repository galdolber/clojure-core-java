package clojure.java;

import clojure.lang.*;

public final class io_fn__8692 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.java.io", "make-output-stream");
 }
 public io_fn__8692() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object opts2) {
  try {
   Object __r6286 = ((java.net.URL)((java.net.URI)x1).toURL());
   if (!(__r6286 instanceof clojure.java.io.IOFactory)) {
    return ((IFn)const__0.getRawRoot()).invoke(__r6286, opts2);
   } else {
    return ((clojure.java.io.IOFactory) __r6286).make_output_stream(((java.lang.Object)opts2));
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
