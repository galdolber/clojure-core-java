package clojure.pprint;

import clojure.lang.*;

public class utilities__init {
 public static void load() throws Exception {
  ((IFn)const__0.getRawRoot()).invoke(const__1);
  const__2.setMeta((IPersistentMap)const__11);
  const__2.bindRoot(new clojure.pprint_map_passing_context());
  const__12.setMeta((IPersistentMap)const__15);
  const__12.bindRoot(new clojure.pprint_consume());
  const__16.setMeta((IPersistentMap)const__19);
  const__16.bindRoot(new clojure.pprint_consume_while());
  const__20.setMeta((IPersistentMap)const__23);
  const__20.bindRoot(new clojure.pprint_unzip_map());
  const__24.setMeta((IPersistentMap)const__27);
  const__24.bindRoot(new clojure.pprint_tuple_map());
  const__28.setMeta((IPersistentMap)const__31);
  const__28.bindRoot(new clojure.pprint_rtrim());
  const__32.setMeta((IPersistentMap)const__35);
  const__32.bindRoot(new clojure.pprint_ltrim());
  const__36.setMeta((IPersistentMap)const__39);
  const__36.bindRoot(new clojure.pprint_prefix_count());
  const__40.setMeta((IPersistentMap)const__43);
  const__40.bindRoot(new clojure.pprint_prerr());
  const__44.setMeta((IPersistentMap)const__47);
  const__44.bindRoot(new clojure.pprint_prlabel());
  ((clojure.lang.Var)const__44).setMacro();
  ((IFn)new clojure.pprint_fn__7386()).invoke();
 }
 private static clojure.lang.Var const__0;
 private static clojure.lang.Symbol const__1;
 private static clojure.lang.Var const__2;
 private static clojure.lang.Keyword const__3;
 private static clojure.lang.Keyword const__4;
 private static java.lang.Integer const__5;
 private static clojure.lang.Keyword const__6;
 private static java.lang.Integer const__7;
 private static clojure.lang.Keyword const__8;
 private static clojure.lang.IPersistentList const__9;
 private static clojure.lang.Keyword const__10;
 private static clojure.lang.IPersistentMap const__11;
 private static clojure.lang.Var const__12;
 private static java.lang.Integer const__13;
 private static clojure.lang.IPersistentList const__14;
 private static clojure.lang.IPersistentMap const__15;
 private static clojure.lang.Var const__16;
 private static java.lang.Integer const__17;
 private static clojure.lang.IPersistentList const__18;
 private static clojure.lang.IPersistentMap const__19;
 private static clojure.lang.Var const__20;
 private static java.lang.Integer const__21;
 private static clojure.lang.IPersistentList const__22;
 private static clojure.lang.IPersistentMap const__23;
 private static clojure.lang.Var const__24;
 private static java.lang.Integer const__25;
 private static clojure.lang.IPersistentList const__26;
 private static clojure.lang.IPersistentMap const__27;
 private static clojure.lang.Var const__28;
 private static java.lang.Integer const__29;
 private static clojure.lang.IPersistentList const__30;
 private static clojure.lang.IPersistentMap const__31;
 private static clojure.lang.Var const__32;
 private static java.lang.Integer const__33;
 private static clojure.lang.IPersistentList const__34;
 private static clojure.lang.IPersistentMap const__35;
 private static clojure.lang.Var const__36;
 private static java.lang.Integer const__37;
 private static clojure.lang.IPersistentList const__38;
 private static clojure.lang.IPersistentMap const__39;
 private static clojure.lang.Var const__40;
 private static java.lang.Integer const__41;
 private static clojure.lang.IPersistentList const__42;
 private static clojure.lang.IPersistentMap const__43;
 private static clojure.lang.Var const__44;
 private static java.lang.Integer const__45;
 private static clojure.lang.IPersistentList const__46;
 private static clojure.lang.IPersistentMap const__47;
 static void __init0() {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "in-ns");
  const__1 = (clojure.lang.Symbol)Symbol.intern(null, "clojure.pprint");
  const__2 = (clojure.lang.Var)RT.var("clojure.pprint", "map-passing-context");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "file");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "column");
  const__5 = (java.lang.Integer)1;
  const__6 = (clojure.lang.Keyword)Keyword.intern(null, "line");
  const__7 = (java.lang.Integer)26;
  const__8 = (clojure.lang.Keyword)Keyword.intern(null, "arglists");
  const__9 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "func"), Symbol.intern(null, "initial-context"), Symbol.intern(null, "lis"))));
  const__10 = (clojure.lang.Keyword)Keyword.intern(null, "private");
  const__11 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "func"), Symbol.intern(null, "initial-context"), Symbol.intern(null, "lis")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "private"), Boolean.TRUE, Keyword.intern(null, "line"), 26, Keyword.intern(null, "file"), "clojure/pprint/utilities.clj");
  const__12 = (clojure.lang.Var)RT.var("clojure.pprint", "consume");
  const__13 = (java.lang.Integer)37;
  const__14 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "func"), Symbol.intern(null, "initial-context"))));
  const__15 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "func"), Symbol.intern(null, "initial-context")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "private"), Boolean.TRUE, Keyword.intern(null, "line"), 37, Keyword.intern(null, "file"), "clojure/pprint/utilities.clj");
  const__16 = (clojure.lang.Var)RT.var("clojure.pprint", "consume-while");
  const__17 = (java.lang.Integer)45;
  const__18 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "func"), Symbol.intern(null, "initial-context"))));
  const__19 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "func"), Symbol.intern(null, "initial-context")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "private"), Boolean.TRUE, Keyword.intern(null, "line"), 45, Keyword.intern(null, "file"), "clojure/pprint/utilities.clj");
  const__20 = (clojure.lang.Var)RT.var("clojure.pprint", "unzip-map");
  const__21 = (java.lang.Integer)53;
  const__22 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "m"))));
  const__23 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "m")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "private"), Boolean.TRUE, Keyword.intern(null, "line"), 53, Keyword.intern(null, "file"), "clojure/pprint/utilities.clj");
  const__24 = (clojure.lang.Var)RT.var("clojure.pprint", "tuple-map");
  const__25 = (java.lang.Integer)60;
  const__26 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "m"), Symbol.intern(null, "v1"))));
  const__27 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "m"), Symbol.intern(null, "v1")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "private"), Boolean.TRUE, Keyword.intern(null, "line"), 60, Keyword.intern(null, "file"), "clojure/pprint/utilities.clj");
  const__28 = (clojure.lang.Var)RT.var("clojure.pprint", "rtrim");
  const__29 = (java.lang.Integer)64;
  const__30 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "s"), Symbol.intern(null, "c"))));
  const__31 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "s"), Symbol.intern(null, "c")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "private"), Boolean.TRUE, Keyword.intern(null, "line"), 64, Keyword.intern(null, "file"), "clojure/pprint/utilities.clj");
  const__32 = (clojure.lang.Var)RT.var("clojure.pprint", "ltrim");
  const__33 = (java.lang.Integer)75;
  const__34 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "s"), Symbol.intern(null, "c"))));
  const__35 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "s"), Symbol.intern(null, "c")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "private"), Boolean.TRUE, Keyword.intern(null, "line"), 75, Keyword.intern(null, "file"), "clojure/pprint/utilities.clj");
  const__36 = (clojure.lang.Var)RT.var("clojure.pprint", "prefix-count");
  const__37 = (java.lang.Integer)85;
  const__38 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "aseq"), Symbol.intern(null, "val"))));
  const__39 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "aseq"), Symbol.intern(null, "val")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "private"), Boolean.TRUE, Keyword.intern(null, "line"), 85, Keyword.intern(null, "file"), "clojure/pprint/utilities.clj");
  const__40 = (clojure.lang.Var)RT.var("clojure.pprint", "prerr");
  const__41 = (java.lang.Integer)95;
  const__42 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "&"), Symbol.intern(null, "args"))));
  const__43 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "&"), Symbol.intern(null, "args")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "private"), Boolean.TRUE, Keyword.intern(null, "line"), 95, Keyword.intern(null, "file"), "clojure/pprint/utilities.clj");
  const__44 = (clojure.lang.Var)RT.var("clojure.pprint", "prlabel");
  const__45 = (java.lang.Integer)100;
  const__46 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "prefix"), Symbol.intern(null, "arg"), Symbol.intern(null, "&"), Symbol.intern(null, "more-args"))));
  const__47 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "prefix"), Symbol.intern(null, "arg"), Symbol.intern(null, "&"), Symbol.intern(null, "more-args")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "private"), Boolean.TRUE, Keyword.intern(null, "line"), 100, Keyword.intern(null, "file"), "clojure/pprint/utilities.clj");
 }
 static {
  __init0();
  clojure.lang.Compiler.pushNSandLoader(clojure.pprint.utilities__init.class.getClassLoader());
  try {
   load();
  } catch (Exception ___x) {
  throw new RuntimeException(___x);
  } finally {
   Var.popThreadBindings();
  }
 }
}
