package clojure;

import clojure.lang.*;

public final class core_file_seq extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "tree-seq");
 }
 public core_file_seq() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object dir1) {
  return ((IFn)const__0.getRawRoot()).invoke(new clojure.core_file_seq_fn__4680(), new clojure.core_file_seq_fn__4682(), dir1);
 }
}
