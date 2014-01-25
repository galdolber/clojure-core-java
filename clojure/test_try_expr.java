package clojure;

import clojure.lang.*;

public final class test_try_expr extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Symbol const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Symbol const__5;
 public static final clojure.lang.Symbol const__6;
 public static final clojure.lang.Symbol const__7;
 public static final clojure.lang.Symbol const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Keyword const__11;
 public static final clojure.lang.Keyword const__12;
 public static final clojure.lang.Keyword const__13;
 public static final clojure.lang.Keyword const__14;
 public static final clojure.lang.Symbol const__15;
 public static final clojure.lang.Keyword const__16;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__3 = (clojure.lang.Symbol)Symbol.intern(null, "try");
  const__4 = (clojure.lang.Var)RT.var("clojure.test", "assert-expr");
  const__5 = (clojure.lang.Symbol)Symbol.intern(null, "catch");
  const__6 = (clojure.lang.Symbol)Symbol.intern(null, "java.lang.Throwable");
  const__7 = (clojure.lang.Symbol)Symbol.intern(null, "t__7157__auto__");
  const__8 = (clojure.lang.Symbol)Symbol.intern("clojure.test", "do-report");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__11 = (clojure.lang.Keyword)Keyword.intern(null, "type");
  const__12 = (clojure.lang.Keyword)Keyword.intern(null, "error");
  const__13 = (clojure.lang.Keyword)Keyword.intern(null, "message");
  const__14 = (clojure.lang.Keyword)Keyword.intern(null, "expected");
  const__15 = (clojure.lang.Symbol)Symbol.intern(null, "quote");
  const__16 = (clojure.lang.Keyword)Keyword.intern(null, "actual");
 }
 public test_try_expr() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object msg3, java.lang.Object form4) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__3), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(msg3, form4)), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__5), ((IFn)const__2.getRawRoot()).invoke(const__6), ((IFn)const__2.getRawRoot()).invoke(const__7), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__8), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(const__10.getRawRoot(), ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__11), ((IFn)const__2.getRawRoot()).invoke(const__12), ((IFn)const__2.getRawRoot()).invoke(const__13), ((IFn)const__2.getRawRoot()).invoke(msg3), ((IFn)const__2.getRawRoot()).invoke(const__14), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__15), ((IFn)const__2.getRawRoot()).invoke(form4)))), ((IFn)const__2.getRawRoot()).invoke(const__16), ((IFn)const__2.getRawRoot()).invoke(const__7)))))))))))));
 }
}
