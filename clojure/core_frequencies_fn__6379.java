package clojure;

import clojure.lang.*;

public final class core_frequencies_fn__6379 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final java.lang.Object const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "assoc!");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "inc");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "get");
  const__3 = (java.lang.Object)0L;
 }
 public core_frequencies_fn__6379() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object counts1, java.lang.Object x2) {
  return ((IFn)const__0.getRawRoot()).invoke(counts1, x2, ((java.lang.Number)clojure.lang.Numbers.inc(((java.lang.Object)((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)counts1), ((java.lang.Object)x2), ((java.lang.Object)const__3)))))));
 }
}
