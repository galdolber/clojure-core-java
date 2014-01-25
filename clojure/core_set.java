package clojure;

import clojure.lang.*;

public final class core_set extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
 }
 public core_set() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object coll1) {
  return ((clojure.lang.PersistentHashSet)clojure.lang.PersistentHashSet.create((clojure.lang.ISeq)((clojure.lang.ISeq)((IFn)const__0.getRawRoot()).invoke(coll1))));
 }
}
