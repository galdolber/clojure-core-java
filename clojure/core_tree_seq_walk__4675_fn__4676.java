package clojure;

import clojure.lang.*;

public final class core_tree_seq_walk__4675_fn__4676 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "mapcat");
 }
 Object node1;
 Object branch_QMARK_1;
 Object walk0;
 Object children2;
 public core_tree_seq_walk__4675_fn__4676(final Object node1, final Object branch_QMARK_1, final Object walk0, final Object children2) {
  super();
  this.node1 = node1;
  this.branch_QMARK_1 = branch_QMARK_1;
  this.walk0 = walk0;
  this.children2 = children2;
 }
 public java.lang.Object invoke() {
  Object __r2904;
  Object __r2905 = ((IFn)this.branch_QMARK_1).invoke(this.node1);
  if (__r2905 != null && !(__r2905 == Boolean.FALSE)) {
   __r2904 = ((IFn)const__1.getRawRoot()).invoke(this.walk0, ((IFn)this.children2).invoke(this.node1));
  } else {
   __r2904 = null;
  }
  return ((IFn)const__0.getRawRoot()).invoke(this.node1, __r2904);
 }
}
