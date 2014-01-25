package clojure;

import clojure.lang.*;

public final class core_group_by_sig extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "vals");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "reduce1");
 }
 public core_group_by_sig() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object coll1) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(new clojure.core_group_by_sig_fn__5178(), clojure.lang.PersistentArrayMap.EMPTY, coll1));
 }
}
