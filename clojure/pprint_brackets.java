package clojure;

import clojure.lang.*;

public final class pprint_brackets extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.IPersistentStack const__1;
 public static final clojure.lang.IPersistentStack const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "vector?");
  const__1 = (clojure.lang.IPersistentStack)RT.vector("[", "]");
  const__2 = (clojure.lang.IPersistentStack)RT.vector("(", ")");
 }
 public pprint_brackets() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object form1) {
  Object __r5977 = ((IFn)const__0.getRawRoot()).invoke(form1);
  if (__r5977 != null && !(__r5977 == Boolean.FALSE)) {
   return const__1;
  } else {
   return const__2;
  }
 }
}
