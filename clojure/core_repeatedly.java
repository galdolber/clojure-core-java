package clojure;

import clojure.lang.*;

public final class core_repeatedly extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "take");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "repeatedly");
 }
 public core_repeatedly() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object n1, java.lang.Object f2) {
  return ((IFn)const__0.getRawRoot()).invoke(n1, ((IFn)const__1.getRawRoot()).invoke(f2));
 }
 public java.lang.Object invoke(java.lang.Object f1) {
  return new clojure.lang.LazySeq((clojure.lang.IFn)((clojure.lang.IFn)new clojure.core_repeatedly_fn__4733(f1)));
 }
}
