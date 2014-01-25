package clojure;

import clojure.lang.*;

public final class zip_vector_zip extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.zip", "zipper");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "vector?");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "seq");
 }
 public zip_vector_zip() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object root1) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), const__2.getRawRoot(), new clojure.zip_vector_zip_fn__6984(), root1);
 }
}
