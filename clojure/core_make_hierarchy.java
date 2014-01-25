package clojure;

import clojure.lang.*;

public final class core_make_hierarchy extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Keyword const__2;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "parents");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "descendants");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "ancestors");
 }
 public core_make_hierarchy() {
  super();
 }
 public java.lang.Object invoke() {
  return RT.mapUniqueKeys(const__0, clojure.lang.PersistentArrayMap.EMPTY, const__1, clojure.lang.PersistentArrayMap.EMPTY, const__2, clojure.lang.PersistentArrayMap.EMPTY);
 }
}
