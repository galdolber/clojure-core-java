package clojure.core;

import clojure.lang.*;

public final class reducers_fn__6731 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Keyword const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Keyword const__4;
 public static final java.lang.Object const__5;
 public static final clojure.lang.Keyword const__6;
 public static final java.lang.Object const__7;
 public static final clojure.lang.Keyword const__8;
 public static final clojure.lang.IPersistentMap const__9;
 public static final java.lang.Object const__10;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core.reducers", "->Cat");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "file");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "column");
  const__3 = (java.lang.Object)1;
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "line");
  const__5 = (java.lang.Object)263;
  const__6 = (clojure.lang.Keyword)Keyword.intern(null, "arglists");
  const__7 = (java.lang.Object)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "cnt"), Symbol.intern(null, "left"), Symbol.intern(null, "right"))));
  const__8 = (clojure.lang.Keyword)Keyword.intern(null, "doc");
  const__9 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "cnt"), Symbol.intern(null, "left"), Symbol.intern(null, "right")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "doc"), "Positional factory function for class clojure.core.reducers.Cat.", Keyword.intern(null, "line"), 263, Keyword.intern(null, "file"), "clojure/core/reducers.clj");
  const__10 = (java.lang.Object)clojure.core.reducers.Cat.class;
 }
 public reducers_fn__6731() {
  super();
 }
 public java.lang.Object invoke() {
  {
   ((Namespace)RT.CURRENT_NS.deref()).importClass(clojure.core.reducers.Cat.class);
   const__0.setMeta((IPersistentMap)const__9);
   const__0.bindRoot(new clojure.core.reducers_fn__6731___GT_Cat__6737());
   return const__10;
  }
 }
}
