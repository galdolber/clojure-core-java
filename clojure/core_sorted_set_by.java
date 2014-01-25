package clojure;

import clojure.lang.*;

public final class core_sorted_set_by extends clojure.lang.RestFn {
 static {
 }
 public core_sorted_set_by() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object comparator1, java.lang.Object keys2) {
  return ((clojure.lang.PersistentTreeSet)clojure.lang.PersistentTreeSet.create((java.util.Comparator)((java.util.Comparator)comparator1), (clojure.lang.ISeq)((clojure.lang.ISeq)keys2)));
 }
 public int getRequiredArity() {
  return 1;
 }
}
