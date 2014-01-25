package clojure;

import clojure.lang.*;

public final class core_fn__6152 extends clojure.lang.AFunction {
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
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "->ArrayChunk");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "file");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "column");
  const__3 = (java.lang.Object)1;
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "line");
  const__5 = (java.lang.Object)34;
  const__6 = (clojure.lang.Keyword)Keyword.intern(null, "arglists");
  const__7 = (java.lang.Object)PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "am"), Symbol.intern(null, "arr"), Symbol.intern(null, "off"), Symbol.intern(null, "end"))));
  const__8 = (clojure.lang.Keyword)Keyword.intern(null, "doc");
  const__9 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "arglists"), PersistentList.create(java.util.Arrays.asList(RT.vector(Symbol.intern(null, "am"), Symbol.intern(null, "arr"), Symbol.intern(null, "off"), Symbol.intern(null, "end")))), Keyword.intern(null, "column"), 1, Keyword.intern(null, "doc"), "Positional factory function for class clojure.core.ArrayChunk.", Keyword.intern(null, "line"), 34, Keyword.intern(null, "file"), "clojure/gvec.clj");
  const__10 = (java.lang.Object)clojure.core.ArrayChunk.class;
 }
 public core_fn__6152() {
  super();
 }
 public java.lang.Object invoke() {
  {
   ((Namespace)RT.CURRENT_NS.deref()).importClass(clojure.core.ArrayChunk.class);
   const__0.setMeta((IPersistentMap)const__9);
   const__0.bindRoot(new clojure.core_fn__6152___GT_ArrayChunk__6154());
   return const__10;
  }
 }
}
