package clojure;

import clojure.lang.*;

public class edn__init {
 public static void load() throws Exception {
  ((IFn)const__0.getRawRoot()).invoke(const__1);
  ((IFn)new clojure.edn_loading__4931__auto__()).invoke();
  if (((clojure.lang.Symbol)const__1).equals(((java.lang.Object)const__2))) {
  } else {
   clojure.lang.LockingTransaction.runInTransaction((java.util.concurrent.Callable)((java.util.concurrent.Callable)new clojure.edn_fn__6918()));
  }
  const__3.setMeta((IPersistentMap)const__13);
  const__3.bindRoot(new clojure.edn_read());
  const__14.setMeta((IPersistentMap)const__17);
  const__14.bindRoot(new clojure.edn_read_string());
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
 static void __init0() {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "in-ns");
  const__1 = (clojure.lang.Symbol)((clojure.lang.IObj)Symbol.intern(null, "clojure.edn")).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "author"), "Rich Hickey", Keyword.intern(null, "doc"), "edn reading."));
  const__2 = (clojure.lang.Symbol)Symbol.intern(null, "clojure.core");
  const__3 = (clojure.lang.Var)RT.var("clojure.edn", "read");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "file");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "column");
  const__6 = (java.lang.Integer)1;
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "line");
  const__8 = (java.lang.Integer)14;
  const__9 = (clojure.lang.Keyword)Keyword.intern(null, "arglists");
  const__10 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(), RT.vector(Symbol.intern(null, "stream")), RT.vector(Symbol.intern(null, "opts"), Symbol.intern(null, "stream"))));
  const__11 = (clojure.lang.Keyword)Keyword.intern(null, "added");
  const__12 = (clojure.lang.Keyword)Keyword.intern(null, "doc");
  const__13 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(), RT.vector(Symbol.intern(null, "stream")), RT.vector(Symbol.intern(null, "opts"), Symbol.intern(null, "stream")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.5", Keyword.intern(null, "doc"), "Reads the next object from stream, which must be an instance of\n  java.io.PushbackReader or some derivee.  stream defaults to the\n  current value of *in*.\n\n  Reads data in the edn format (subset of Clojure data):\n  http://edn-format.org\n\n  opts is a map that can include the following keys:\n  :eof - value to return on end-of-file. When not supplied, eof throws an exception.\n  :readers  - a map of tag symbols to data-reader functions to be considered before default-data-readers.\n              When not supplied, only the default-data-readers will be used.\n  :default - A function of two args, that will, if present and no reader is found for a tag,\n             be called with the tag and the value.", Keyword.intern(null, "line"), 14, Keyword.intern(null, "file"), "clojure/edn.clj");
  const__14 = (clojure.lang.Var)RT.var("clojure.edn", "read-string");
  const__15 = (java.lang.Integer)37;
  const__16 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "s")), RT.vector(Symbol.intern(null, "opts"), Symbol.intern(null, "s"))));
  const__17 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "s")), RT.vector(Symbol.intern(null, "opts"), Symbol.intern(null, "s")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.5", Keyword.intern(null, "doc"), "Reads one object from the string s. Returns nil when s is nil or empty.\n\n  Reads data in the edn format (subset of Clojure data):\n  http://edn-format.org\n\n  opts is a map as per clojure.edn/read", Keyword.intern(null, "line"), 37, Keyword.intern(null, "file"), "clojure/edn.clj");
 }
 static {
  __init0();
  clojure.lang.Compiler.pushNSandLoader(clojure.edn__init.class.getClassLoader());
  try {
   load();
  } catch (Exception ___x) {
  throw new RuntimeException(___x);
  } finally {
   Var.popThreadBindings();
  }
 }
}
