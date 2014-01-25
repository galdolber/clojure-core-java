package clojure.java;

import clojure.lang.*;

public final class io_outputstream__GT_writer extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.java.io", "make-writer");
  const__1 = (clojure.lang.Var)RT.var("clojure.java.io", "encoding");
 }
 public io_outputstream__GT_writer() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object os1, java.lang.Object opts2) {
  try {
   Object __r6276 = new java.io.OutputStreamWriter((java.io.OutputStream)((java.io.OutputStream)os1), (java.lang.String)((java.lang.String)((IFn)const__1.getRawRoot()).invoke(opts2)));
   if (!(__r6276 instanceof clojure.java.io.IOFactory)) {
    return ((IFn)const__0.getRawRoot()).invoke(__r6276, opts2);
   } else {
    return ((clojure.java.io.IOFactory) __r6276).make_writer(((java.lang.Object)opts2));
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
