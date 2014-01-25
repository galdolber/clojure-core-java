package clojure;

import clojure.lang.*;

public final class pprint_fn__7603 extends clojure.lang.AFunction {
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
 public static final clojure.lang.IPersistentMap const__10;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "*print-pprint-dispatch*");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "file");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "column");
  const__3 = (java.lang.Object)1;
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "line");
  const__5 = (java.lang.Object)34;
  const__6 = (clojure.lang.Keyword)Keyword.intern(null, "dynamic");
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "added");
  const__8 = (clojure.lang.Keyword)Keyword.intern(null, "doc");
  const__9 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "dynamic"), Boolean.TRUE, Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.2", Keyword.intern(null, "doc"), "The pretty print dispatch function. Use with-pprint-dispatch or set-pprint-dispatch\nto modify.", Keyword.intern(null, "line"), 34, Keyword.intern(null, "file"), "clojure/pprint/pprint_base.clj");
  const__10 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "dynamic"), Boolean.TRUE, Keyword.intern(null, "column"), 1, Keyword.intern(null, "added"), "1.2", Keyword.intern(null, "doc"), "The pretty print dispatch function. Use with-pprint-dispatch or set-pprint-dispatch\nto modify.", Keyword.intern(null, "line"), 34, Keyword.intern(null, "file"), "clojure/pprint/pprint_base.clj");
 }
 public pprint_fn__7603() {
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
    const__0.setMeta((IPersistentMap)const__10);
    const__0.bindRoot(null);
    return const__0;
   }
  }
 }
}
