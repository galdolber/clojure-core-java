package clojure;

import clojure.lang.*;

public final class core_maybe_min_hash_fn__5126 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "dec");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "bit-shift-left");
  const__2 = (java.lang.Object)1L;
 }
 public core_maybe_min_hash_fn__5126() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p1__5096_SHARP_1) {
  return Numbers.num(clojure.lang.Numbers.dec((long)clojure.lang.Numbers.shiftLeft((long)1L, ((java.lang.Object)p1__5096_SHARP_1))));
 }
}
