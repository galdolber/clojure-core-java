package clojure;

import clojure.lang.*;

public final class core_sorted_set extends clojure.lang.RestFn {
 static {
 }
 public core_sorted_set() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object keys1) {
  return ((clojure.lang.PersistentTreeSet)clojure.lang.PersistentTreeSet.create((clojure.lang.ISeq)((clojure.lang.ISeq)keys1)));
 }
 public int getRequiredArity() {
  return 0;
 }
}
