package clojure.java;

import clojure.lang.*;

public final class io_fn__8564 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.java.io", "as-file");
  const__1 = (clojure.lang.Var)RT.var("clojure.java.io", "as-url");
 }
 public io_fn__8564() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object u1) {
  Object __r6235 = u1;
  if (!(__r6235 instanceof clojure.java.io.Coercions)) {
   __r6235 = ((IFn)const__1.getRawRoot()).invoke(__r6235);
  } else {
   __r6235 = ((java.lang.Object)((clojure.java.io.Coercions) __r6235).as_url());
  }
  Object __r6234 = __r6235;
  if (!(__r6234 instanceof clojure.java.io.Coercions)) {
   return ((IFn)const__0.getRawRoot()).invoke(__r6234);
  } else {
   return ((clojure.java.io.Coercions) __r6234).as_file();
  }
 }
}
