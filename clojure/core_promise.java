package clojure;

import clojure.lang.*;

public final class core_promise extends clojure.lang.AFunction {
 public static final java.lang.Object const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Keyword const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Keyword const__4;
 public static final java.lang.Object const__5;
 public static final clojure.lang.IPersistentMap const__6;
 static {
  const__0 = (java.lang.Object)1L;
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "atom");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "line");
  const__3 = (java.lang.Object)6516;
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "column");
  const__5 = (java.lang.Object)5;
  const__6 = (clojure.lang.IPersistentMap)RT.map(Keyword.intern(null, "column"), 5, Keyword.intern(null, "line"), 6516);
 }
 public core_promise() {
  super();
 }
 public java.lang.Object invoke() {
  {
   Object d1 = new java.util.concurrent.CountDownLatch((int)RT.intCast(1L));
   Object v2 = ((IFn)const__1.getRawRoot()).invoke(d1);
   return ((IObj)new clojure.core_promise_reify__6363(v2, d1)).withMeta(const__6);
  }
 }
}
