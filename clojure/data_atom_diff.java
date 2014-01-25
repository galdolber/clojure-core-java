package clojure;

import clojure.lang.*;

public final class data_atom_diff extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "=");
 }
 public data_atom_diff() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object a1, java.lang.Object b2) {
  if (clojure.lang.Util.equiv(((java.lang.Object)a1), ((java.lang.Object)b2))) {
   return RT.vector(null, null, a1);
  } else {
   return RT.vector(a1, b2, null);
  }
 }
}
