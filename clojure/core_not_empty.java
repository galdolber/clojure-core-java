package clojure;

import clojure.lang.*;

public final class core_not_empty extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
 }
 public core_not_empty() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object coll1) {
  Object __r3029 = ((IFn)const__0.getRawRoot()).invoke(coll1);
  if (__r3029 != null && !(__r3029 == Boolean.FALSE)) {
   return coll1;
  } else {
   return null;
  }
 }
}
