package clojure;

import clojure.lang.*;

public final class core_fn__5442 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "*print-readably*");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "print-meta");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "print-sequential");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "pr-on");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "print-object");
 }
 public core_fn__5442() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object v1, java.lang.Object w2) {
  Object __r3458 = const__0.get();
  if (__r3458 != null && !(__r3458 == Boolean.FALSE)) {
   ((IFn)const__1.getRawRoot()).invoke(v1, w2);
   return ((IFn)const__2.getRawRoot()).invoke("[", const__3.getRawRoot(), " ", "]", v1, w2);
  } else {
   return ((IFn)const__4.getRawRoot()).invoke(v1, w2);
  }
 }
}
