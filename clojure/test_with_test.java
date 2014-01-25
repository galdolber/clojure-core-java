package clojure;

import clojure.lang.*;

public final class test_with_test extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Symbol const__4;
 public static final clojure.lang.Symbol const__5;
 public static final clojure.lang.Symbol const__6;
 public static final clojure.lang.Keyword const__7;
 public static final clojure.lang.Symbol const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.test", "*load-tests*");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__4 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "doto");
  const__5 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "alter-meta!");
  const__6 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "assoc");
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "test");
  const__8 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "fn");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "vector");
 }
 public test_with_test() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object definition3, java.lang.Object body4) {
  Object __r4720 = const__0.get();
  if (__r4720 != null && !(__r4720 == Boolean.FALSE)) {
   return ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__4), ((IFn)const__3.getRawRoot()).invoke(definition3), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__5), ((IFn)const__3.getRawRoot()).invoke(const__6), ((IFn)const__3.getRawRoot()).invoke(const__7), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__8), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(const__10.getRawRoot(), ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke()))), body4))))))));
  } else {
   return definition3;
  }
 }
 public int getRequiredArity() {
  return 3;
 }
}
