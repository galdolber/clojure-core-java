package clojure;

import clojure.lang.*;

public final class set_join_fn__6901_fn__6902 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "conj");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "merge");
 }
 Object x2;
 public set_join_fn__6901_fn__6902(final Object x2) {
  super();
  this.x2 = x2;
 }
 public java.lang.Object invoke(java.lang.Object p1__6893_SHARP_1, java.lang.Object p2__6894_SHARP_2) {
  return ((IFn)const__0.getRawRoot()).invoke(p1__6893_SHARP_1, ((IFn)const__1.getRawRoot()).invoke(p2__6894_SHARP_2, this.x2));
 }
}
