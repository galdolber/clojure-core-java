package clojure;

import clojure.lang.*;

public final class core_bound_fn_STAR__fn__4127 extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "with-bindings*");
 }
 Object bindings2;
 Object f1;
 public core_bound_fn_STAR__fn__4127(final Object bindings2, final Object f1) {
  super();
  this.bindings2 = bindings2;
  this.f1 = f1;
 }
 public java.lang.Object doInvoke(java.lang.Object args1) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), this.bindings2, this.f1, args1);
 }
 public int getRequiredArity() {
  return 0;
 }
}
