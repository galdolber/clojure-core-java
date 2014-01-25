package clojure;

import clojure.lang.*;

public final class core_partition_by_fn__6373_fn__6374 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "=");
 }
 Object fv4;
 Object f1;
 public core_partition_by_fn__6373_fn__6374(final Object fv4, final Object f1) {
  super();
  this.fv4 = fv4;
  this.f1 = f1;
 }
 public java.lang.Object invoke(java.lang.Object p1__6372_SHARP_1) {
  return (clojure.lang.Util.equiv(((java.lang.Object)this.fv4), ((java.lang.Object)((IFn)this.f1).invoke(p1__6372_SHARP_1))) ? Boolean.TRUE : Boolean.FALSE);
 }
}
