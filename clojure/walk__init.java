package clojure;

import clojure.lang.*;

public class walk__init {
 public static void load() throws Exception {
  ((IFn)const__0.getRawRoot()).invoke(const__1);
  ((IFn)new clojure.walk_loading__4931__auto__()).invoke();
  if (((clojure.lang.Symbol)const__1).equals(((java.lang.Object)const__2))) {
  } else {
   clojure.lang.LockingTransaction.runInTransaction((java.util.concurrent.Callable)((java.util.concurrent.Callable)new clojure.walk_fn__6590()));
  }
  const__3.setMeta((IPersistentMap)const__13);
  const__3.bindRoot(new clojure.walk_walk());
  const__14.setMeta((IPersistentMap)const__17);
  const__14.bindRoot(new clojure.walk_postwalk());
  const__18.setMeta((IPersistentMap)const__21);
  const__18.bindRoot(new clojure.walk_prewalk());
  const__22.setMeta((IPersistentMap)const__25);
  const__22.bindRoot(new clojure.walk_postwalk_demo());
  const__26.setMeta((IPersistentMap)const__29);
  const__26.bindRoot(new clojure.walk_prewalk_demo());
  const__30.setMeta((IPersistentMap)const__33);
  const__30.bindRoot(new clojure.walk_keywordize_keys());
  const__34.setMeta((IPersistentMap)const__37);
  const__34.bindRoot(new clojure.walk_stringify_keys());
  const__38.setMeta((IPersistentMap)const__41);
  const__38.bindRoot(new clojure.walk_prewalk_replace());
  const__42.setMeta((IPersistentMap)const__45);
  const__42.bindRoot(new clojure.walk_postwalk_replace());
  const__46.setMeta((IPersistentMap)const__49);
  const__46.bindRoot(new clojure.walk_macroexpand_all());
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
 private static clojure.lang.Keyword const__12;
 private static clojure.lang.IPersistentMap const__13;
 private static clojure.lang.Var const__14;
 private static java.lang.Integer const__15;
 private static clojure.lang.IPersistentList const__16;
 private static clojure.lang.IPersistentMap const__17;
 private static clojure.lang.Var const__18;
 private static java.lang.Integer const__19;
 private static clojure.lang.IPersistentList const__20;
 private static clojure.lang.IPersistentMap const__21;
 private static clojure.lang.Var const__22;
 private static java.lang.Integer const__23;
 private static clojure.lang.IPersistentList const__24;
 private static clojure.lang.IPersistentMap const__25;
 private static clojure.lang.Var const__26;
 private static java.lang.Integer const__27;
 private static clojure.lang.IPersistentList const__28;
 private static clojure.lang.IPersistentMap const__29;
 private static clojure.lang.Var const__30;
 private static java.lang.Integer const__31;
 private static clojure.lang.IPersistentList const__32;
 private static clojure.lang.IPersistentMap const__33;
 private static clojure.lang.Var const__34;
 private static java.lang.Integer const__35;
 private static clojure.lang.IPersistentList const__36;
 private static clojure.lang.IPersistentMap const__37;
 private static clojure.lang.Var const__38;
 private static java.lang.Integer const__39;
 private static clojure.lang.IPersistentList const__40;
 private static clojure.lang.IPersistentMap const__41;
 private static clojure.lang.Var const__42;
 private static java.lang.Integer const__43;
 private static clojure.lang.IPersistentList const__44;
 private static clojure.lang.IPersistentMap const__45;
 private static clojure.lang.Var const__46;
 private static java.lang.Integer const__47;
 private static clojure.lang.IPersistentList const__48;
 private static clojure.lang.IPersistentMap const__49;
 static void __init0() {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "in-ns");
  const__1 = (clojure.lang.Symbol)((clojure.lang.IObj)Symbol.intern(null, "clojure.walk")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "doc"), "This file defines a generic tree walker for Clojure data\nstructures.  It takes any data structure (list, vector, map, set,\nseq), calls a function on every element, and uses the return value\nof the function in place of the original.  This makes it fairly\neasy to write recursive search-and-replace functions, as shown in\nthe examples.\n\nNote: \"walk\" supports all Clojure data structures EXCEPT maps\ncreated with sorted-map-by.  There is no (obvious) way to retrieve\nthe sorting function.", Keyword.intern(null, "author"), "Stuart Sierra"));
  const__2 = (clojure.lang.Symbol)Symbol.intern(null, "clojure.core");
  const__3 = (clojure.lang.Var)RT.var("clojure.walk", "walk");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "file");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "column");
  const__6 = (java.lang.Integer)1;
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "line");
  const__8 = (java.lang.Integer)35;
  const__9 = (clojure.lang.Keyword)Keyword.intern(null, "arglists");
  const__10 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "inner"), Symbol.intern(null, "outer"), Symbol.intern(null, "form"))));
  const__11 = (clojure.lang.Keyword)Keyword.intern(null, "added");
  const__12 = (clojure.lang.Keyword)Keyword.intern(null, "doc");
  const__13 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "inner"), Symbol.intern(null, "outer"), Symbol.intern(null, "form")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.1", Keyword.intern(null, "doc"), "Traverses form, an arbitrary data structure.  inner and outer are\n  functions.  Applies inner to each element of form, building up a\n  data structure of the same type, then applies outer to the result.\n  Recognizes all Clojure data structures. Consumes seqs as with doall.", Keyword.intern(null, "line"), 35, Keyword.intern(null, "file"), "clojure/walk.clj");
  const__14 = (clojure.lang.Var)RT.var("clojure.walk", "postwalk");
  const__15 = (java.lang.Integer)50;
  const__16 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "f"), Symbol.intern(null, "form"))));
  const__17 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "f"), Symbol.intern(null, "form")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.1", Keyword.intern(null, "doc"), "Performs a depth-first, post-order traversal of form.  Calls f on\n  each sub-form, uses f's return value in place of the original.\n  Recognizes all Clojure data structures. Consumes seqs as with doall.", Keyword.intern(null, "line"), 50, Keyword.intern(null, "file"), "clojure/walk.clj");
  const__18 = (clojure.lang.Var)RT.var("clojure.walk", "prewalk");
  const__19 = (java.lang.Integer)58;
  const__20 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "f"), Symbol.intern(null, "form"))));
  const__21 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "f"), Symbol.intern(null, "form")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.1", Keyword.intern(null, "doc"), "Like postwalk, but does pre-order traversal.", Keyword.intern(null, "line"), 58, Keyword.intern(null, "file"), "clojure/walk.clj");
  const__22 = (clojure.lang.Var)RT.var("clojure.walk", "postwalk-demo");
  const__23 = (java.lang.Integer)77;
  const__24 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "form"))));
  const__25 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "form")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.1", Keyword.intern(null, "doc"), "Demonstrates the behavior of postwalk by printing each form as it is\n  walked.  Returns form.", Keyword.intern(null, "line"), 77, Keyword.intern(null, "file"), "clojure/walk.clj");
  const__26 = (clojure.lang.Var)RT.var("clojure.walk", "prewalk-demo");
  const__27 = (java.lang.Integer)84;
  const__28 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "form"))));
  const__29 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "form")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.1", Keyword.intern(null, "doc"), "Demonstrates the behavior of prewalk by printing each form as it is\n  walked.  Returns form.", Keyword.intern(null, "line"), 84, Keyword.intern(null, "file"), "clojure/walk.clj");
  const__30 = (clojure.lang.Var)RT.var("clojure.walk", "keywordize-keys");
  const__31 = (java.lang.Integer)91;
  const__32 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "m"))));
  const__33 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "m")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.1", Keyword.intern(null, "doc"), "Recursively transforms all map keys from strings to keywords.", Keyword.intern(null, "line"), 91, Keyword.intern(null, "file"), "clojure/walk.clj");
  const__34 = (clojure.lang.Var)RT.var("clojure.walk", "stringify-keys");
  const__35 = (java.lang.Integer)99;
  const__36 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "m"))));
  const__37 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "m")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.1", Keyword.intern(null, "doc"), "Recursively transforms all map keys from keywords to strings.", Keyword.intern(null, "line"), 99, Keyword.intern(null, "file"), "clojure/walk.clj");
  const__38 = (clojure.lang.Var)RT.var("clojure.walk", "prewalk-replace");
  const__39 = (java.lang.Integer)107;
  const__40 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "smap"), Symbol.intern(null, "form"))));
  const__41 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "smap"), Symbol.intern(null, "form")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.1", Keyword.intern(null, "doc"), "Recursively transforms form by replacing keys in smap with their\n  values.  Like clojure/replace but works on any data structure.  Does\n  replacement at the root of the tree first.", Keyword.intern(null, "line"), 107, Keyword.intern(null, "file"), "clojure/walk.clj");
  const__42 = (clojure.lang.Var)RT.var("clojure.walk", "postwalk-replace");
  const__43 = (java.lang.Integer)115;
  const__44 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "smap"), Symbol.intern(null, "form"))));
  const__45 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "smap"), Symbol.intern(null, "form")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.1", Keyword.intern(null, "doc"), "Recursively transforms form by replacing keys in smap with their\n  values.  Like clojure/replace but works on any data structure.  Does\n  replacement at the leaves of the tree first.", Keyword.intern(null, "line"), 115, Keyword.intern(null, "file"), "clojure/walk.clj");
  const__46 = (clojure.lang.Var)RT.var("clojure.walk", "macroexpand-all");
  const__47 = (java.lang.Integer)123;
  const__48 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "form"))));
  const__49 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "form")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.1", Keyword.intern(null, "doc"), "Recursively performs all possible macroexpansions in form.", Keyword.intern(null, "line"), 123, Keyword.intern(null, "file"), "clojure/walk.clj");
 }
 static {
  __init0();
  clojure.lang.Compiler.pushNSandLoader(clojure.walk__init.class.getClassLoader());
  try {
   load();
  } catch (Exception ___x) {
  throw new RuntimeException(___x);
  } finally {
   Var.popThreadBindings();
  }
 }
}
