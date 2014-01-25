package clojure;

import clojure.lang.*;

public final class core_loop_fn__4600 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "symbol?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "gensym");
 }
 public core_loop_fn__4600() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object b1) {
  Object __r2856 = ((IFn)const__0.getRawRoot()).invoke(b1);
  if (__r2856 != null && !(__r2856 == Boolean.FALSE)) {
   return b1;
  } else {
   return ((IFn)const__1.getRawRoot()).invoke();
  }
 }
}
