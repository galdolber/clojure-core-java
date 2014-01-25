package clojure.java;

import clojure.lang.*;

public final class io_fn__8688 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__1 = (clojure.lang.Var)RT.var("clojure.java.io", "make-output-stream");
  const__2 = (clojure.lang.Var)RT.var("clojure.java.io", "as-file");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "str");
 }
 public io_fn__8688() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object opts2) {
  if (clojure.lang.Util.equiv(((java.lang.Object)"file"), ((java.lang.Object)((java.lang.String)((java.net.URL)x1).getProtocol())))) {
   Object __r6284 = x1;
   if (!(__r6284 instanceof clojure.java.io.Coercions)) {
    __r6284 = ((IFn)const__2.getRawRoot()).invoke(__r6284);
   } else {
    __r6284 = ((java.lang.Object)((clojure.java.io.Coercions) __r6284).as_file());
   }
   Object __r6283 = __r6284;
   if (!(__r6283 instanceof clojure.java.io.IOFactory)) {
    return ((IFn)const__1.getRawRoot()).invoke(__r6283, opts2);
   } else {
    return ((clojure.java.io.IOFactory) __r6283).make_output_stream(((java.lang.Object)opts2));
   }
  } else {
   Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)((IFn)const__3.getRawRoot()).invoke("Can not write to non-file URL <", x1, ">"))));
   return null;
  }
 }
}
