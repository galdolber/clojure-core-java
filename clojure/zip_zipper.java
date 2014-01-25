package clojure;

import clojure.lang.*;

public final class zip_zipper extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Keyword const__2;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern("zip", "make-node");
  const__1 = (clojure.lang.Keyword)Keyword.intern("zip", "children");
  const__2 = (clojure.lang.Keyword)Keyword.intern("zip", "branch?");
 }
 public zip_zipper() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object branch_QMARK_1, java.lang.Object children2, java.lang.Object make_node3, java.lang.Object root4) {
  return ((IObj)RT.vector(root4, null)).withMeta(RT.mapUniqueKeys(const__0, make_node3, const__1, children2, const__2, branch_QMARK_1));
 }
}
