package clojure;

import clojure.lang.*;

public final class core_require extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Keyword const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "load-libs");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "require");
 }
 public core_require() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object args1) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), const__2, args1);
 }
 public int getRequiredArity() {
  return 0;
 }
}
