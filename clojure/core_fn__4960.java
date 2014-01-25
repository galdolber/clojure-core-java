package clojure;

import clojure.lang.*;

public final class core_fn__4960 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Keyword const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Keyword const__4;
 public static final java.lang.Object const__5;
 public static final clojure.lang.Keyword const__6;
 public static final clojure.lang.Keyword const__7;
 public static final clojure.lang.Keyword const__8;
 public static final clojure.lang.IPersistentMap const__9;
 public static final java.lang.Object const__10;
 public static final clojure.lang.IPersistentMap const__11;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "*loading-verbosely*");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "file");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "column");
  const__3 = (java.lang.Object)1;
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "line");
  const__5 = (java.lang.Object)5346;
  const__6 = (clojure.lang.Keyword)Keyword.intern(null, "dynamic");
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "doc");
  const__8 = (clojure.lang.Keyword)Keyword.intern(null, "private");
  const__9 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "dynamic"), Boolean.TRUE, Keyword.intern(null, "column"), 1, Keyword.intern(null, "private"), Boolean.TRUE, Keyword.intern(null, "doc"), "True while a verbose load is pending", Keyword.intern(null, "line"), 5346, Keyword.intern(null, "file"), "clojure/core.clj");
  const__10 = (java.lang.Object)5346;
  const__11 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "dynamic"), Boolean.TRUE, Keyword.intern(null, "column"), 1, Keyword.intern(null, "private"), Boolean.TRUE, Keyword.intern(null, "doc"), "True while a verbose load is pending", Keyword.intern(null, "line"), 5346, Keyword.intern(null, "file"), "clojure/core.clj");
 }
 public core_fn__4960() {
  super();
 }
 public java.lang.Object invoke() {
  {
   const__0.setDynamic(true);
   const__0.setMeta((IPersistentMap)const__9);
   Object v__4952__auto__1 = const__0;
   if (((clojure.lang.Var)v__4952__auto__1).hasRoot()) {
    return null;
   } else {
    const__0.setDynamic(true);
    const__0.setMeta((IPersistentMap)const__11);
    const__0.bindRoot(Boolean.FALSE);
    return const__0;
   }
  }
 }
}
