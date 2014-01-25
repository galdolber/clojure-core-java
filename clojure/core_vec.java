package clojure;

import clojure.lang.*;

public final class core_vec extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__1 = (java.lang.Object)java.util.Collection.class;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "to-array");
 }
 public core_vec() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object coll1) {
  if ((coll1 instanceof java.util.Collection)) {
   return ((clojure.lang.IPersistentVector)clojure.lang.LazilyPersistentVector.create((java.util.Collection)((java.util.Collection)coll1)));
  } else {
   return ((clojure.lang.IPersistentVector)clojure.lang.LazilyPersistentVector.createOwning((java.lang.Object[])((java.lang.Object[])((IFn)const__2.getRawRoot()).invoke(coll1))));
  }
 }
}
