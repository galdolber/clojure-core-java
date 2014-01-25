package clojure;

import clojure.lang.*;

public final class core_meta extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__1 = (java.lang.Object)clojure.lang.IMeta.class;
 }
 public core_meta() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  if ((x1 instanceof clojure.lang.IMeta)) {
   return ((clojure.lang.IPersistentMap)((clojure.lang.IMeta)x1).meta());
  } else {
   return null;
  }
 }
}
