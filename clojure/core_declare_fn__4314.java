package clojure;

import clojure.lang.*;

public final class core_declare_fn__4314 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Symbol const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Keyword const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__1 = (clojure.lang.Symbol)Symbol.intern(null, "def");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "vary-meta");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "declared");
 }
 public core_declare_fn__4314() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object p1__4313_SHARP_1) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1, ((IFn)const__2.getRawRoot()).invoke(p1__4313_SHARP_1, const__3.getRawRoot(), const__4, Boolean.TRUE));
 }
}
