package clojure;

import clojure.lang.*;

public final class core_partial_fn__4215 extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "apply");
 }
 Object arg12;
 Object f1;
 public core_partial_fn__4215(final Object arg12, final Object f1) {
  super();
  this.arg12 = arg12;
  this.f1 = f1;
 }
 public java.lang.Object doInvoke(java.lang.Object args1) {
  return ((IFn)const__0.getRawRoot()).invoke(this.f1, this.arg12, args1);
 }
 public int getRequiredArity() {
  return 0;
 }
}
