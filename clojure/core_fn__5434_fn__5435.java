package clojure;

import clojure.lang.*;

public final class core_fn__5434_fn__5435 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "print-map");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "print-dup");
 }
 public core_fn__5434_fn__5435() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p1__5432_SHARP_1, java.lang.Object p2__5433_SHARP_2) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(p1__5432_SHARP_1), const__2.getRawRoot(), p2__5433_SHARP_2);
 }
}
