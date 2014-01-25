package clojure;

import clojure.lang.*;

public final class core_defn_ extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Symbol const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Keyword const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "list*");
  const__1 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "defn");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "with-meta");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "meta");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "private");
 }
 public core_defn_() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object name3, java.lang.Object decls4) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1, ((IFn)const__2.getRawRoot()).invoke(name3, ((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(name3), const__5, Boolean.TRUE)), decls4);
 }
 public int getRequiredArity() {
  return 3;
 }
}
