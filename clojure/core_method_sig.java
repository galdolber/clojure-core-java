package clojure;

import clojure.lang.*;

public final class core_method_sig extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
 }
 public core_method_sig() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object meth1) {
  return RT.vector(((java.lang.String)((java.lang.reflect.Method)meth1).getName()), ((IFn)const__0.getRawRoot()).invoke(((java.lang.Class[])((java.lang.reflect.Method)meth1).getParameterTypes())), ((java.lang.Class)((java.lang.reflect.Method)meth1).getReturnType()));
 }
}
