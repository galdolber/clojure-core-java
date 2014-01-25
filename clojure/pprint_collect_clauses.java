package clojure;

import clojure.lang.*;

public final class pprint_collect_clauses extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Keyword const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "second");
  const__1 = (clojure.lang.Var)RT.var("clojure.pprint", "consume");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "clauses");
 }
 public pprint_collect_clauses() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object bracket_info1, java.lang.Object offset2, java.lang.Object remainder3) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(new clojure.pprint_collect_clauses_fn__8181(bracket_info1, offset2), RT.vector(RT.mapUniqueKeys(const__2, clojure.lang.PersistentVector.EMPTY), Boolean.FALSE, remainder3)));
 }
}
