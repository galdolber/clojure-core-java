package clojure.core;

import clojure.lang.*;

public final class reducers_cat_fn__6740 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core.reducers", "cat");
 }
 Object ctor1;
 public reducers_cat_fn__6740(final Object ctor1) {
  super();
  this.ctor1 = ctor1;
 }
 public java.lang.Object invoke(java.lang.Object left1, java.lang.Object right2) {
  return ((IFn)const__0.getRawRoot()).invoke(left1, right2);
 }
 public java.lang.Object invoke() {
  return ((IFn)this.ctor1).invoke();
 }
}
