package clojure.java;

import clojure.lang.*;

public final class io_as_relative_path extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.java.io", "as-file");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "str");
 }
 public io_as_relative_path() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  {
   Object __r6304 = x1;
   if (!(__r6304 instanceof clojure.java.io.Coercions)) {
    __r6304 = ((IFn)const__0.getRawRoot()).invoke(__r6304);
   } else {
    __r6304 = ((java.lang.Object)((clojure.java.io.Coercions) __r6304).as_file());
   }
   Object f2 = __r6304;
   if (((java.io.File)f2).isAbsolute()) {
    Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)((IFn)const__1.getRawRoot()).invoke(f2, " is not a relative path"))));
    return null;
   } else {
    return ((java.lang.String)((java.io.File)f2).getPath());
   }
  }
 }
}
