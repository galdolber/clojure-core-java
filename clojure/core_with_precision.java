package clojure;

import clojure.lang.*;

public final class core_with_precision extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Symbol const__7;
 public static final clojure.lang.Symbol const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final java.lang.Object const__11;
 public static final java.lang.Object const__12;
 public static final clojure.lang.Symbol const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Var const__15;
 public static final clojure.lang.Symbol const__16;
 public static final clojure.lang.Symbol const__17;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "rounding");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__7 = (clojure.lang.Symbol)Symbol.intern(null, ".");
  const__8 = (clojure.lang.Symbol)Symbol.intern(null, "java.math.RoundingMode");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "second");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__11 = (java.lang.Object)0L;
  const__12 = (java.lang.Object)1L;
  const__13 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "binding");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "vector");
  const__16 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "*math-context*");
  const__17 = (clojure.lang.Symbol)Symbol.intern(null, "java.math.MathContext.");
 }
 public core_with_precision() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object precision3, java.lang.Object exprs4) {
  {
   Object __r2918;
   if (clojure.lang.Util.equiv(((java.lang.Object)((IFn)const__1.getRawRoot()).invoke(exprs4)), ((java.lang.Object)const__2))) {
    __r2918 = RT.vector(((IFn)const__3.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(exprs4)), ((IFn)const__4.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(const__7), ((IFn)const__6.getRawRoot()).invoke(const__8), ((IFn)const__6.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(exprs4))))))));
   } else {
    __r2918 = RT.vector(exprs4, null);
   }
   Object vec__47185 = __r2918;
   Object body6 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__47185), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object rm7 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__47185), (int)RT.intCast(1L), ((java.lang.Object)null)));
   return ((IFn)const__4.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(const__13), ((IFn)const__6.getRawRoot()).invoke(((IFn)const__14.getRawRoot()).invoke(const__15.getRawRoot(), ((IFn)const__4.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(const__16), ((IFn)const__6.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(const__17), ((IFn)const__6.getRawRoot()).invoke(precision3), rm7))))))), body6));
  }
 }
 public int getRequiredArity() {
  return 3;
 }
}
