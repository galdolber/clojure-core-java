package clojure;

import clojure.lang.*;

public final class core_defprotocol extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "emit-protocol");
 }
 public core_defprotocol() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object _AMPERSAND_form1, java.lang.Object _AMPERSAND_env2, java.lang.Object name3, java.lang.Object opts_PLUS_sigs4) {
  return ((IFn)const__0.getRawRoot()).invoke(name3, opts_PLUS_sigs4);
 }
 public int getRequiredArity() {
  return 3;
 }
}
