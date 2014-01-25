package clojure;

import clojure.lang.*;

public final class core_assert extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Symbol const__4;
 public static final clojure.lang.Symbol const__5;
 public static final clojure.lang.Symbol const__6;
 public static final clojure.lang.Symbol const__7;
 public static final clojure.lang.Symbol const__8;
 public static final clojure.lang.Symbol const__9;
 public static final clojure.lang.Symbol const__10;
 public static final clojure.lang.Symbol const__11;
 public static final clojure.lang.Symbol const__12;
 public static final clojure.lang.Symbol const__13;
 public static final clojure.lang.Symbol const__14;
 public static final clojure.lang.Symbol const__15;
 public static final clojure.lang.Symbol const__16;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "*assert*");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__4 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "when-not");
  const__5 = (clojure.lang.Symbol)Symbol.intern(null, "throw");
  const__6 = (clojure.lang.Symbol)Symbol.intern(null, "new");
  const__7 = (clojure.lang.Symbol)Symbol.intern(null, "java.lang.AssertionError");
  const__8 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "str");
  const__9 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "pr-str");
  const__10 = (clojure.lang.Symbol)Symbol.intern(null, "quote");
  const__11 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "when-not");
  const__12 = (clojure.lang.Symbol)Symbol.intern(null, "throw");
  const__13 = (clojure.lang.Symbol)Symbol.intern(null, "new");
  const__14 = (clojure.lang.Symbol)Symbol.intern(null, "java.lang.AssertionError");
  const__15 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "str");
  const__16 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "pr-str");
 }
 public core_assert() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object x3, java.lang.Object message4) {
  Object __r2893 = const__0.get();
  if (__r2893 != null && !(__r2893 == Boolean.FALSE)) {
   return ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__11), ((IFn)const__3.getRawRoot()).invoke(x3), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__12), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__13), ((IFn)const__3.getRawRoot()).invoke(const__14), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__15), ((IFn)const__3.getRawRoot()).invoke("Assert failed: "), ((IFn)const__3.getRawRoot()).invoke(message4), ((IFn)const__3.getRawRoot()).invoke("\n"), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__16), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__10), ((IFn)const__3.getRawRoot()).invoke(x3))))))))))))))))));
  } else {
   return null;
  }
 }
 public java.lang.Object invoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object x3) {
  Object __r2895 = const__0.get();
  if (__r2895 != null && !(__r2895 == Boolean.FALSE)) {
   return ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__4), ((IFn)const__3.getRawRoot()).invoke(x3), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__5), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__6), ((IFn)const__3.getRawRoot()).invoke(const__7), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__8), ((IFn)const__3.getRawRoot()).invoke("Assert failed: "), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__9), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__10), ((IFn)const__3.getRawRoot()).invoke(x3))))))))))))))))));
  } else {
   return null;
  }
 }
}
