package clojure;

import clojure.lang.*;

public final class pprint_remainders_fn__7683 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.IPersistentStack const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "pos?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "rem");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "quot");
  const__3 = (clojure.lang.IPersistentStack)RT.vector(null, null);
 }
 Object base1;
 public pprint_remainders_fn__7683(final Object base1) {
  super();
  this.base1 = base1;
 }
 public java.lang.Object invoke(java.lang.Object p1__7682_SHARP_1) {
  if (clojure.lang.Numbers.isPos(((java.lang.Object)p1__7682_SHARP_1))) {
   return RT.vector(((java.lang.Number)clojure.lang.Numbers.remainder(((java.lang.Object)p1__7682_SHARP_1), ((java.lang.Object)this.base1))), ((java.lang.Number)clojure.lang.Numbers.quotient(((java.lang.Object)p1__7682_SHARP_1), ((java.lang.Object)this.base1))));
  } else {
   return const__3;
  }
 }
}
