package clojure;

import clojure.lang.*;

public final class core_array extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "into-array");
 }
 public core_array() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object items1) {
  return ((IFn)const__0.getRawRoot()).invoke(items1);
 }
 public int getRequiredArity() {
  return 0;
 }
}
