package clojure;

import clojure.lang.*;

public final class core_load_one_fn__4974 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "commute");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "*loaded-libs*");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "conj");
 }
 Object lib1;
 public core_load_one_fn__4974(final Object lib1) {
  super();
  this.lib1 = lib1;
 }
 public java.lang.Object invoke() {
  return ((IFn)const__0.getRawRoot()).invoke(const__1.get(), const__2.getRawRoot(), this.lib1);
 }
}
