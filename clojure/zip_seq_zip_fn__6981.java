package clojure;

import clojure.lang.*;

public final class zip_seq_zip_fn__6981 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "with-meta");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "meta");
 }
 public zip_seq_zip_fn__6981() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object node1, java.lang.Object children2) {
  return ((IFn)const__0.getRawRoot()).invoke(children2, ((IFn)const__1.getRawRoot()).invoke(node1));
 }
}
