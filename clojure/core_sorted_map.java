package clojure;

import clojure.lang.*;

public final class core_sorted_map extends clojure.lang.RestFn {
 static {
 }
 public core_sorted_map() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object keyvals1) {
  return ((clojure.lang.PersistentTreeMap)clojure.lang.PersistentTreeMap.create((clojure.lang.ISeq)((clojure.lang.ISeq)keyvals1)));
 }
 public int getRequiredArity() {
  return 0;
 }
}
