package clojure;

import clojure.lang.*;

public final class core_aset extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "aset");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "aget");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "int");
 }
 public core_aset() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object array1, java.lang.Object idx2, java.lang.Object idx23, java.lang.Object idxv4) {
  return ((IFn)const__0.getRawRoot()).invoke(const__1.getRawRoot(), Reflector.invokeStaticMethod(clojure.lang.RT.class, "aget", new Object[]{array1, Integer.valueOf(clojure.lang.RT.intCast(((java.lang.Object)idx2)))}), idx23, idxv4);
 }
 public java.lang.Object invoke(java.lang.Object array1, java.lang.Object idx2, java.lang.Object val3) {
  java.lang.reflect.Array.set(((java.lang.Object)array1), (int)RT.intCast(idx2), ((java.lang.Object)val3));
  return val3;
 }
 public int getRequiredArity() {
  return 3;
 }
}
