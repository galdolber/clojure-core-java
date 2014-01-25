package clojure;

import clojure.lang.*;

public final class core_name extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "string?");
 }
 public core_name() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  Object __r2389 = ((IFn)const__0.getRawRoot()).invoke(x1);
  if (__r2389 != null && !(__r2389 == Boolean.FALSE)) {
   return x1;
  } else {
   return ((java.lang.String)((clojure.lang.Named)x1).getName());
  }
 }
}
