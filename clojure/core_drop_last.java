package clojure;

import clojure.lang.*;

public final class core_drop_last extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "drop-last");
  const__1 = (java.lang.Object)1L;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "drop");
 }
 public core_drop_last() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object n1, java.lang.Object s2) {
  return ((IFn)const__2.getRawRoot()).invoke(new clojure.core_drop_last_fn__4271(), s2, ((IFn)const__3.getRawRoot()).invoke(n1, s2));
 }
 public java.lang.Object invoke(java.lang.Object s1) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1, s1);
 }
}
