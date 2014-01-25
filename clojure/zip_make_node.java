package clojure;

import clojure.lang.*;

public final class zip_make_node extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern("zip", "make-node");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "meta");
 }
 public zip_make_node() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object loc1, java.lang.Object node2, java.lang.Object children3) {
  return ((IFn)RT.get(((IFn)const__1.getRawRoot()).invoke(loc1), Keyword.intern("zip", "make-node"))).invoke(node2, children3);
 }
}
