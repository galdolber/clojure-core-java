package clojure;

import clojure.lang.*;

public final class test_fn__7155 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final java.lang.Object const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Symbol const__8;
 public static final clojure.lang.Symbol const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Keyword const__12;
 public static final clojure.lang.Keyword const__13;
 public static final clojure.lang.Keyword const__14;
 public static final clojure.lang.Keyword const__15;
 public static final clojure.lang.Symbol const__16;
 public static final clojure.lang.Keyword const__17;
 public static final clojure.lang.Symbol const__18;
 public static final clojure.lang.Symbol const__19;
 public static final clojure.lang.Symbol const__20;
 public static final clojure.lang.Var const__21;
 public static final clojure.lang.Symbol const__22;
 public static final clojure.lang.Symbol const__23;
 public static final clojure.lang.Symbol const__24;
 public static final clojure.lang.Symbol const__25;
 public static final clojure.lang.Symbol const__26;
 public static final clojure.lang.Keyword const__27;
 public static final clojure.lang.Symbol const__28;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)1L;
  const__2 = (java.lang.Object)2L;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "nthnext");
  const__4 = (java.lang.Object)3L;
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__8 = (clojure.lang.Symbol)Symbol.intern(null, "try");
  const__9 = (clojure.lang.Symbol)Symbol.intern("clojure.test", "do-report");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__12 = (clojure.lang.Keyword)Keyword.intern(null, "type");
  const__13 = (clojure.lang.Keyword)Keyword.intern(null, "fail");
  const__14 = (clojure.lang.Keyword)Keyword.intern(null, "message");
  const__15 = (clojure.lang.Keyword)Keyword.intern(null, "expected");
  const__16 = (clojure.lang.Symbol)Symbol.intern(null, "quote");
  const__17 = (clojure.lang.Keyword)Keyword.intern(null, "actual");
  const__18 = (clojure.lang.Symbol)Symbol.intern(null, "catch");
  const__19 = (clojure.lang.Symbol)Symbol.intern(null, "e__7153__auto__");
  const__20 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "let");
  const__21 = (clojure.lang.Var)RT.var("clojure.core", "vector");
  const__22 = (clojure.lang.Symbol)Symbol.intern(null, "m__7154__auto__");
  const__23 = (clojure.lang.Symbol)Symbol.intern(null, ".getMessage");
  const__24 = (clojure.lang.Symbol)Symbol.intern(null, "if");
  const__25 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "re-find");
  const__26 = (clojure.lang.Symbol)Symbol.intern("clojure.test", "do-report");
  const__27 = (clojure.lang.Keyword)Keyword.intern(null, "pass");
  const__28 = (clojure.lang.Symbol)Symbol.intern("clojure.test", "do-report");
 }
 public test_fn__7155() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object msg1, java.lang.Object form2) {
  {
   Object klass3 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)form2), (int)RT.intCast(1L)));
   Object re4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)form2), (int)RT.intCast(2L)));
   Object body5 = ((IFn)const__3.getRawRoot()).invoke(form2, const__4);
   return ((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(const__8), body5, ((IFn)const__7.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(const__9), ((IFn)const__7.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__11.getRawRoot(), ((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(const__12), ((IFn)const__7.getRawRoot()).invoke(const__13), ((IFn)const__7.getRawRoot()).invoke(const__14), ((IFn)const__7.getRawRoot()).invoke(msg1), ((IFn)const__7.getRawRoot()).invoke(const__15), ((IFn)const__7.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(const__16), ((IFn)const__7.getRawRoot()).invoke(form2)))), ((IFn)const__7.getRawRoot()).invoke(const__17), ((IFn)const__7.getRawRoot()).invoke(null)))))))), ((IFn)const__7.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(const__18), ((IFn)const__7.getRawRoot()).invoke(klass3), ((IFn)const__7.getRawRoot()).invoke(const__19), ((IFn)const__7.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(const__20), ((IFn)const__7.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__21.getRawRoot(), ((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(const__22), ((IFn)const__7.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(const__23), ((IFn)const__7.getRawRoot()).invoke(const__19)))))))), ((IFn)const__7.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(const__24), ((IFn)const__7.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(const__25), ((IFn)const__7.getRawRoot()).invoke(re4), ((IFn)const__7.getRawRoot()).invoke(const__22)))), ((IFn)const__7.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(const__26), ((IFn)const__7.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__11.getRawRoot(), ((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(const__12), ((IFn)const__7.getRawRoot()).invoke(const__27), ((IFn)const__7.getRawRoot()).invoke(const__14), ((IFn)const__7.getRawRoot()).invoke(msg1), ((IFn)const__7.getRawRoot()).invoke(const__15), ((IFn)const__7.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(const__16), ((IFn)const__7.getRawRoot()).invoke(form2)))), ((IFn)const__7.getRawRoot()).invoke(const__17), ((IFn)const__7.getRawRoot()).invoke(const__19)))))))), ((IFn)const__7.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(const__28), ((IFn)const__7.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__11.getRawRoot(), ((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(const__12), ((IFn)const__7.getRawRoot()).invoke(const__13), ((IFn)const__7.getRawRoot()).invoke(const__14), ((IFn)const__7.getRawRoot()).invoke(msg1), ((IFn)const__7.getRawRoot()).invoke(const__15), ((IFn)const__7.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(const__16), ((IFn)const__7.getRawRoot()).invoke(form2)))), ((IFn)const__7.getRawRoot()).invoke(const__17), ((IFn)const__7.getRawRoot()).invoke(const__19)))))))))))))), ((IFn)const__7.getRawRoot()).invoke(const__19))))));
  }
 }
}
