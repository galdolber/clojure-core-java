package clojure;

import clojure.lang.*;

public final class core_partial_fn__4221 extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "concat");
 }
 Object arg12;
 Object f1;
 Object arg34;
 Object arg23;
 Object more5;
 public core_partial_fn__4221(final Object arg12, final Object f1, final Object arg34, final Object arg23, final Object more5) {
  super();
  this.arg12 = arg12;
  this.f1 = f1;
  this.arg34 = arg34;
  this.arg23 = arg23;
  this.more5 = more5;
 }
 public java.lang.Object doInvoke(java.lang.Object args1) {
  return ((IFn)const__0.getRawRoot()).invoke(this.f1, this.arg12, this.arg23, this.arg34, ((IFn)const__1.getRawRoot()).invoke(this.more5, args1));
 }
 public int getRequiredArity() {
  return 0;
 }
}
