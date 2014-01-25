package clojure;

import clojure.lang.*;

public final class core_with_open extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Keyword const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final java.lang.Object const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Symbol const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Symbol const__15;
 public static final clojure.lang.Var const__16;
 public static final java.lang.Object const__17;
 public static final clojure.lang.Symbol const__18;
 public static final clojure.lang.Symbol const__19;
 public static final clojure.lang.Symbol const__20;
 public static final clojure.lang.Symbol const__21;
 public static final clojure.lang.Symbol const__22;
 public static final clojure.lang.Keyword const__23;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "vector?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "*ns*");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "line");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "meta");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "even?");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__9 = (java.lang.Object)0L;
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__13 = (clojure.lang.Symbol)Symbol.intern(null, "do");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "symbol?");
  const__15 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "let");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "subvec");
  const__17 = (java.lang.Object)2L;
  const__18 = (clojure.lang.Symbol)Symbol.intern(null, "try");
  const__19 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "with-open");
  const__20 = (clojure.lang.Symbol)Symbol.intern(null, "finally");
  const__21 = (clojure.lang.Symbol)Symbol.intern(null, ".");
  const__22 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "close");
  const__23 = (clojure.lang.Keyword)Keyword.intern(null, "else");
 }
 public core_with_open() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object bindings3, java.lang.Object body4) {
  Object __r2706 = ((IFn)const__0.getRawRoot()).invoke(bindings3);
  if (__r2706 != null && !(__r2706 == Boolean.FALSE)) {
  } else {
   Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(_AMPERSAND_form1), " requires ", "a vector for its binding", " in ", const__3.get(), ":", RT.get(((IFn)const__5.getRawRoot()).invoke(_AMPERSAND_form1), Keyword.intern(null, "line"))))));
  }
  Object __r2708 = ((IFn)const__6.getRawRoot()).invoke(Integer.valueOf(clojure.lang.RT.count(((java.lang.Object)bindings3))));
  if (__r2708 != null && !(__r2708 == Boolean.FALSE)) {
  } else {
   Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(_AMPERSAND_form1), " requires ", "an even number of forms in binding vector", " in ", const__3.get(), ":", RT.get(((IFn)const__5.getRawRoot()).invoke(_AMPERSAND_form1), Keyword.intern(null, "line"))))));
  }
  if (clojure.lang.Util.equiv((long)clojure.lang.RT.count(((java.lang.Object)bindings3)), (long)0L)) {
   return ((IFn)const__10.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(const__13), body4));
  } else {
   Object __r2711 = ((IFn)const__14.getRawRoot()).invoke(((IFn)bindings3).invoke(const__9));
   if (__r2711 != null && !(__r2711 == Boolean.FALSE)) {
    return ((IFn)const__10.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(const__15), ((IFn)const__12.getRawRoot()).invoke(((IFn)const__16.getRawRoot()).invoke(bindings3, const__9, const__17)), ((IFn)const__12.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(const__18), ((IFn)const__12.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(const__19), ((IFn)const__12.getRawRoot()).invoke(((IFn)const__16.getRawRoot()).invoke(bindings3, const__17)), body4))), ((IFn)const__12.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(const__20), ((IFn)const__12.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(const__21), ((IFn)const__12.getRawRoot()).invoke(((IFn)bindings3).invoke(const__9)), ((IFn)const__12.getRawRoot()).invoke(const__22))))))))))));
   } else {
    Object __r2713 = const__23;
    if (__r2713 != null && !(__r2713 == Boolean.FALSE)) {
     Util.trow((Throwable)new java.lang.IllegalArgumentException((java.lang.String)((java.lang.String)"with-open only allows Symbols in bindings")));
     return null;
    } else {
     return null;
    }
   }
  }
 }
 public int getRequiredArity() {
  return 3;
 }
}
