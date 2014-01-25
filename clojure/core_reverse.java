package clojure;

import clojure.lang.*;

public final class core_reverse extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "reduce1");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "conj");
 }
 public core_reverse() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object coll1) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), clojure.lang.PersistentList.EMPTY, coll1);
 }
}
