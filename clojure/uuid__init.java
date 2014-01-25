package clojure;

import clojure.lang.*;

public class uuid__init {
 public static void load() throws Exception {
  ((IFn)const__0.getRawRoot()).invoke(const__1);
  ((IFn)new clojure.uuid_loading__4931__auto__()).invoke();
  if (((clojure.lang.Symbol)const__1).equals(((java.lang.Object)const__2))) {
  } else {
   clojure.lang.LockingTransaction.runInTransaction((java.util.concurrent.Callable)((java.util.concurrent.Callable)new clojure.uuid_fn__6291()));
  }
  const__3.setMeta((IPersistentMap)const__12);
  const__3.bindRoot(new clojure.uuid_default_uuid_reader());
  ((clojure.lang.MultiFn)const__13.getRawRoot()).addMethod(((java.lang.Object)const__14), (clojure.lang.IFn)((clojure.lang.IFn)new clojure.uuid_fn__6294()));
  ((clojure.lang.MultiFn)const__15.getRawRoot()).addMethod(((java.lang.Object)const__14), (clojure.lang.IFn)((clojure.lang.IFn)new clojure.uuid_fn__6296()));
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
 private static java.lang.Class const__14;
 private static clojure.lang.Var const__15;
 static void __init0() {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "in-ns");
  const__1 = (clojure.lang.Symbol)Symbol.intern(null, "clojure.uuid");
  const__2 = (clojure.lang.Symbol)Symbol.intern(null, "clojure.core");
  const__3 = (clojure.lang.Var)RT.var("clojure.uuid", "default-uuid-reader");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "file");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "column");
  const__6 = (java.lang.Integer)1;
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "line");
  const__8 = (java.lang.Integer)11;
  const__9 = (clojure.lang.Keyword)Keyword.intern(null, "arglists");
  const__10 = (clojure.lang.IPersistentList)PersistentList.create(java.util.Arrays.asList(((clojure.lang.IObj)RT.vector(Symbol.intern(null, "form"))).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "pre"), RT.vector(((clojure.lang.IObj)PersistentList.create(java.util.Arrays.asList(Symbol.intern(null, "string?"), Symbol.intern(null, "form")))).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "line"), 12, Keyword.intern(null, "column"), 10)))))));
  const__11 = (clojure.lang.Keyword)Keyword.intern(null, "private");
  const__12 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(((clojure.lang.IObj)RT.vector(Symbol.intern(null, "form"))).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "pre"), RT.vector(((clojure.lang.IObj)PersistentList.create(java.util.Arrays.asList(Symbol.intern(null, "string?"), Symbol.intern(null, "form")))).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "line"), 12, Keyword.intern(null, "column"), 10))))))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "private"), Boolean.TRUE, Keyword.intern(null, "line"), 11, Keyword.intern(null, "file"), "clojure/uuid.clj");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "print-method");
  const__14 = (java.lang.Class)java.util.UUID.class;
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "print-dup");
 }
 static {
  __init0();
  clojure.lang.Compiler.pushNSandLoader(clojure.uuid__init.class.getClassLoader());
  try {
   load();
  } catch (Exception ___x) {
  throw new RuntimeException(___x);
  } finally {
   Var.popThreadBindings();
  }
 }
}
