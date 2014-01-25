package clojure.java;

import clojure.lang.*;

public final class io_inputstream__GT_reader extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.java.io", "make-reader");
  const__1 = (clojure.lang.Var)RT.var("clojure.java.io", "encoding");
 }
 public io_inputstream__GT_reader() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object is1, java.lang.Object opts2) {
  try {
   Object __r6275 = new java.io.InputStreamReader((java.io.InputStream)((java.io.InputStream)is1), (java.lang.String)((java.lang.String)((IFn)const__1.getRawRoot()).invoke(opts2)));
   if (!(__r6275 instanceof clojure.java.io.IOFactory)) {
    return ((IFn)const__0.getRawRoot()).invoke(__r6275, opts2);
   } else {
    return ((clojure.java.io.IOFactory) __r6275).make_reader(((java.lang.Object)opts2));
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
