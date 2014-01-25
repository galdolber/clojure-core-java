package clojure;

import clojure.lang.*;

public final class core_ancestors_fn__4900 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "get");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "ancestors");
 }
 Object h1;
 public core_ancestors_fn__4900(final Object h1) {
  super();
  this.h1 = h1;
 }
 public java.lang.Object invoke(java.lang.Object p1__4899_SHARP_1) {
  return ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)RT.get(this.h1, Keyword.intern(null, "ancestors"))), ((java.lang.Object)p1__4899_SHARP_1)));
 }
}
