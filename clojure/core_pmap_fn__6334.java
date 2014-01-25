package clojure;

import clojure.lang.*;

public final class core_pmap_fn__6334 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "future-call");
 }
 Object f1;
 public core_pmap_fn__6334(final Object f1) {
  super();
  this.f1 = f1;
 }
 public java.lang.Object invoke(java.lang.Object p1__6332_SHARP_1) {
  return ((IFn)const__0.getRawRoot()).invoke(new clojure.core_pmap_fn__6334_fn__6335(this.f1, p1__6332_SHARP_1));
 }
}
