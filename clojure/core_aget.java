package clojure;

import clojure.lang.*;

public final class core_aget extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "class");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "aget");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "int");
 }
 public core_aget() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object array1, java.lang.Object idx2, java.lang.Object idxs3) {
  return ((IFn)const__1.getRawRoot()).invoke(const__2.getRawRoot(), Reflector.invokeStaticMethod(clojure.lang.RT.class, "aget", new Object[]{array1, Integer.valueOf(clojure.lang.RT.intCast(((java.lang.Object)idx2)))}), idxs3);
 }
 public java.lang.Object invoke(java.lang.Object array1, java.lang.Object idx2) {
  return ((java.lang.Object)clojure.lang.Reflector.prepRet((java.lang.Class)((java.lang.Class)((java.lang.Class)((java.lang.Class)((IFn)const__0.getRawRoot()).invoke(array1)).getComponentType())), ((java.lang.Object)((java.lang.Object)java.lang.reflect.Array.get(((java.lang.Object)array1), (int)RT.intCast(idx2))))));
 }
 public int getRequiredArity() {
  return 2;
 }
}
