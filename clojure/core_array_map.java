package clojure;

import clojure.lang.*;

public final class core_array_map extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "to-array");
 }
 public core_array_map() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object keyvals1) {
  return ((clojure.lang.PersistentArrayMap)clojure.lang.PersistentArrayMap.createAsIfByAssoc((java.lang.Object[])((java.lang.Object[])((IFn)const__0.getRawRoot()).invoke(keyvals1))));
 }
 public java.lang.Object invoke() {
  return ((clojure.lang.PersistentArrayMap)clojure.lang.PersistentArrayMap.EMPTY);
 }
 public int getRequiredArity() {
  return 0;
 }
}
