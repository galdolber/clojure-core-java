package clojure;

import clojure.lang.*;

public final class core_filterv_fn__6320 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "conj!");
 }
 Object pred1;
 public core_filterv_fn__6320(final Object pred1) {
  super();
  this.pred1 = pred1;
 }
 public java.lang.Object invoke(java.lang.Object v1, java.lang.Object o2) {
  Object __r4082 = ((IFn)this.pred1).invoke(o2);
  if (__r4082 != null && !(__r4082 == Boolean.FALSE)) {
   return ((IFn)const__0.getRawRoot()).invoke(v1, o2);
  } else {
   return v1;
  }
 }
}
