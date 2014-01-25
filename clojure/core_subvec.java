package clojure;

import clojure.lang.*;

public final class core_subvec extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "subvec");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "count");
 }
 public core_subvec() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object v1, java.lang.Object start2, java.lang.Object end3) {
  return ((clojure.lang.IPersistentVector)clojure.lang.RT.subvec((clojure.lang.IPersistentVector)((clojure.lang.IPersistentVector)v1), (int)RT.intCast(start2), (int)RT.intCast(end3)));
 }
 public java.lang.Object invoke(java.lang.Object v1, java.lang.Object start2) {
  return ((IFn)const__0.getRawRoot()).invoke(v1, start2, Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)v1))));
 }
}
