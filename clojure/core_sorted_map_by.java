package clojure;

import clojure.lang.*;

public final class core_sorted_map_by extends clojure.lang.RestFn {
 static {
 }
 public core_sorted_map_by() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object comparator1, java.lang.Object keyvals2) {
  return ((clojure.lang.PersistentTreeMap)clojure.lang.PersistentTreeMap.create((java.util.Comparator)((java.util.Comparator)comparator1), (clojure.lang.ISeq)((clojure.lang.ISeq)keyvals2)));
 }
 public int getRequiredArity() {
  return 1;
 }
}
