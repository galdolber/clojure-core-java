package clojure;

import clojure.lang.*;

public final class pprint_process_directive_table_element extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final java.lang.Object const__2;
 public static final java.lang.Object const__3;
 public static final java.lang.Object const__4;
 public static final clojure.lang.Var const__5;
 public static final java.lang.Object const__6;
 public static final clojure.lang.Keyword const__7;
 public static final clojure.lang.Keyword const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Symbol const__12;
 public static final clojure.lang.Keyword const__13;
 public static final clojure.lang.Keyword const__14;
 public static final clojure.lang.Keyword const__15;
 public static final clojure.lang.IPersistentStack const__16;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (java.lang.Object)1L;
  const__3 = (java.lang.Object)2L;
  const__4 = (java.lang.Object)3L;
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "nthnext");
  const__6 = (java.lang.Object)4L;
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "directive");
  const__8 = (clojure.lang.Keyword)Keyword.intern(null, "params");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__12 = (clojure.lang.Symbol)Symbol.intern("clojure.core", "array-map");
  const__13 = (clojure.lang.Keyword)Keyword.intern(null, "flags");
  const__14 = (clojure.lang.Keyword)Keyword.intern(null, "bracket-info");
  const__15 = (clojure.lang.Keyword)Keyword.intern(null, "generator-fn");
  const__16 = (clojure.lang.IPersistentStack)((clojure.lang.IObj)PersistentList.create(java.util.Arrays.asList(Symbol.intern(null, "fn"), RT.vector(Symbol.intern(null, "params"), Symbol.intern(null, "offset"))))).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "line"), 1326, Keyword.intern(null, "column"), 28));
 }
 public pprint_process_directive_table_element() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p__79281) {
  {
   Object vec__79292 = p__79281;
   Object char3 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__79292), (int)RT.intCast(0L), ((java.lang.Object)null)));
   Object params4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__79292), (int)RT.intCast(1L), ((java.lang.Object)null)));
   Object flags5 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__79292), (int)RT.intCast(2L), ((java.lang.Object)null)));
   Object bracket_info6 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__79292), (int)RT.intCast(3L), ((java.lang.Object)null)));
   Object generator_fn7 = ((IFn)const__5.getRawRoot()).invoke(vec__79292, const__6);
   return RT.vector(char3, RT.mapUniqueKeys(const__7, char3, const__8, ((IFn)const__9.getRawRoot()).invoke(((IFn)const__10.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(const__12), params4)), const__13, flags5, const__14, bracket_info6, const__15, ((IFn)const__10.getRawRoot()).invoke(const__16, generator_fn7)));
  }
 }
}
