package clojure;

import clojure.lang.*;

public final class core_defmethod extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Symbol const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Keyword const__5;
 public static final clojure.lang.Symbol const__6;
 public static final clojure.lang.IPersistentMap const__7;
 public static final clojure.lang.Symbol const__8;
 public static final clojure.lang.Symbol const__9;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__3 = (clojure.lang.Symbol)Symbol.intern(null, ".");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "with-meta");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "tag");
  const__6 = (clojure.lang.Symbol)Symbol.intern(null, "clojure.lang.MultiFn");
  const__7 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "tag"), Symbol.intern(null, "clojure.lang.MultiFn"));
  const__8 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "addMethod");
  const__9 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "fn");
 }
 public core_defmethod() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object multifn3, java.lang.Object dispatch_val4, java.lang.Object fn_tail5) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__3), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(multifn3, const__7)), ((IFn)const__2.getRawRoot()).invoke(const__8), ((IFn)const__2.getRawRoot()).invoke(dispatch_val4), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__9), fn_tail5)))));
 }
 public int getRequiredArity() {
  return 4;
 }
}
