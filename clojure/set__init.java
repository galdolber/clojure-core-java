package clojure;

import clojure.lang.*;

public class set__init {
 public static void load() throws Exception {
  ((IFn)const__0.getRawRoot()).invoke(const__1);
  ((IFn)new clojure.set_loading__4931__auto__()).invoke();
  if (((clojure.lang.Symbol)const__1).equals(((java.lang.Object)const__2))) {
  } else {
   clojure.lang.LockingTransaction.runInTransaction((java.util.concurrent.Callable)((java.util.concurrent.Callable)new clojure.set_fn__6851()));
  }
  const__3.setMeta((IPersistentMap)const__12);
  const__3.bindRoot(new clojure.set_bubble_max_key());
  const__13.setMeta((IPersistentMap)const__18);
  const__13.bindRoot(new clojure.set_union());
  const__19.setMeta((IPersistentMap)const__22);
  const__19.bindRoot(new clojure.set_intersection());
  const__23.setMeta((IPersistentMap)const__26);
  const__23.bindRoot(new clojure.set_difference());
  const__27.setMeta((IPersistentMap)const__30);
  const__27.bindRoot(new clojure.set_select());
  const__31.setMeta((IPersistentMap)const__34);
  const__31.bindRoot(new clojure.set_project());
  const__35.setMeta((IPersistentMap)const__38);
  const__35.bindRoot(new clojure.set_rename_keys());
  const__39.setMeta((IPersistentMap)const__42);
  const__39.bindRoot(new clojure.set_rename());
  const__43.setMeta((IPersistentMap)const__46);
  const__43.bindRoot(new clojure.set_index());
  const__47.setMeta((IPersistentMap)const__50);
  const__47.bindRoot(new clojure.set_map_invert());
  const__51.setMeta((IPersistentMap)const__54);
  const__51.bindRoot(new clojure.set_join());
  const__55.setMeta((IPersistentMap)const__60);
  const__55.bindRoot(new clojure.set_subset_QMARK_());
  const__61.setMeta((IPersistentMap)const__64);
  const__61.bindRoot(new clojure.set_superset_QMARK_());
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
 private static clojure.lang.IPersistentList const__10;
 private static clojure.lang.Keyword const__11;
 private static clojure.lang.IPersistentMap const__12;
 private static clojure.lang.Var const__13;
 private static java.lang.Integer const__14;
 private static clojure.lang.IPersistentList const__15;
 private static clojure.lang.Keyword const__16;
 private static clojure.lang.Keyword const__17;
 private static clojure.lang.IPersistentMap const__18;
 private static clojure.lang.Var const__19;
 private static java.lang.Integer const__20;
 private static clojure.lang.IPersistentList const__21;
 private static clojure.lang.IPersistentMap const__22;
 private static clojure.lang.Var const__23;
 private static java.lang.Integer const__24;
 private static clojure.lang.IPersistentList const__25;
 private static clojure.lang.IPersistentMap const__26;
 private static clojure.lang.Var const__27;
 private static java.lang.Integer const__28;
 private static clojure.lang.IPersistentList const__29;
 private static clojure.lang.IPersistentMap const__30;
 private static clojure.lang.Var const__31;
 private static java.lang.Integer const__32;
 private static clojure.lang.IPersistentList const__33;
 private static clojure.lang.IPersistentMap const__34;
 private static clojure.lang.Var const__35;
 private static java.lang.Integer const__36;
 private static clojure.lang.IPersistentList const__37;
 private static clojure.lang.IPersistentMap const__38;
 private static clojure.lang.Var const__39;
 private static java.lang.Integer const__40;
 private static clojure.lang.IPersistentList const__41;
 private static clojure.lang.IPersistentMap const__42;
 private static clojure.lang.Var const__43;
 private static java.lang.Integer const__44;
 private static clojure.lang.IPersistentList const__45;
 private static clojure.lang.IPersistentMap const__46;
 private static clojure.lang.Var const__47;
 private static java.lang.Integer const__48;
 private static clojure.lang.IPersistentList const__49;
 private static clojure.lang.IPersistentMap const__50;
 private static clojure.lang.Var const__51;
 private static java.lang.Integer const__52;
 private static clojure.lang.IPersistentList const__53;
 private static clojure.lang.IPersistentMap const__54;
 private static clojure.lang.Var const__55;
 private static java.lang.Integer const__56;
 private static clojure.lang.IPersistentList const__57;
 private static clojure.lang.Keyword const__58;
 private static java.lang.Class const__59;
 private static clojure.lang.IPersistentMap const__60;
 private static clojure.lang.Var const__61;
 private static java.lang.Integer const__62;
 private static clojure.lang.IPersistentList const__63;
 private static clojure.lang.IPersistentMap const__64;
 static void __init0() {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "in-ns");
  const__1 = (clojure.lang.Symbol)((clojure.lang.IObj)Symbol.intern(null, "clojure.set")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "author"), "Rich Hickey", Keyword.intern(null, "doc"), "Set operations such as union/intersection."));
  const__2 = (clojure.lang.Symbol)Symbol.intern(null, "clojure.core");
  const__3 = (clojure.lang.Var)RT.var("clojure.set", "bubble-max-key");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "file");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "column");
  const__6 = (java.lang.Integer)1;
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "line");
  const__8 = (java.lang.Integer)13;
  const__9 = (clojure.lang.Keyword)Keyword.intern(null, "arglists");
  const__10 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "k"), Symbol.intern(null, "coll"))));
  const__11 = (clojure.lang.Keyword)Keyword.intern(null, "private");
  const__12 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "k"), Symbol.intern(null, "coll")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "private"), Boolean.TRUE, Keyword.intern(null, "line"), 13, Keyword.intern(null, "file"), "clojure/set.clj");
  const__13 = (clojure.lang.Var)RT.var("clojure.set", "union");
  const__14 = (java.lang.Integer)19;
  const__15 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(), RT.vector(Symbol.intern(null, "s1")), RT.vector(Symbol.intern(null, "s1"), Symbol.intern(null, "s2")), RT.vector(Symbol.intern(null, "s1"), Symbol.intern(null, "s2"), Symbol.intern(null, "&"), Symbol.intern(null, "sets"))));
  const__16 = (clojure.lang.Keyword)Keyword.intern(null, "added");
  const__17 = (clojure.lang.Keyword)Keyword.intern(null, "doc");
  const__18 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(), RT.vector(Symbol.intern(null, "s1")), RT.vector(Symbol.intern(null, "s1"), Symbol.intern(null, "s2")), RT.vector(Symbol.intern(null, "s1"), Symbol.intern(null, "s2"), Symbol.intern(null, "&"), Symbol.intern(null, "sets")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.0", Keyword.intern(null, "doc"), "Return a set that is the union of the input sets", Keyword.intern(null, "line"), 19, Keyword.intern(null, "file"), "clojure/set.clj");
  const__19 = (clojure.lang.Var)RT.var("clojure.set", "intersection");
  const__20 = (java.lang.Integer)32;
  const__21 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "s1")), RT.vector(Symbol.intern(null, "s1"), Symbol.intern(null, "s2")), RT.vector(Symbol.intern(null, "s1"), Symbol.intern(null, "s2"), Symbol.intern(null, "&"), Symbol.intern(null, "sets"))));
  const__22 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "s1")), RT.vector(Symbol.intern(null, "s1"), Symbol.intern(null, "s2")), RT.vector(Symbol.intern(null, "s1"), Symbol.intern(null, "s2"), Symbol.intern(null, "&"), Symbol.intern(null, "sets")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.0", Keyword.intern(null, "doc"), "Return a set that is the intersection of the input sets", Keyword.intern(null, "line"), 32, Keyword.intern(null, "file"), "clojure/set.clj");
  const__23 = (clojure.lang.Var)RT.var("clojure.set", "difference");
  const__24 = (java.lang.Integer)48;
  const__25 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "s1")), RT.vector(Symbol.intern(null, "s1"), Symbol.intern(null, "s2")), RT.vector(Symbol.intern(null, "s1"), Symbol.intern(null, "s2"), Symbol.intern(null, "&"), Symbol.intern(null, "sets"))));
  const__26 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "s1")), RT.vector(Symbol.intern(null, "s1"), Symbol.intern(null, "s2")), RT.vector(Symbol.intern(null, "s1"), Symbol.intern(null, "s2"), Symbol.intern(null, "&"), Symbol.intern(null, "sets")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.0", Keyword.intern(null, "doc"), "Return a set that is the first set without elements of the remaining sets", Keyword.intern(null, "line"), 48, Keyword.intern(null, "file"), "clojure/set.clj");
  const__27 = (clojure.lang.Var)RT.var("clojure.set", "select");
  const__28 = (java.lang.Integer)64;
  const__29 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "pred"), Symbol.intern(null, "xset"))));
  const__30 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "pred"), Symbol.intern(null, "xset")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.0", Keyword.intern(null, "doc"), "Returns a set of the elements for which pred is true", Keyword.intern(null, "line"), 64, Keyword.intern(null, "file"), "clojure/set.clj");
  const__31 = (clojure.lang.Var)RT.var("clojure.set", "project");
  const__32 = (java.lang.Integer)71;
  const__33 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "xrel"), Symbol.intern(null, "ks"))));
  const__34 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "xrel"), Symbol.intern(null, "ks")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.0", Keyword.intern(null, "doc"), "Returns a rel of the elements of xrel with only the keys in ks", Keyword.intern(null, "line"), 71, Keyword.intern(null, "file"), "clojure/set.clj");
  const__35 = (clojure.lang.Var)RT.var("clojure.set", "rename-keys");
  const__36 = (java.lang.Integer)77;
  const__37 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "map"), Symbol.intern(null, "kmap"))));
  const__38 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "map"), Symbol.intern(null, "kmap")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.0", Keyword.intern(null, "doc"), "Returns the map with the keys in kmap renamed to the vals in kmap", Keyword.intern(null, "line"), 77, Keyword.intern(null, "file"), "clojure/set.clj");
  const__39 = (clojure.lang.Var)RT.var("clojure.set", "rename");
  const__40 = (java.lang.Integer)88;
  const__41 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "xrel"), Symbol.intern(null, "kmap"))));
  const__42 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "xrel"), Symbol.intern(null, "kmap")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.0", Keyword.intern(null, "doc"), "Returns a rel of the maps in xrel with the keys in kmap renamed to the vals in kmap", Keyword.intern(null, "line"), 88, Keyword.intern(null, "file"), "clojure/set.clj");
  const__43 = (clojure.lang.Var)RT.var("clojure.set", "index");
  const__44 = (java.lang.Integer)94;
  const__45 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "xrel"), Symbol.intern(null, "ks"))));
  const__46 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "xrel"), Symbol.intern(null, "ks")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.0", Keyword.intern(null, "doc"), "Returns a map of the distinct values of ks in the xrel mapped to a\n  set of the maps in xrel with the corresponding values of ks.", Keyword.intern(null, "line"), 94, Keyword.intern(null, "file"), "clojure/set.clj");
  const__47 = (clojure.lang.Var)RT.var("clojure.set", "map-invert");
  const__48 = (java.lang.Integer)105;
  const__49 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "m"))));
  const__50 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "m")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.0", Keyword.intern(null, "doc"), "Returns the map with the vals mapped to the keys.", Keyword.intern(null, "line"), 105, Keyword.intern(null, "file"), "clojure/set.clj");
  const__51 = (clojure.lang.Var)RT.var("clojure.set", "join");
  const__52 = (java.lang.Integer)110;
  const__53 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "xrel"), Symbol.intern(null, "yrel")), RT.vector(Symbol.intern(null, "xrel"), Symbol.intern(null, "yrel"), Symbol.intern(null, "km"))));
  const__54 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "xrel"), Symbol.intern(null, "yrel")), RT.vector(Symbol.intern(null, "xrel"), Symbol.intern(null, "yrel"), Symbol.intern(null, "km")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.0", Keyword.intern(null, "doc"), "When passed 2 rels, returns the rel corresponding to the natural\n  join. When passed an additional keymap, joins on the corresponding\n  keys.", Keyword.intern(null, "line"), 110, Keyword.intern(null, "file"), "clojure/set.clj");
  const__55 = (clojure.lang.Var)RT.var("clojure.set", "subset?");
  const__56 = (java.lang.Integer)141;
  const__57 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "set1"), Symbol.intern(null, "set2"))));
  const__58 = (clojure.lang.Keyword)Keyword.intern(null, "tag");
  const__59 = (java.lang.Class)java.lang.Boolean.class;
  const__60 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "set1"), Symbol.intern(null, "set2")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.2", Keyword.intern(null, "doc"), "Is set1 a subset of set2?", Keyword.intern(null, "line"), 141, Keyword.intern(null, "file"), "clojure/set.clj", Keyword.intern(null, "tag"), java.lang.Boolean.class);
  const__61 = (clojure.lang.Var)RT.var("clojure.set", "superset?");
  const__62 = (java.lang.Integer)149;
  const__63 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "set1"), Symbol.intern(null, "set2"))));
  const__64 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "set1"), Symbol.intern(null, "set2")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.2", Keyword.intern(null, "doc"), "Is set1 a superset of set2?", Keyword.intern(null, "line"), 149, Keyword.intern(null, "file"), "clojure/set.clj", Keyword.intern(null, "tag"), java.lang.Boolean.class);
 }
 static {
  __init0();
  clojure.lang.Compiler.pushNSandLoader(clojure.set__init.class.getClassLoader());
  try {
   load();
  } catch (Exception ___x) {
  throw new RuntimeException(___x);
  } finally {
   Var.popThreadBindings();
  }
 }
}
