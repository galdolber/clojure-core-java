package clojure;

import clojure.lang.*;

public final class set_select_fn__6867 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "disj");
 }
 Object pred1;
 public set_select_fn__6867(final Object pred1) {
  super();
  this.pred1 = pred1;
 }
 public java.lang.Object invoke(java.lang.Object s1, java.lang.Object k2) {
  Object __r4498 = ((IFn)this.pred1).invoke(k2);
  if (__r4498 != null && !(__r4498 == Boolean.FALSE)) {
   return s1;
  } else {
   return ((IFn)const__0.getRawRoot()).invoke(s1, k2);
  }
 }
}
