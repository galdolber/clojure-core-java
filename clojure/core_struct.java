package clojure;

import clojure.lang.*;

public final class core_struct extends clojure.lang.RestFn {
 static {
 }
 public core_struct() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object s1, java.lang.Object vals2) {
  return ((clojure.lang.PersistentStructMap)clojure.lang.PersistentStructMap.construct((clojure.lang.PersistentStructMap.Def)((clojure.lang.PersistentStructMap.Def)s1), (clojure.lang.ISeq)((clojure.lang.ISeq)vals2)));
 }
 public int getRequiredArity() {
  return 1;
 }
}
