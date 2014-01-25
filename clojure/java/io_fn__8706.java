package clojure.java;

import clojure.lang.*;

public final class io_fn__8706 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Keyword const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Keyword const__4;
 public static final java.lang.Object const__5;
 public static final clojure.lang.Keyword const__6;
 public static final clojure.lang.IPersistentStack const__7;
 public static final clojure.lang.Keyword const__8;
 public static final clojure.lang.Keyword const__9;
 public static final clojure.lang.IPersistentMap const__10;
 public static final clojure.lang.Var const__11;
 public static final java.lang.Object const__12;
 public static final clojure.lang.Var const__13;
 public static final java.lang.Object const__14;
 public static final clojure.lang.IPersistentMap const__15;
 public static final clojure.lang.Keyword const__16;
 public static final clojure.lang.Var const__17;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.java.io", "do-copy");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "file");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "column");
  const__3 = (java.lang.Object)1;
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "line");
  const__5 = (java.lang.Object)289;
  const__6 = (clojure.lang.Keyword)Keyword.intern(null, "arglists");
  const__7 = (clojure.lang.IPersistentStack)((clojure.lang.IObj)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "input"), Symbol.intern(null, "output"), Symbol.intern(null, "opts"))))).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "line"), 292, Keyword.intern(null, "column"), 17));
  const__8 = (clojure.lang.Keyword)Keyword.intern(null, "private");
  const__9 = (clojure.lang.Keyword)Keyword.intern(null, "doc");
  const__10 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), ((clojure.lang.IObj)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "input"), Symbol.intern(null, "output"), Symbol.intern(null, "opts"))))).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "line"), 292, Keyword.intern(null, "column"), 17)), Keyword.intern(null, "column"), 1, Keyword.intern(null, "private"), Boolean.TRUE, Keyword.intern(null, "doc"), "Internal helper for copy", Keyword.intern(null, "line"), 289, Keyword.intern(null, "file"), "clojure/java/io.clj");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__12 = (java.lang.Object)clojure.lang.MultiFn.class;
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__14 = (java.lang.Object)289;
  const__15 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), ((clojure.lang.IObj)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "input"), Symbol.intern(null, "output"), Symbol.intern(null, "opts"))))).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "line"), 292, Keyword.intern(null, "column"), 17)), Keyword.intern(null, "column"), 1, Keyword.intern(null, "private"), Boolean.TRUE, Keyword.intern(null, "doc"), "Internal helper for copy", Keyword.intern(null, "line"), 289, Keyword.intern(null, "file"), "clojure/java/io.clj");
  const__16 = (clojure.lang.Keyword)Keyword.intern(null, "default");
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "global-hierarchy");
 }
 public io_fn__8706() {
  super();
 }
 public java.lang.Object invoke() {
  {
   const__0.setMeta((IPersistentMap)const__10);
   Object v__4105__auto__1 = const__0;
   Object __r6296 = null;
   boolean and__3966__auto__2 = ((clojure.lang.Var)v__4105__auto__1).hasRoot();
   Object __r6297;
   if (and__3966__auto__2) {
    __r6297 = (((IFn)const__13.getRawRoot()).invoke(v__4105__auto__1) instanceof clojure.lang.MultiFn);
   } else {
    __r6297 = and__3966__auto__2;
   }
   if ((java.lang.Boolean)__r6297) {
    return null;
   } else {
    const__0.setMeta((IPersistentMap)const__15);
    const__0.bindRoot(new clojure.lang.MultiFn((java.lang.String)((java.lang.String)"do-copy"), (clojure.lang.IFn)((clojure.lang.IFn)new clojure.java.io_fn__8706_fn__8707()), ((java.lang.Object)const__16), (clojure.lang.IRef)((clojure.lang.IRef)const__17)));
    return const__0;
   }
  }
 }
}
