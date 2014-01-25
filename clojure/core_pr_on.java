package clojure;

import clojure.lang.*;

public final class core_pr_on extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "*print-dup*");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "print-dup");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "print-method");
 }
 public core_pr_on() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object w2) {
  Object __r2699 = const__0.get();
  if (__r2699 != null && !(__r2699 == Boolean.FALSE)) {
   ((IFn)const__1.getRawRoot()).invoke(x1, w2);
  } else {
   ((IFn)const__2.getRawRoot()).invoke(x1, w2);
  }
  return null;
 }
}
