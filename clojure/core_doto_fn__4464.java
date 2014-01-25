package clojure;

import clojure.lang.*;

public final class core_doto_fn__4464 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "next");
 }
 Object gx5;
 public core_doto_fn__4464(final Object gx5) {
  super();
  this.gx5 = gx5;
 }
 public java.lang.Object invoke(java.lang.Object f1) {
  Object __r2715 = ((IFn)const__0.getRawRoot()).invoke(f1);
  if (__r2715 != null && !(__r2715 == Boolean.FALSE)) {
   return ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(f1)), ((IFn)const__3.getRawRoot()).invoke(this.gx5), ((IFn)const__5.getRawRoot()).invoke(f1)));
  } else {
   return ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(f1), ((IFn)const__3.getRawRoot()).invoke(this.gx5)));
  }
 }
}
