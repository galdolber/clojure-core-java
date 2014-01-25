package clojure;

import clojure.lang.*;

public final class core_class extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nil?");
 }
 public core_class() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  if (clojure.lang.Util.identical(((java.lang.Object)x1), ((java.lang.Object)null))) {
   return x1;
  } else {
   return ((java.lang.Class)((java.lang.Object)x1).getClass());
  }
 }
}
