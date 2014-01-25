package clojure.java;

import clojure.lang.*;

public final class io_fn__8568 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Var const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__1 = (clojure.lang.Var)RT.var("clojure.java.io", "as-file");
  const__2 = (clojure.lang.Var)RT.var("clojure.java.io", "escaped-utf8-urlstring->str");
  const__3 = (java.lang.Object)Character.valueOf((char)47);
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "str");
 }
 public io_fn__8568() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object u1) {
  if (clojure.lang.Util.equiv(((java.lang.Object)"file"), ((java.lang.Object)((java.lang.String)((java.net.URL)u1).getProtocol())))) {
   Object __r6237 = ((IFn)const__2.getRawRoot()).invoke(((java.lang.String)((java.lang.String)((java.lang.String)((java.net.URL)u1).getFile())).replace((char)((Character)const__3).charValue(), (char)java.io.File.separatorChar)));
   if (!(__r6237 instanceof clojure.java.io.Coercions)) {
    return ((IFn)const__1.getRawRoot()).invoke(__r6237);
   } else {
    return ((clojure.java.io.Coercions) __r6237).as_file();
   }
  } else {
   Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)((IFn)const__4.getRawRoot()).invoke("Not a file: ", u1))));
   return null;
  }
 }
}
