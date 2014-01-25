package clojure;

import clojure.lang.*;

public class xml__init {
 public static void load() throws Exception {
  ((IFn)const__0.getRawRoot()).invoke(const__1);
  ((IFn)new clojure.xml_loading__4931__auto__()).invoke();
  if (((clojure.lang.Symbol)const__1).equals(((java.lang.Object)const__2))) {
  } else {
   clojure.lang.LockingTransaction.runInTransaction((java.util.concurrent.Callable)((java.util.concurrent.Callable)new clojure.xml_fn__6923()));
  }
  const__3.setDynamic(true);
  const__3.setMeta((IPersistentMap)const__10);
  const__11.setDynamic(true);
  const__11.setMeta((IPersistentMap)const__13);
  const__14.setDynamic(true);
  const__14.setMeta((IPersistentMap)const__16);
  const__17.setDynamic(true);
  const__17.setMeta((IPersistentMap)const__19);
  const__20.setMeta((IPersistentMap)const__22);
  const__20.bindRoot(((IFn)const__23.getRawRoot()).invoke(const__24, const__25, const__26));
  const__27.setMeta((IPersistentMap)const__29);
  const__27.bindRoot(((IFn)const__30.getRawRoot()).invoke(const__20.getRawRoot(), const__24));
  const__31.setMeta((IPersistentMap)const__33);
  const__31.bindRoot(((IFn)const__30.getRawRoot()).invoke(const__20.getRawRoot(), const__25));
  const__34.setMeta((IPersistentMap)const__36);
  const__34.bindRoot(((IFn)const__30.getRawRoot()).invoke(const__20.getRawRoot(), const__26));
  const__37.setMeta((IPersistentMap)const__39);
  const__37.bindRoot(((IFn)new clojure.xml_fn__6926()).invoke());
  const__40.setMeta((IPersistentMap)const__44);
  const__40.bindRoot(new clojure.xml_startparse_sax());
  const__45.setMeta((IPersistentMap)const__50);
  const__45.bindRoot(new clojure.xml_parse());
  const__51.setMeta((IPersistentMap)const__54);
  const__51.bindRoot(new clojure.xml_emit_element());
  const__55.setMeta((IPersistentMap)const__58);
  const__55.bindRoot(new clojure.xml_emit());
 }
 private static clojure.lang.Var const__0;
 private static clojure.lang.Symbol const__1;
 private static clojure.lang.Symbol const__2;
 private static clojure.lang.Var const__3;
 private static clojure.lang.Keyword const__4;
 private static clojure.lang.Keyword const__5;
 private static java.lang.Integer const__6;
 private static clojure.lang.Keyword const__7;
 private static java.lang.Integer const__8;
 private static clojure.lang.Keyword const__9;
 private static clojure.lang.IPersistentMap const__10;
 private static clojure.lang.Var const__11;
 private static java.lang.Integer const__12;
 private static clojure.lang.IPersistentMap const__13;
 private static clojure.lang.Var const__14;
 private static java.lang.Integer const__15;
 private static clojure.lang.IPersistentMap const__16;
 private static clojure.lang.Var const__17;
 private static java.lang.Integer const__18;
 private static clojure.lang.IPersistentMap const__19;
 private static clojure.lang.Var const__20;
 private static java.lang.Integer const__21;
 private static clojure.lang.IPersistentMap const__22;
 private static clojure.lang.Var const__23;
 private static clojure.lang.Keyword const__24;
 private static clojure.lang.Keyword const__25;
 private static clojure.lang.Keyword const__26;
 private static clojure.lang.Var const__27;
 private static java.lang.Integer const__28;
 private static clojure.lang.IPersistentMap const__29;
 private static clojure.lang.Var const__30;
 private static clojure.lang.Var const__31;
 private static java.lang.Integer const__32;
 private static clojure.lang.IPersistentMap const__33;
 private static clojure.lang.Var const__34;
 private static java.lang.Integer const__35;
 private static clojure.lang.IPersistentMap const__36;
 private static clojure.lang.Var const__37;
 private static java.lang.Integer const__38;
 private static clojure.lang.IPersistentMap const__39;
 private static clojure.lang.Var const__40;
 private static java.lang.Integer const__41;
 private static clojure.lang.Keyword const__42;
 private static clojure.lang.IPersistentList const__43;
 private static clojure.lang.IPersistentMap const__44;
 private static clojure.lang.Var const__45;
 private static java.lang.Integer const__46;
 private static clojure.lang.IPersistentList const__47;
 private static clojure.lang.Keyword const__48;
 private static clojure.lang.Keyword const__49;
 private static clojure.lang.IPersistentMap const__50;
 private static clojure.lang.Var const__51;
 private static java.lang.Integer const__52;
 private static clojure.lang.IPersistentList const__53;
 private static clojure.lang.IPersistentMap const__54;
 private static clojure.lang.Var const__55;
 private static java.lang.Integer const__56;
 private static clojure.lang.IPersistentList const__57;
 private static clojure.lang.IPersistentMap const__58;
 static void __init0() {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "in-ns");
  const__1 = (clojure.lang.Symbol)((clojure.lang.IObj)Symbol.intern(null, "clojure.xml")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "author"), "Rich Hickey", Keyword.intern(null, "doc"), "XML reading/writing."));
  const__2 = (clojure.lang.Symbol)Symbol.intern(null, "clojure.core");
  const__3 = (clojure.lang.Var)RT.var("clojure.xml", "*stack*");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "file");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "column");
  const__6 = (java.lang.Integer)1;
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "line");
  const__8 = (java.lang.Integer)15;
  const__9 = (clojure.lang.Keyword)Keyword.intern(null, "dynamic");
  const__10 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "dynamic"), Boolean.TRUE, Keyword.intern(null, "column"), 1, Keyword.intern(null, "line"), 15, Keyword.intern(null, "file"), "clojure/xml.clj");
  const__11 = (clojure.lang.Var)RT.var("clojure.xml", "*current*");
  const__12 = (java.lang.Integer)16;
  const__13 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "dynamic"), Boolean.TRUE, Keyword.intern(null, "column"), 1, Keyword.intern(null, "line"), 16, Keyword.intern(null, "file"), "clojure/xml.clj");
  const__14 = (clojure.lang.Var)RT.var("clojure.xml", "*state*");
  const__15 = (java.lang.Integer)17;
  const__16 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "dynamic"), Boolean.TRUE, Keyword.intern(null, "column"), 1, Keyword.intern(null, "line"), 17, Keyword.intern(null, "file"), "clojure/xml.clj");
  const__17 = (clojure.lang.Var)RT.var("clojure.xml", "*sb*");
  const__18 = (java.lang.Integer)18;
  const__19 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "dynamic"), Boolean.TRUE, Keyword.intern(null, "column"), 1, Keyword.intern(null, "line"), 18, Keyword.intern(null, "file"), "clojure/xml.clj");
  const__20 = (clojure.lang.Var)RT.var("clojure.xml", "element");
  const__21 = (java.lang.Integer)20;
  const__22 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "column"), 1, Keyword.intern(null, "line"), 20, Keyword.intern(null, "file"), "clojure/xml.clj");
  const__23 = (clojure.lang.Var)RT.var("clojure.core", "create-struct");
  const__24 = (clojure.lang.Keyword)Keyword.intern(null, "tag");
  const__25 = (clojure.lang.Keyword)Keyword.intern(null, "attrs");
  const__26 = (clojure.lang.Keyword)Keyword.intern(null, "content");
  const__27 = (clojure.lang.Var)RT.var("clojure.xml", "tag");
  const__28 = (java.lang.Integer)22;
  const__29 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "column"), 1, Keyword.intern(null, "line"), 22, Keyword.intern(null, "file"), "clojure/xml.clj");
  const__30 = (clojure.lang.Var)RT.var("clojure.core", "accessor");
  const__31 = (clojure.lang.Var)RT.var("clojure.xml", "attrs");
  const__32 = (java.lang.Integer)23;
  const__33 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "column"), 1, Keyword.intern(null, "line"), 23, Keyword.intern(null, "file"), "clojure/xml.clj");
  const__34 = (clojure.lang.Var)RT.var("clojure.xml", "content");
  const__35 = (java.lang.Integer)24;
  const__36 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "column"), 1, Keyword.intern(null, "line"), 24, Keyword.intern(null, "file"), "clojure/xml.clj");
  const__37 = (clojure.lang.Var)RT.var("clojure.xml", "content-handler");
  const__38 = (java.lang.Integer)26;
  const__39 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "column"), 1, Keyword.intern(null, "line"), 26, Keyword.intern(null, "file"), "clojure/xml.clj");
  const__40 = (clojure.lang.Var)RT.var("clojure.xml", "startparse-sax");
  const__41 = (java.lang.Integer)75;
  const__42 = (clojure.lang.Keyword)Keyword.intern(null, "arglists");
  const__43 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "s"), Symbol.intern(null, "ch"))));
  const__44 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "s"), Symbol.intern(null, "ch")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "line"), 75, Keyword.intern(null, "file"), "clojure/xml.clj");
  const__45 = (clojure.lang.Var)RT.var("clojure.xml", "parse");
  const__46 = (java.lang.Integer)79;
  const__47 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "s")), RT.vector(Symbol.intern(null, "s"), Symbol.intern(null, "startparse"))));
  const__48 = (clojure.lang.Keyword)Keyword.intern(null, "added");
  const__49 = (clojure.lang.Keyword)Keyword.intern(null, "doc");
  const__50 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "s")), RT.vector(Symbol.intern(null, "s"), Symbol.intern(null, "startparse")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.0", Keyword.intern(null, "doc"), "Parses and loads the source s, which can be a File, InputStream or\n  String naming a URI. Returns a tree of the xml/element struct-map,\n  which has the keys :tag, :attrs, and :content. and accessor fns tag,\n  attrs, and content. Other parsers can be supplied by passing\n  startparse, a fn taking a source and a ContentHandler and returning\n  a parser", Keyword.intern(null, "line"), 79, Keyword.intern(null, "file"), "clojure/xml.clj");
  const__51 = (clojure.lang.Var)RT.var("clojure.xml", "emit-element");
  const__52 = (java.lang.Integer)96;
  const__53 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "e"))));
  const__54 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "e")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "line"), 96, Keyword.intern(null, "file"), "clojure/xml.clj");
  const__55 = (clojure.lang.Var)RT.var("clojure.xml", "emit");
  const__56 = (java.lang.Integer)112;
  const__57 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "x"))));
  const__58 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "x")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "line"), 112, Keyword.intern(null, "file"), "clojure/xml.clj");
 }
 static {
  __init0();
  clojure.lang.Compiler.pushNSandLoader(clojure.xml__init.class.getClassLoader());
  try {
   load();
  } catch (Exception ___x) {
  throw new RuntimeException(___x);
  } finally {
   Var.popThreadBindings();
  }
 }
}
