package clojure.java;

import clojure.lang.*;

public final class io_fn__8694 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.java.io", "make-input-stream");
 }
 public io_fn__8694() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object opts2) {
  try {
   try {
    Object __r6287 = new java.net.URL((java.lang.String)((java.lang.String)x1));
    if (!(__r6287 instanceof clojure.java.io.IOFactory)) {
     return ((IFn)const__0.getRawRoot()).invoke(__r6287, opts2);
    } else {
     return ((clojure.java.io.IOFactory) __r6287).make_input_stream(((java.lang.Object)opts2));
    }
   }
   catch (Throwable ex___) {
    if (ex___ instanceof java.net.MalformedURLException) {
     java.net.MalformedURLException e5 = (java.net.MalformedURLException) ex___;
     Object __r6288 = new java.io.File((java.lang.String)((java.lang.String)x1));
     if (!(__r6288 instanceof clojure.java.io.IOFactory)) {
      return ((IFn)const__0.getRawRoot()).invoke(__r6288, opts2);
     } else {
      return ((clojure.java.io.IOFactory) __r6288).make_input_stream(((java.lang.Object)opts2));
     }
    }
    else {
     throw Util.sneakyThrow(ex___);
    }
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
