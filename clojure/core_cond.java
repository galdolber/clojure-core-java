package clojure;

import clojure.lang.*;

public final class core_cond extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Symbol const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Symbol const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__1 = (clojure.lang.Symbol)Symbol.intern(null, "if");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "second");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__6 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "cond");
 }
 public core_cond() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object clauses3) {
  Object __r2303 = clauses3;
  if (__r2303 != null && !(__r2303 == Boolean.FALSE)) {
   Object __r2304;
   Object __r2305 = ((IFn)const__3.getRawRoot()).invoke(clauses3);
   if (__r2305 != null && !(__r2305 == Boolean.FALSE)) {
    __r2304 = ((IFn)const__4.getRawRoot()).invoke(clauses3);
   } else {
    Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)"cond requires an even number of forms")));
    __r2304 = null;
   }
   return ((IFn)const__0.getRawRoot()).invoke(const__1, ((IFn)const__2.getRawRoot()).invoke(clauses3), __r2304, ((IFn)const__5.getRawRoot()).invoke(const__6, ((IFn)const__3.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(clauses3))));
  } else {
   return null;
  }
 }
 public int getRequiredArity() {
  return 2;
 }
}
