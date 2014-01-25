package clojure;

import clojure.lang.*;

public final class core_hash_map extends clojure.lang.RestFn {
 static {
 }
 public core_hash_map() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object keyvals1) {
  return ((clojure.lang.PersistentHashMap)clojure.lang.PersistentHashMap.create((clojure.lang.ISeq)((clojure.lang.ISeq)keyvals1)));
 }
 public java.lang.Object invoke() {
  return clojure.lang.PersistentArrayMap.EMPTY;
 }
 public int getRequiredArity() {
  return 0;
 }
}
