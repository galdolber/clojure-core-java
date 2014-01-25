package clojure;

import clojure.lang.*;

public final class core_get_super_and_interfaces extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__1 = (java.lang.Object)java.lang.Object.class;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "next");
 }
 public core_get_super_and_interfaces() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object bases1) {
  if (((java.lang.Class)((IFn)const__0.getRawRoot()).invoke(bases1)).isInterface()) {
   return RT.vector(const__1, bases1);
  } else {
   return RT.vector(((IFn)const__0.getRawRoot()).invoke(bases1), ((IFn)const__2.getRawRoot()).invoke(bases1));
  }
 }
}
