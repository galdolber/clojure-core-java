package clojure;

import clojure.lang.*;

public final class set_map_invert extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "reduce");
 }
 public set_map_invert() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object m1) {
  return ((IFn)const__0.getRawRoot()).invoke(new clojure.set_map_invert_fn__6887(), clojure.lang.PersistentArrayMap.EMPTY, m1);
 }
}
