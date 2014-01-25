package clojure;

import clojure.lang.*;

public final class core_tree_seq extends clojure.lang.AFunction {
 static {
 }
 public core_tree_seq() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object branch_QMARK_1, java.lang.Object children2, java.lang.Object root3) {
  {
   Object walk4 = new clojure.core_tree_seq_walk__4675(branch_QMARK_1, children2);
   return ((IFn)walk4).invoke(root3);
  }
 }
}
