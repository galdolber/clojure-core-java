package clojure;

import clojure.lang.*;

public final class core_vary_meta extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "with-meta");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "meta");
 }
 public core_vary_meta() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object obj1, java.lang.Object f2, java.lang.Object args3) {
  return ((IFn)const__0.getRawRoot()).invoke(obj1, ((IFn)const__1.getRawRoot()).invoke(f2, ((IFn)const__2.getRawRoot()).invoke(obj1), args3));
 }
 public int getRequiredArity() {
  return 2;
 }
}
