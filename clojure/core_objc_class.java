package clojure;

import clojure.lang.*;

public final class core_objc_class extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "name");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "println");
 }
 public core_objc_class() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1) {
  if (clojure.lang.ObjC.objc) {
   return ((java.lang.Object)clojure.lang.RT.objcClass((java.lang.String)((java.lang.String)((IFn)const__0.getRawRoot()).invoke(s1))));
  } else {
   return ((IFn)const__1.getRawRoot()).invoke("Warning. objc-class always returns nil on the jvm");
  }
 }
}
