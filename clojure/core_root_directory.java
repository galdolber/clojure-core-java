package clojure;

import clojure.lang.*;

public final class core_root_directory extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "root-resource");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "subs");
  const__2 = (java.lang.Object)0L;
 }
 public core_root_directory() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object lib1) {
  {
   Object d2 = ((IFn)const__0.getRawRoot()).invoke(lib1);
   return ((IFn)const__1.getRawRoot()).invoke(d2, const__2, Integer.valueOf(((java.lang.String)d2).lastIndexOf((java.lang.String)((java.lang.String)"/"))));
  }
 }
}
