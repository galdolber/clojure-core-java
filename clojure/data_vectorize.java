package clojure;

import clojure.lang.*;

public final class data_vectorize extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "reduce");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "vec");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "repeat");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "max");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "keys");
 }
 public data_vectorize() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object m1) {
  Object __r6353 = ((IFn)const__0.getRawRoot()).invoke(m1);
  if (__r6353 != null && !(__r6353 == Boolean.FALSE)) {
   return ((IFn)const__1.getRawRoot()).invoke(new clojure.data_vectorize_fn__8789(), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(const__5.getRawRoot(), ((IFn)const__6.getRawRoot()).invoke(m1)), null)), m1);
  } else {
   return null;
  }
 }
}
