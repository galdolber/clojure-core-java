package clojure;

import clojure.lang.*;

public final class core_underive_fn__4916 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "key");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "interpose");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "val");
 }
 public core_underive_fn__4916() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p1__4913_SHARP_1) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(p1__4913_SHARP_1), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(p1__4913_SHARP_1), ((IFn)const__3.getRawRoot()).invoke(p1__4913_SHARP_1)));
 }
}
