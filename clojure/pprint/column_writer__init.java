package clojure.pprint;

import clojure.lang.*;

public class column_writer__init {
 public static void load() throws Exception {
  ((IFn)const__0.getRawRoot()).invoke(const__1);
  ((Namespace)RT.CURRENT_NS.deref()).importClass(clojure.lang.IDeref.class);
  ((Namespace)RT.CURRENT_NS.deref()).importClass(java.io.Writer.class);
  const__2.setDynamic(true);
  const__2.setMeta((IPersistentMap)const__10);
  const__2.bindRoot(const__11);
  const__12.setMeta((IPersistentMap)const__16);
  const__12.bindRoot(new clojure.pprint_get_field());
  const__17.setMeta((IPersistentMap)const__20);
  const__17.bindRoot(new clojure.pprint_set_field());
  const__21.setMeta((IPersistentMap)const__24);
  const__21.bindRoot(new clojure.pprint_get_column());
  const__25.setMeta((IPersistentMap)const__28);
  const__25.bindRoot(new clojure.pprint_get_line());
  const__29.setMeta((IPersistentMap)const__32);
  const__29.bindRoot(new clojure.pprint_get_max_column());
  const__33.setMeta((IPersistentMap)const__36);
  const__33.bindRoot(new clojure.pprint_set_max_column());
  const__37.setMeta((IPersistentMap)const__40);
  const__37.bindRoot(new clojure.pprint_get_writer());
  const__41.setMeta((IPersistentMap)const__44);
  const__41.bindRoot(new clojure.pprint_c_write_char());
  const__45.setMeta((IPersistentMap)const__48);
  const__45.bindRoot(new clojure.pprint_column_writer());
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
 private static clojure.lang.Keyword const__9;
 private static clojure.lang.IPersistentMap const__10;
 private static java.lang.Long const__11;
 private static clojure.lang.Var const__12;
 private static java.lang.Integer const__13;
 private static clojure.lang.Keyword const__14;
 private static clojure.lang.IPersistentList const__15;
 private static clojure.lang.IPersistentMap const__16;
 private static clojure.lang.Var const__17;
 private static java.lang.Integer const__18;
 private static clojure.lang.IPersistentList const__19;
 private static clojure.lang.IPersistentMap const__20;
 private static clojure.lang.Var const__21;
 private static java.lang.Integer const__22;
 private static clojure.lang.IPersistentList const__23;
 private static clojure.lang.IPersistentMap const__24;
 private static clojure.lang.Var const__25;
 private static java.lang.Integer const__26;
 private static clojure.lang.IPersistentList const__27;
 private static clojure.lang.IPersistentMap const__28;
 private static clojure.lang.Var const__29;
 private static java.lang.Integer const__30;
 private static clojure.lang.IPersistentList const__31;
 private static clojure.lang.IPersistentMap const__32;
 private static clojure.lang.Var const__33;
 private static java.lang.Integer const__34;
 private static clojure.lang.IPersistentList const__35;
 private static clojure.lang.IPersistentMap const__36;
 private static clojure.lang.Var const__37;
 private static java.lang.Integer const__38;
 private static clojure.lang.IPersistentList const__39;
 private static clojure.lang.IPersistentMap const__40;
 private static clojure.lang.Var const__41;
 private static java.lang.Integer const__42;
 private static clojure.lang.IPersistentList const__43;
 private static clojure.lang.IPersistentMap const__44;
 private static clojure.lang.Var const__45;
 private static java.lang.Integer const__46;
 private static clojure.lang.IPersistentList const__47;
 private static clojure.lang.IPersistentMap const__48;
 static void __init0() {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "in-ns");
  const__1 = (clojure.lang.Symbol)Symbol.intern(null, "clojure.pprint");
  const__2 = (clojure.lang.Var)RT.var("clojure.pprint", "*default-page-width*");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "file");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "column");
  const__5 = (java.lang.Integer)1;
  const__6 = (clojure.lang.Keyword)Keyword.intern(null, "line");
  const__7 = (java.lang.Integer)23;
  const__8 = (clojure.lang.Keyword)Keyword.intern(null, "dynamic");
  const__9 = (clojure.lang.Keyword)Keyword.intern(null, "private");
  const__10 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "dynamic"), Boolean.TRUE, Keyword.intern(null, "column"), 1, Keyword.intern(null, "private"), Boolean.TRUE, Keyword.intern(null, "line"), 23, Keyword.intern(null, "file"), "clojure/pprint/column_writer.clj");
  const__11 = (java.lang.Long)72L;
  const__12 = (clojure.lang.Var)RT.var("clojure.pprint", "get-field");
  const__13 = (java.lang.Integer)25;
  const__14 = (clojure.lang.Keyword)Keyword.intern(null, "arglists");
  const__15 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(((clojure.lang.IObj)Symbol.intern(null, "this")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "tag"), Symbol.intern(null, "Writer"))), Symbol.intern(null, "sym"))));
  const__16 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(((clojure.lang.IObj)Symbol.intern(null, "this")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "tag"), Symbol.intern(null, "Writer"))), Symbol.intern(null, "sym")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "private"), Boolean.TRUE, Keyword.intern(null, "line"), 25, Keyword.intern(null, "file"), "clojure/pprint/column_writer.clj");
  const__17 = (clojure.lang.Var)RT.var("clojure.pprint", "set-field");
  const__18 = (java.lang.Integer)28;
  const__19 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(((clojure.lang.IObj)Symbol.intern(null, "this")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "tag"), Symbol.intern(null, "Writer"))), Symbol.intern(null, "sym"), Symbol.intern(null, "new-val"))));
  const__20 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(((clojure.lang.IObj)Symbol.intern(null, "this")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "tag"), Symbol.intern(null, "Writer"))), Symbol.intern(null, "sym"), Symbol.intern(null, "new-val")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "private"), Boolean.TRUE, Keyword.intern(null, "line"), 28, Keyword.intern(null, "file"), "clojure/pprint/column_writer.clj");
  const__21 = (clojure.lang.Var)RT.var("clojure.pprint", "get-column");
  const__22 = (java.lang.Integer)31;
  const__23 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "this"))));
  const__24 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "this")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "private"), Boolean.TRUE, Keyword.intern(null, "line"), 31, Keyword.intern(null, "file"), "clojure/pprint/column_writer.clj");
  const__25 = (clojure.lang.Var)RT.var("clojure.pprint", "get-line");
  const__26 = (java.lang.Integer)34;
  const__27 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "this"))));
  const__28 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "this")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "private"), Boolean.TRUE, Keyword.intern(null, "line"), 34, Keyword.intern(null, "file"), "clojure/pprint/column_writer.clj");
  const__29 = (clojure.lang.Var)RT.var("clojure.pprint", "get-max-column");
  const__30 = (java.lang.Integer)37;
  const__31 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "this"))));
  const__32 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "this")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "private"), Boolean.TRUE, Keyword.intern(null, "line"), 37, Keyword.intern(null, "file"), "clojure/pprint/column_writer.clj");
  const__33 = (clojure.lang.Var)RT.var("clojure.pprint", "set-max-column");
  const__34 = (java.lang.Integer)40;
  const__35 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "this"), Symbol.intern(null, "new-max"))));
  const__36 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "this"), Symbol.intern(null, "new-max")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "private"), Boolean.TRUE, Keyword.intern(null, "line"), 40, Keyword.intern(null, "file"), "clojure/pprint/column_writer.clj");
  const__37 = (clojure.lang.Var)RT.var("clojure.pprint", "get-writer");
  const__38 = (java.lang.Integer)44;
  const__39 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "this"))));
  const__40 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "this")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "private"), Boolean.TRUE, Keyword.intern(null, "line"), 44, Keyword.intern(null, "file"), "clojure/pprint/column_writer.clj");
  const__41 = (clojure.lang.Var)RT.var("clojure.pprint", "c-write-char");
  const__42 = (java.lang.Integer)47;
  const__43 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(((clojure.lang.IObj)Symbol.intern(null, "this")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "tag"), Symbol.intern(null, "Writer"))), ((clojure.lang.IObj)Symbol.intern(null, "c")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "tag"), Symbol.intern(null, "Integer"))))));
  const__44 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(((clojure.lang.IObj)Symbol.intern(null, "this")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "tag"), Symbol.intern(null, "Writer"))), ((clojure.lang.IObj)Symbol.intern(null, "c")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "tag"), Symbol.intern(null, "Integer")))))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "private"), Boolean.TRUE, Keyword.intern(null, "line"), 47, Keyword.intern(null, "file"), "clojure/pprint/column_writer.clj");
  const__45 = (clojure.lang.Var)RT.var("clojure.pprint", "column-writer");
  const__46 = (java.lang.Integer)55;
  const__47 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "writer")), RT.vector(Symbol.intern(null, "writer"), Symbol.intern(null, "max-columns"))));
  const__48 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "writer")), RT.vector(Symbol.intern(null, "writer"), Symbol.intern(null, "max-columns")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "private"), Boolean.TRUE, Keyword.intern(null, "line"), 55, Keyword.intern(null, "file"), "clojure/pprint/column_writer.clj");
 }
 static {
  __init0();
  clojure.lang.Compiler.pushNSandLoader(clojure.pprint.column_writer__init.class.getClassLoader());
  try {
   load();
  } catch (Exception ___x) {
  throw new RuntimeException(___x);
  } finally {
   Var.popThreadBindings();
  }
 }
}
