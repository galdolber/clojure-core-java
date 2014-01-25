package clojure;

import clojure.lang.*;

public final class core_definline extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final java.lang.Object const__5;
 public static final java.lang.Object const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Symbol const__10;
 public static final clojure.lang.Symbol const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Symbol const__14;
 public static final clojure.lang.Symbol const__15;
 public static final clojure.lang.Symbol const__16;
 public static final clojure.lang.Symbol const__17;
 public static final clojure.lang.Keyword const__18;
 public static final clojure.lang.Symbol const__19;
 public static final clojure.lang.Symbol const__20;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "split-with");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "comp");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "vector?");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__5 = (java.lang.Object)0L;
  const__6 = (java.lang.Object)1L;
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__10 = (clojure.lang.Symbol)Symbol.intern(null, "do");
  const__11 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "defn");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "eval");
  const__14 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "fn");
  const__15 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "alter-meta!");
  const__16 = (clojure.lang.Symbol)Symbol.intern(null, "var");
  const__17 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "assoc");
  const__18 = (clojure.lang.Keyword)Keyword.intern(null, "inline");
  const__19 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "fn");
  const__20 = (clojure.lang.Symbol)Symbol.intern(null, "var");
 }
 public core_definline() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object name3, java.lang.Object decl4) {
  {
   Object vec__47395 = ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(const__2.getRawRoot(), const__3.getRawRoot()), decl4);
   Object pre_args6 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__47395), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object vec__47407 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__47395), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object args8 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__47407), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object expr9 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__47407), (int)RT.intCast(1L), ((java.lang.Object)null)));
   return ((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(const__10), ((IFn)const__9.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(const__11), ((IFn)const__9.getRawRoot()).invoke(name3), pre_args6, ((IFn)const__9.getRawRoot()).invoke(args8), ((IFn)const__9.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(const__14, args8, expr9)), args8))))), ((IFn)const__9.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(const__15), ((IFn)const__9.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(const__16), ((IFn)const__9.getRawRoot()).invoke(name3)))), ((IFn)const__9.getRawRoot()).invoke(const__17), ((IFn)const__9.getRawRoot()).invoke(const__18), ((IFn)const__9.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(const__19), ((IFn)const__9.getRawRoot()).invoke(name3), ((IFn)const__9.getRawRoot()).invoke(args8), ((IFn)const__9.getRawRoot()).invoke(expr9))))))), ((IFn)const__9.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(const__20), ((IFn)const__9.getRawRoot()).invoke(name3))))));
  }
 }
 public int getRequiredArity() {
  return 3;
 }
}
