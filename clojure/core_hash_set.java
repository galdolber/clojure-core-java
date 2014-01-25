package clojure;

import clojure.lang.*;

public final class core_hash_set extends clojure.lang.RestFn {
 static {
 }
 public core_hash_set() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object keys1) {
  return ((clojure.lang.PersistentHashSet)clojure.lang.PersistentHashSet.create((clojure.lang.ISeq)((clojure.lang.ISeq)keys1)));
 }
 public java.lang.Object invoke() {
  return clojure.lang.PersistentHashSet.EMPTY;
 }
 public int getRequiredArity() {
  return 0;
 }
}
