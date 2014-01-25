package clojure;

import clojure.lang.*;

public final class core_delay extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Symbol const__1;
 public static final clojure.lang.Symbol const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Symbol const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Keyword const__10;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__1 = (clojure.lang.Symbol)Symbol.intern(null, "new");
  const__2 = (clojure.lang.Symbol)Symbol.intern(null, "clojure.lang.Delay");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "list*");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "with-meta");
  const__5 = (clojure.lang.Symbol)((clojure.lang.IObj)Symbol.intern(null, "fn*")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "once"), Boolean.TRUE));
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__10 = (clojure.lang.Keyword)Keyword.intern(null, "once");
 }
 public core_delay() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object body3) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1, const__2, ((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(const__5, ((IFn)const__6.getRawRoot()).invoke(const__7.getRawRoot(), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(((IFn)const__0.getRawRoot()).invoke(const__10), ((IFn)const__0.getRawRoot()).invoke(Boolean.TRUE))))), clojure.lang.PersistentVector.EMPTY, body3));
 }
 public int getRequiredArity() {
  return 2;
 }
}
