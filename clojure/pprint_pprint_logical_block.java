package clojure;

import clojure.lang.*;

public final class pprint_pprint_logical_block extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Keyword const__3;
 public static final clojure.lang.IPersistentSet const__4;
 public static final clojure.lang.Var const__5;
 public static final java.lang.Object const__6;
 public static final java.lang.Object const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Symbol const__11;
 public static final clojure.lang.Symbol const__12;
 public static final clojure.lang.Symbol const__13;
 public static final clojure.lang.Symbol const__14;
 public static final clojure.lang.Symbol const__15;
 public static final clojure.lang.Var const__16;
 public static final clojure.lang.Symbol const__17;
 public static final clojure.lang.Var const__18;
 public static final clojure.lang.Var const__19;
 public static final clojure.lang.Keyword const__20;
 public static final clojure.lang.Symbol const__21;
 public static final clojure.lang.Symbol const__22;
 public static final clojure.lang.Symbol const__23;
 public static final clojure.lang.Symbol const__24;
 public static final clojure.lang.Symbol const__25;
 public static final clojure.lang.Symbol const__26;
 public static final clojure.lang.Symbol const__27;
 public static final clojure.lang.Symbol const__28;
 public static final clojure.lang.Symbol const__29;
 public static final clojure.lang.Symbol const__30;
 public static final clojure.lang.Symbol const__31;
 public static final clojure.lang.Symbol const__32;
 public static final clojure.lang.Symbol const__33;
 public static final clojure.lang.Symbol const__34;
 public static final clojure.lang.Symbol const__35;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "parse-lb-options");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "prefix");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "per-line-prefix");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "suffix");
  const__4 = (clojure.lang.IPersistentSet)PersistentHashSet.create(Keyword.intern(null, "prefix"), Keyword.intern(null, "per-line-prefix"), Keyword.intern(null, "suffix"));
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__6 = (java.lang.Object)0L;
  const__7 = (java.lang.Object)1L;
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__11 = (clojure.lang.Symbol)Symbol.intern(null, "do");
  const__12 = (clojure.lang.Symbol)Symbol.intern(null, "if");
  const__13 = (clojure.lang.Symbol)Symbol.intern(null, "var");
  const__14 = (clojure.lang.Symbol)Symbol.intern("clojure.pprint", "level-exceeded");
  const__15 = (clojure.lang.Symbol)Symbol.intern(null, ".write");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "with-meta");
  const__17 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "*out*");
  const__18 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__19 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__20 = (clojure.lang.Keyword)Keyword.intern(null, "tag");
  const__21 = (clojure.lang.Symbol)Symbol.intern(null, "java.io.Writer");
  const__22 = (clojure.lang.Symbol)Symbol.intern(null, "do");
  const__23 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "push-thread-bindings");
  const__24 = (clojure.lang.Symbol)Symbol.intern("clojure.pprint", "*current-level*");
  const__25 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "inc");
  const__26 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "var-get");
  const__27 = (clojure.lang.Symbol)Symbol.intern("clojure.pprint", "*current-level*");
  const__28 = (clojure.lang.Symbol)Symbol.intern("clojure.pprint", "*current-length*");
  const__29 = (clojure.lang.Symbol)Symbol.intern(null, "try");
  const__30 = (clojure.lang.Symbol)Symbol.intern("clojure.pprint", "start-block");
  const__31 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "*out*");
  const__32 = (clojure.lang.Symbol)Symbol.intern("clojure.pprint", "end-block");
  const__33 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "*out*");
  const__34 = (clojure.lang.Symbol)Symbol.intern(null, "finally");
  const__35 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "pop-thread-bindings");
 }
 public pprint_pprint_logical_block() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object args3) {
  {
   Object vec__76474 = ((IFn)const__0.getRawRoot()).invoke(const__4, args3);
   Object options5 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__76474), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object body6 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__76474), (int)RT.intCast(1L), ((java.lang.Object)null)));
   return ((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__11), ((IFn)const__10.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__12), ((IFn)const__10.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__13), ((IFn)const__10.getRawRoot()).invoke(const__14))))))), ((IFn)const__10.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__15), ((IFn)const__10.getRawRoot()).invoke(((IFn)const__16.getRawRoot()).invoke(const__17, ((IFn)const__18.getRawRoot()).invoke(const__19.getRawRoot(), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__20), ((IFn)const__10.getRawRoot()).invoke(const__21)))))), ((IFn)const__10.getRawRoot()).invoke("#")))), ((IFn)const__10.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__22), ((IFn)const__10.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__23), ((IFn)const__10.getRawRoot()).invoke(((IFn)const__18.getRawRoot()).invoke(const__19.getRawRoot(), ((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__13), ((IFn)const__10.getRawRoot()).invoke(const__24)))), ((IFn)const__10.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__25), ((IFn)const__10.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__26), ((IFn)const__10.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__13), ((IFn)const__10.getRawRoot()).invoke(const__27)))))))))), ((IFn)const__10.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__13), ((IFn)const__10.getRawRoot()).invoke(const__28)))), ((IFn)const__10.getRawRoot()).invoke(const__6)))))))), ((IFn)const__10.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__29), ((IFn)const__10.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__13), ((IFn)const__10.getRawRoot()).invoke(const__30)))), ((IFn)const__10.getRawRoot()).invoke(const__31), ((IFn)const__10.getRawRoot()).invoke(RT.get(options5, Keyword.intern(null, "prefix"))), ((IFn)const__10.getRawRoot()).invoke(RT.get(options5, Keyword.intern(null, "per-line-prefix"))), ((IFn)const__10.getRawRoot()).invoke(RT.get(options5, Keyword.intern(null, "suffix")))))), body6, ((IFn)const__10.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__13), ((IFn)const__10.getRawRoot()).invoke(const__32)))), ((IFn)const__10.getRawRoot()).invoke(const__33)))), ((IFn)const__10.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__34), ((IFn)const__10.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(const__35)))))))))))))))), ((IFn)const__10.getRawRoot()).invoke(null)));
  }
 }
 public int getRequiredArity() {
  return 2;
 }
}
