package clojure;

import clojure.lang.*;

public final class core_assert_args extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Symbol const__3;
 public static final clojure.lang.Symbol const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Symbol const__6;
 public static final clojure.lang.Symbol const__7;
 public static final clojure.lang.Symbol const__8;
 public static final clojure.lang.Symbol const__9;
 public static final clojure.lang.Symbol const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Symbol const__12;
 public static final clojure.lang.Keyword const__13;
 public static final clojure.lang.Symbol const__14;
 public static final clojure.lang.Symbol const__15;
 public static final clojure.lang.Var const__16;
 public static final clojure.lang.Var const__17;
 public static final clojure.lang.Symbol const__18;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__3 = (clojure.lang.Symbol)Symbol.intern(null, "do");
  const__4 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "when-not");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__6 = (clojure.lang.Symbol)Symbol.intern(null, "throw");
  const__7 = (clojure.lang.Symbol)Symbol.intern(null, "java.lang.IllegalArgumentException.");
  const__8 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "str");
  const__9 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "first");
  const__10 = (clojure.lang.Symbol)Symbol.intern(null, "&form");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "second");
  const__12 = (clojure.lang.Symbol)Symbol.intern(null, "*ns*");
  const__13 = (clojure.lang.Keyword)Keyword.intern(null, "line");
  const__14 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "meta");
  const__15 = (clojure.lang.Symbol)Symbol.intern(null, "&form");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "nnext");
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "list*");
  const__18 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "assert-args");
 }
 public core_assert_args() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object pairs3) {
  Object __r2413 = null;
  {
   Object more4 = ((IFn)const__16.getRawRoot()).invoke(pairs3);
   Object __r2414;
   Object __r2415 = more4;
   if (__r2415 != null && !(__r2415 == Boolean.FALSE)) {
    __r2414 = ((IFn)const__17.getRawRoot()).invoke(const__18, more4);
   } else {
    __r2414 = null;
   }
   __r2413 = __r2414;
  }
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__3), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__4), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(pairs3)), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__6), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__7), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__8), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__9), ((IFn)const__2.getRawRoot()).invoke(const__10)))), ((IFn)const__2.getRawRoot()).invoke(" requires "), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(pairs3)), ((IFn)const__2.getRawRoot()).invoke(" in "), ((IFn)const__2.getRawRoot()).invoke(const__12), ((IFn)const__2.getRawRoot()).invoke(":"), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__13), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__14), ((IFn)const__2.getRawRoot()).invoke(const__15))))))))))))))))))), ((IFn)const__2.getRawRoot()).invoke(__r2413)));
 }
 public int getRequiredArity() {
  return 2;
 }
}
