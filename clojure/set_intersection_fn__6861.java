package clojure;

import clojure.lang.*;

public final class set_intersection_fn__6861 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "-");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "count");
 }
 public set_intersection_fn__6861() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p1__6858_SHARP_1) {
  return Numbers.num(clojure.lang.Numbers.minus((long)clojure.lang.RT.count(((java.lang.Object)p1__6858_SHARP_1))));
 }
}
