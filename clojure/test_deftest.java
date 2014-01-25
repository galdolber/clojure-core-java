package clojure;

import clojure.lang.*;

public final class test_deftest extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Symbol const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Keyword const__7;
 public static final clojure.lang.Symbol const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Symbol const__11;
 public static final clojure.lang.Symbol const__12;
 public static final clojure.lang.Symbol const__13;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.test", "*load-tests*");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__4 = (clojure.lang.Symbol)Symbol.intern(null, "def");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "vary-meta");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "test");
  const__8 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "fn");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "vector");
  const__11 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "fn");
  const__12 = (clojure.lang.Symbol)Symbol.intern("clojure.test", "test-var");
  const__13 = (clojure.lang.Symbol)Symbol.intern(null, "var");
 }
 public test_deftest() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object name3, java.lang.Object body4) {
  Object __r4722 = const__0.get();
  if (__r4722 != null && !(__r4722 == Boolean.FALSE)) {
   return ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__4), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(name3, const__6.getRawRoot(), const__7, ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__8), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(const__10.getRawRoot(), ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke()))), body4)))), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__11), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(const__10.getRawRoot(), ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke()))), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__12), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__13), ((IFn)const__3.getRawRoot()).invoke(name3))))))))))));
  } else {
   return null;
  }
 }
 public int getRequiredArity() {
  return 3;
 }
}
