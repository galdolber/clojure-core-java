package clojure;

import clojure.lang.*;

public final class zip_edit extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.zip", "replace");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__2 = (clojure.lang.Var)RT.var("clojure.zip", "node");
 }
 public zip_edit() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object loc1, java.lang.Object f2, java.lang.Object args3) {
  return ((IFn)const__0.getRawRoot()).invoke(loc1, ((IFn)const__1.getRawRoot()).invoke(f2, ((IFn)const__2.getRawRoot()).invoke(loc1), args3));
 }
 public int getRequiredArity() {
  return 2;
 }
}
