package clojure.java;

import clojure.lang.*;

public final class io_fn__8686 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.java.io", "make-input-stream");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__2 = (clojure.lang.Var)RT.var("clojure.java.io", "as-file");
 }
 public io_fn__8686() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object opts2) {
  try {
   Object __r6280;
   if (clojure.lang.Util.equiv(((java.lang.Object)"file"), ((java.lang.Object)((java.lang.String)((java.net.URL)x1).getProtocol())))) {
    Object __r6281 = x1;
    if (!(__r6281 instanceof clojure.java.io.Coercions)) {
     __r6281 = ((IFn)const__2.getRawRoot()).invoke(__r6281);
    } else {
     __r6281 = ((java.lang.Object)((clojure.java.io.Coercions) __r6281).as_file());
    }
    __r6280 = new java.io.FileInputStream((java.io.File)((java.io.File)__r6281));
   } else {
    __r6280 = ((java.io.InputStream)((java.net.URL)x1).openStream());
   }
   Object __r6279 = __r6280;
   if (!(__r6279 instanceof clojure.java.io.IOFactory)) {
    return ((IFn)const__0.getRawRoot()).invoke(__r6279, opts2);
   } else {
    return ((clojure.java.io.IOFactory) __r6279).make_input_stream(((java.lang.Object)opts2));
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
