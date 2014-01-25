package clojure;

import clojure.lang.*;

public final class core_file_seq_fn__4682 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
 }
 public core_file_seq_fn__4682() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object d1) {
  return ((IFn)const__0.getRawRoot()).invoke(((java.io.File[])((java.io.File)d1).listFiles()));
 }
}
