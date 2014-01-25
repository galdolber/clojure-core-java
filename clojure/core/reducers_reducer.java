package clojure.core;

import clojure.lang.*;

public final class reducers_reducer extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Keyword const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.IPersistentMap const__4;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "line");
  const__1 = (java.lang.Object)107;
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "column");
  const__3 = (java.lang.Object)6;
  const__4 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "column"), 6, Keyword.intern(null, "line"), 107);
 }
 public reducers_reducer() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object coll1, java.lang.Object xf2) {
  return ((IObj)new clojure.core.reducers_reducer_reify__6661(coll1, xf2)).withMeta(const__4);
 }
}
