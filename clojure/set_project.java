package clojure;

import clojure.lang.*;

public final class set_project extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "with-meta");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "set");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "meta");
 }
 public set_project() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object xrel1, java.lang.Object ks2) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(new clojure.set_project_fn__6871(ks2), xrel1)), ((IFn)const__3.getRawRoot()).invoke(xrel1));
 }
}
