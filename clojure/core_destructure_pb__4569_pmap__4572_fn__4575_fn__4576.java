package clojure;

import clojure.lang.*;

public final class core_destructure_pb__4569_pmap__4572_fn__4575_fn__4576 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "val");
 }
 Object entry2;
 public core_destructure_pb__4569_pmap__4572_fn__4575_fn__4576(final Object entry2) {
  super();
  this.entry2 = entry2;
 }
 public java.lang.Object invoke(java.lang.Object p1__4565_SHARP_1, java.lang.Object p2__4566_SHARP_2) {
  return ((IFn)const__0.getRawRoot()).invoke(p1__4565_SHARP_1, p2__4566_SHARP_2, ((IFn)((IFn)const__1.getRawRoot()).invoke(this.entry2)).invoke(p2__4566_SHARP_2));
 }
}
