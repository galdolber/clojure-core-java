package clojure;

import clojure.lang.*;

public final class core_tree_seq_walk__4675 extends clojure.lang.AFunction {
 static {
 }
 Object branch_QMARK_1;
 Object children2;
 public core_tree_seq_walk__4675(final Object branch_QMARK_1, final Object children2) {
  super();
  this.branch_QMARK_1 = branch_QMARK_1;
  this.children2 = children2;
 }
 public java.lang.Object invoke(java.lang.Object node1) {
  return new clojure.lang.LazySeq((clojure.lang.IFn)((clojure.lang.IFn)new clojure.core_tree_seq_walk__4675_fn__4676(node1, this.branch_QMARK_1, this, this.children2)));
 }
}
