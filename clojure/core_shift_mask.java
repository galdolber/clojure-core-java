package clojure;

import clojure.lang.*;

public final class core_shift_mask extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "bit-and");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "bit-shift-right");
 }
 public core_shift_mask() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object shift1, java.lang.Object mask2, java.lang.Object x3) {
  return Numbers.num(clojure.lang.Numbers.and((long)clojure.lang.Numbers.shiftRight(((java.lang.Object)x3), ((java.lang.Object)shift1)), ((java.lang.Object)mask2)));
 }
}
