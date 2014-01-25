package clojure.java;

import clojure.lang.*;

public final class io_fn__8684 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.java.io", "make-output-stream");
  const__1 = (clojure.lang.Var)RT.var("clojure.java.io", "append?");
 }
 public io_fn__8684() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object opts2) {
  try {
   Object __r6278 = new java.io.FileOutputStream((java.io.File)((java.io.File)x1), (boolean)((Boolean)((IFn)const__1.getRawRoot()).invoke(opts2)).booleanValue());
   if (!(__r6278 instanceof clojure.java.io.IOFactory)) {
    return ((IFn)const__0.getRawRoot()).invoke(__r6278, opts2);
   } else {
    return ((clojure.java.io.IOFactory) __r6278).make_output_stream(((java.lang.Object)opts2));
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
