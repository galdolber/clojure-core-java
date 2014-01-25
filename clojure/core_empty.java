package clojure;

import clojure.lang.*;

public final class core_empty extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__1 = (java.lang.Object)clojure.lang.IPersistentCollection.class;
 }
 public core_empty() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object coll1) {
  if ((coll1 instanceof clojure.lang.IPersistentCollection)) {
   return ((clojure.lang.IPersistentCollection)((clojure.lang.IPersistentCollection)coll1).empty());
  } else {
   return null;
  }
 }
}
