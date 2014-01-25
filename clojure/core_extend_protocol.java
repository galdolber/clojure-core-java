package clojure;

import clojure.lang.*;

public final class core_extend_protocol extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "emit-extend-protocol");
 }
 public core_extend_protocol() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object p3, java.lang.Object specs4) {
  return ((IFn)const__0.getRawRoot()).invoke(p3, specs4);
 }
 public int getRequiredArity() {
  return 3;
 }
}
