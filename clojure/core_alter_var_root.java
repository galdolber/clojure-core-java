package clojure;

import clojure.lang.*;

public final class core_alter_var_root extends clojure.lang.RestFn {
 static {
 }
 public core_alter_var_root() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object v1, java.lang.Object f2, java.lang.Object args3) {
  return ((java.lang.Object)((clojure.lang.Var)v1).alterRoot((clojure.lang.IFn)((clojure.lang.IFn)f2), (clojure.lang.ISeq)((clojure.lang.ISeq)args3)));
 }
 public int getRequiredArity() {
  return 2;
 }
}
