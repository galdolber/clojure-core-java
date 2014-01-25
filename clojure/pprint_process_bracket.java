package clojure;

import clojure.lang.*;

public final class pprint_process_bracket extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Keyword const__3;
 public static final clojure.lang.Var const__4;
 public static final java.lang.Object const__5;
 public static final java.lang.Object const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Keyword const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Keyword const__11;
 public static final clojure.lang.Var const__12;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "collect-clauses");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "bracket-info");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "def");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "offset");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__5 = (java.lang.Object)0L;
  const__6 = (java.lang.Object)1L;
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "struct");
  const__8 = (clojure.lang.Var)RT.var("clojure.pprint", "compiled-directive");
  const__9 = (clojure.lang.Keyword)Keyword.intern(null, "func");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "merge");
  const__11 = (clojure.lang.Keyword)Keyword.intern(null, "params");
  const__12 = (clojure.lang.Var)RT.var("clojure.pprint", "tuple-map");
 }
 public pprint_process_bracket() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object this1, java.lang.Object remainder2) {
  {
   Object vec__81753 = ((IFn)const__0.getRawRoot()).invoke(RT.get(RT.get(this1, Keyword.intern(null, "def")), Keyword.intern(null, "bracket-info")), RT.get(this1, Keyword.intern(null, "offset")), remainder2);
   Object subex4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__81753), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object remainder5 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__81753), (int)RT.intCast(1L), ((java.lang.Object)null)));
   return RT.vector(((IFn)const__7.getRawRoot()).invoke(const__8.getRawRoot(), RT.get(this1, Keyword.intern(null, "func")), RT.get(this1, Keyword.intern(null, "def")), ((IFn)const__10.getRawRoot()).invoke(RT.get(this1, Keyword.intern(null, "params")), ((IFn)const__12.getRawRoot()).invoke(subex4, RT.get(this1, Keyword.intern(null, "offset")))), RT.get(this1, Keyword.intern(null, "offset"))), remainder5);
  }
 }
}
