package clojure;

import clojure.lang.*;

public final class core_lazy_seq extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Symbol const__1;
 public static final clojure.lang.Symbol const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Symbol const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__1 = (clojure.lang.Symbol)Symbol.intern(null, "new");
  const__2 = (clojure.lang.Symbol)Symbol.intern(null, "clojure.lang.LazySeq");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "list*");
  const__4 = (clojure.lang.Symbol)((clojure.lang.IObj)Symbol.intern(null, "fn*")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "once"), Boolean.TRUE));
 }
 public core_lazy_seq() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object body3) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1, const__2, ((IFn)const__3.getRawRoot()).invoke(const__4, clojure.lang.PersistentVector.EMPTY, body3));
 }
 public int getRequiredArity() {
  return 2;
 }
}
