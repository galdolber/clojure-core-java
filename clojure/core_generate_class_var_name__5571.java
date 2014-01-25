package clojure;

import clojure.lang.*;

public final class core_generate_class_var_name__5571 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "str");
 }
 public core_generate_class_var_name__5571() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1) {
  return ((java.lang.String)clojure.lang.Compiler.munge((java.lang.String)((java.lang.String)((IFn)const__0.getRawRoot()).invoke(s1, "__var"))));
 }
}
