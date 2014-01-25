package clojure;

import clojure.lang.*;

public final class test_assert_predicate extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Symbol const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Symbol const__8;
 public static final clojure.lang.Symbol const__9;
 public static final clojure.lang.Symbol const__10;
 public static final clojure.lang.Symbol const__11;
 public static final clojure.lang.Symbol const__12;
 public static final clojure.lang.Symbol const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Keyword const__15;
 public static final clojure.lang.Keyword const__16;
 public static final clojure.lang.Keyword const__17;
 public static final clojure.lang.Keyword const__18;
 public static final clojure.lang.Symbol const__19;
 public static final clojure.lang.Keyword const__20;
 public static final clojure.lang.Symbol const__21;
 public static final clojure.lang.Symbol const__22;
 public static final clojure.lang.Keyword const__23;
 public static final clojure.lang.Symbol const__24;
 public static final clojure.lang.Symbol const__25;
 public static final clojure.lang.Symbol const__26;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "rest");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__5 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "let");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "vector");
  const__8 = (clojure.lang.Symbol)Symbol.intern(null, "values__7129__auto__");
  const__9 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "list");
  const__10 = (clojure.lang.Symbol)Symbol.intern(null, "result__7130__auto__");
  const__11 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "apply");
  const__12 = (clojure.lang.Symbol)Symbol.intern(null, "if");
  const__13 = (clojure.lang.Symbol)Symbol.intern("clojure.test", "do-report");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__15 = (clojure.lang.Keyword)Keyword.intern(null, "type");
  const__16 = (clojure.lang.Keyword)Keyword.intern(null, "pass");
  const__17 = (clojure.lang.Keyword)Keyword.intern(null, "message");
  const__18 = (clojure.lang.Keyword)Keyword.intern(null, "expected");
  const__19 = (clojure.lang.Symbol)Symbol.intern(null, "quote");
  const__20 = (clojure.lang.Keyword)Keyword.intern(null, "actual");
  const__21 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "cons");
  const__22 = (clojure.lang.Symbol)Symbol.intern("clojure.test", "do-report");
  const__23 = (clojure.lang.Keyword)Keyword.intern(null, "fail");
  const__24 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "list");
  const__25 = (clojure.lang.Symbol)Symbol.intern(null, "not");
  const__26 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "cons");
 }
 public test_assert_predicate() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object msg1, java.lang.Object form2) {
  {
   Object args3 = ((IFn)const__0.getRawRoot()).invoke(form2);
   Object pred4 = ((IFn)const__1.getRawRoot()).invoke(form2);
   return ((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(const__5), ((IFn)const__4.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(const__7.getRawRoot(), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(const__8), ((IFn)const__4.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(const__9), args3))), ((IFn)const__4.getRawRoot()).invoke(const__10), ((IFn)const__4.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(const__11), ((IFn)const__4.getRawRoot()).invoke(pred4), ((IFn)const__4.getRawRoot()).invoke(const__8)))))))), ((IFn)const__4.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(const__12), ((IFn)const__4.getRawRoot()).invoke(const__10), ((IFn)const__4.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(const__13), ((IFn)const__4.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(const__14.getRawRoot(), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(const__15), ((IFn)const__4.getRawRoot()).invoke(const__16), ((IFn)const__4.getRawRoot()).invoke(const__17), ((IFn)const__4.getRawRoot()).invoke(msg1), ((IFn)const__4.getRawRoot()).invoke(const__18), ((IFn)const__4.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(const__19), ((IFn)const__4.getRawRoot()).invoke(form2)))), ((IFn)const__4.getRawRoot()).invoke(const__20), ((IFn)const__4.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(const__21), ((IFn)const__4.getRawRoot()).invoke(pred4), ((IFn)const__4.getRawRoot()).invoke(const__8))))))))))), ((IFn)const__4.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(const__22), ((IFn)const__4.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(const__14.getRawRoot(), ((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(const__15), ((IFn)const__4.getRawRoot()).invoke(const__23), ((IFn)const__4.getRawRoot()).invoke(const__17), ((IFn)const__4.getRawRoot()).invoke(msg1), ((IFn)const__4.getRawRoot()).invoke(const__18), ((IFn)const__4.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(const__19), ((IFn)const__4.getRawRoot()).invoke(form2)))), ((IFn)const__4.getRawRoot()).invoke(const__20), ((IFn)const__4.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(const__24), ((IFn)const__4.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(const__19), ((IFn)const__4.getRawRoot()).invoke(const__25)))), ((IFn)const__4.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(const__26), ((IFn)const__4.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(const__19), ((IFn)const__4.getRawRoot()).invoke(pred4)))), ((IFn)const__4.getRawRoot()).invoke(const__8))))))))))))))))), ((IFn)const__4.getRawRoot()).invoke(const__10)));
  }
 }
}
