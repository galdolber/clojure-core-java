package clojure;

import clojure.lang.*;

public final class core_interpose extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "drop");
  const__1 = (java.lang.Object)1L;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "interleave");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "repeat");
 }
 public core_interpose() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object sep1, java.lang.Object coll2) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1, ((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(sep1), coll2));
 }
}
