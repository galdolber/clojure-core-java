package clojure;

import clojure.lang.*;

public final class core_struct_map extends clojure.lang.RestFn {
 static {
 }
 public core_struct_map() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object s1, java.lang.Object inits2) {
  return ((clojure.lang.PersistentStructMap)clojure.lang.PersistentStructMap.create((clojure.lang.PersistentStructMap.Def)((clojure.lang.PersistentStructMap.Def)s1), (clojure.lang.ISeq)((clojure.lang.ISeq)inits2)));
 }
 public int getRequiredArity() {
  return 1;
 }
}
