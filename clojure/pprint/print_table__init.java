package clojure.pprint;

import clojure.lang.*;

public class print_table__init {
 public static void load() throws Exception {
  ((IFn)const__0.getRawRoot()).invoke(const__1);
  const__2.setMeta((IPersistentMap)const__12);
  const__2.bindRoot(new clojure.pprint_print_table());
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
 private static clojure.lang.Keyword const__11;
 private static clojure.lang.IPersistentMap const__12;
 static void __init0() {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "in-ns");
  const__1 = (clojure.lang.Symbol)Symbol.intern(null, "clojure.pprint");
  const__2 = (clojure.lang.Var)RT.var("clojure.pprint", "print-table");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "file");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "column");
  const__5 = (java.lang.Integer)1;
  const__6 = (clojure.lang.Keyword)Keyword.intern(null, "line");
  const__7 = (java.lang.Integer)11;
  const__8 = (clojure.lang.Keyword)Keyword.intern(null, "arglists");
  const__9 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "ks"), Symbol.intern(null, "rows")), RT.vector(Symbol.intern(null, "rows"))));
  const__10 = (clojure.lang.Keyword)Keyword.intern(null, "added");
  const__11 = (clojure.lang.Keyword)Keyword.intern(null, "doc");
  const__12 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "ks"), Symbol.intern(null, "rows")), RT.vector(Symbol.intern(null, "rows")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.3", Keyword.intern(null, "doc"), "Alpha - subject to change.\n   Prints a collection of maps in a textual table. Prints table headings\n   ks, and then a line of output for each row, corresponding to the keys\n   in ks. If ks are not specified, use the keys of the first item in rows.", Keyword.intern(null, "line"), 11, Keyword.intern(null, "file"), "clojure/pprint/print_table.clj");
 }
 static {
  __init0();
  clojure.lang.Compiler.pushNSandLoader(clojure.pprint.print_table__init.class.getClassLoader());
  try {
   load();
  } catch (Exception ___x) {
  throw new RuntimeException(___x);
  } finally {
   Var.popThreadBindings();
  }
 }
}
