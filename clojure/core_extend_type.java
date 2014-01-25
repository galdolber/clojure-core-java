package clojure;

import clojure.lang.*;

public final class core_extend_type extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "emit-extend-type");
 }
 public core_extend_type() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object t3, java.lang.Object specs4) {
  return ((IFn)const__0.getRawRoot()).invoke(t3, specs4);
 }
 public int getRequiredArity() {
  return 3;
 }
}
