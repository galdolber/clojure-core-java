package clojure;

import clojure.lang.*;

public final class zip_vector_zip_fn__6984 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "with-meta");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "vec");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "meta");
 }
 public zip_vector_zip_fn__6984() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object node1, java.lang.Object children2) {
  return ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(children2), ((IFn)const__2.getRawRoot()).invoke(node1));
 }
}
