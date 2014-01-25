package clojure;

import clojure.lang.*;

public final class data_fn__8809 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Keyword const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Keyword const__4;
 public static final java.lang.Object const__5;
 public static final clojure.lang.Keyword const__6;
 public static final clojure.lang.IPersistentMap const__7;
 public static final clojure.lang.IPersistentMap const__8;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.data", "EqualityPartition");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "file");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "column");
  const__3 = (java.lang.Object)1;
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "line");
  const__5 = (java.lang.Object)67;
  const__6 = (clojure.lang.Keyword)Keyword.intern(null, "added");
  const__7 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.3", Keyword.intern(null, "line"), 67, Keyword.intern(null, "file"), "clojure/data.clj");
  const__8 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.3", Keyword.intern(null, "line"), 67, Keyword.intern(null, "file"), "clojure/data.clj");
 }
 public data_fn__8809() {
  super();
 }
 public java.lang.Object invoke() {
  {
   const__0.setMeta((IPersistentMap)const__7);
   Object v__4952__auto__1 = const__0;
   if (((clojure.lang.Var)v__4952__auto__1).hasRoot()) {
    return null;
   } else {
    const__0.setMeta((IPersistentMap)const__8);
    const__0.bindRoot(clojure.lang.PersistentArrayMap.EMPTY);
    return const__0;
   }
  }
 }
}
