package clojure;

import clojure.lang.*;

public final class core_bases extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "cons");
 }
 public core_bases() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object c1) {
  Object __r3031 = c1;
  if (__r3031 != null && !(__r3031 == Boolean.FALSE)) {
   {
    Object i2 = ((IFn)const__0.getRawRoot()).invoke(((java.lang.Class[])((java.lang.Class)c1).getInterfaces()));
    Object s3 = ((java.lang.Class)((java.lang.Class)c1).getSuperclass());
    Object __r3033 = s3;
    if (__r3033 != null && !(__r3033 == Boolean.FALSE)) {
     return ((IFn)const__1.getRawRoot()).invoke(s3, i2);
    } else {
     return i2;
    }
   }
  } else {
   return null;
  }
 }
}
