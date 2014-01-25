package clojure;

import clojure.lang.*;

public final class core_create_struct extends clojure.lang.RestFn {
 static {
 }
 public core_create_struct() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object keys1) {
  return ((clojure.lang.PersistentStructMap.Def)clojure.lang.PersistentStructMap.createSlotMap((clojure.lang.ISeq)((clojure.lang.ISeq)keys1)));
 }
 public int getRequiredArity() {
  return 0;
 }
}
