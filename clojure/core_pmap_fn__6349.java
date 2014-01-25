package clojure;

import clojure.lang.*;

public final class core_pmap_fn__6349 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "apply");
 }
 Object f1;
 public core_pmap_fn__6349(final Object f1) {
  super();
  this.f1 = f1;
 }
 public java.lang.Object invoke(java.lang.Object p1__6333_SHARP_1) {
  return ((IFn)const__0.getRawRoot()).invoke(this.f1, p1__6333_SHARP_1);
 }
}
