package clojure;

import clojure.lang.*;

public final class data_fn__8854 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.data", "diff-associative");
  const__1 = (clojure.lang.Var)RT.var("clojure.set", "union");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "keys");
 }
 public data_fn__8854() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object a1, java.lang.Object b2) {
  return ((IFn)const__0.getRawRoot()).invoke(a1, b2, ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(a1), ((IFn)const__2.getRawRoot()).invoke(b2)));
 }
}
