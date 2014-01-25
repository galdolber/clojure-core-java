package clojure;

import clojure.lang.*;

public final class data_fn__8858 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.data", "as-set-value");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "not-empty");
  const__2 = (clojure.lang.Var)RT.var("clojure.set", "difference");
  const__3 = (clojure.lang.Var)RT.var("clojure.set", "intersection");
 }
 public data_fn__8858() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object a1, java.lang.Object b2) {
  {
   Object aval3 = ((IFn)const__0.getRawRoot()).invoke(a1);
   Object bval4 = ((IFn)const__0.getRawRoot()).invoke(b2);
   return RT.vector(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(aval3, bval4)), ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(bval4, aval3)), ((IFn)const__1.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(aval3, bval4)));
  }
 }
}
