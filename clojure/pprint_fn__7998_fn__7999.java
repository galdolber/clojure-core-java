package clojure;

import clojure.lang.*;

public final class pprint_fn__7998_fn__7999 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "format-integer");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "base");
 }
 public pprint_fn__7998_fn__7999() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p1__7950_SHARP_1, java.lang.Object p2__7951_SHARP_2, java.lang.Object p3__7952_SHARP_3) {
  return ((IFn)const__0.getRawRoot()).invoke(RT.get(p1__7950_SHARP_1, Keyword.intern(null, "base")), p1__7950_SHARP_1, p2__7951_SHARP_2, p3__7952_SHARP_3);
 }
}
