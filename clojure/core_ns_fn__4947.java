package clojure;

import clojure.lang.*;

public final class core_ns_fn__4947 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "refer-clojure");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "first");
 }
 public core_ns_fn__4947() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p1__4936_SHARP_1) {
  return (clojure.lang.Util.equiv(((java.lang.Object)const__1), ((java.lang.Object)((IFn)const__2.getRawRoot()).invoke(p1__4936_SHARP_1))) ? Boolean.TRUE : Boolean.FALSE);
 }
}
