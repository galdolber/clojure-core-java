package clojure;

import clojure.lang.*;

public final class core_construct_proxy extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "to-array");
 }
 public core_construct_proxy() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object c1, java.lang.Object ctor_args2) {
  return ((java.lang.Object)clojure.lang.Reflector.invokeConstructor((java.lang.Class)((java.lang.Class)c1), (java.lang.Object[])((java.lang.Object[])((IFn)const__0.getRawRoot()).invoke(ctor_args2))));
 }
 public int getRequiredArity() {
  return 1;
 }
}
