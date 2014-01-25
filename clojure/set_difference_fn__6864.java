package clojure;

import clojure.lang.*;

public final class set_difference_fn__6864 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "contains?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "disj");
 }
 Object s22;
 public set_difference_fn__6864(final Object s22) {
  super();
  this.s22 = s22;
 }
 public java.lang.Object invoke(java.lang.Object result1, java.lang.Object item2) {
  Object __r4495 = ((IFn)const__0.getRawRoot()).invoke(this.s22, item2);
  if (__r4495 != null && !(__r4495 == Boolean.FALSE)) {
   return ((IFn)const__1.getRawRoot()).invoke(result1, item2);
  } else {
   return result1;
  }
 }
}
