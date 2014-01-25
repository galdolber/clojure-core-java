package clojure;

import clojure.lang.*;

public final class core_commute extends clojure.lang.RestFn {
 static {
 }
 public core_commute() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object ref1, java.lang.Object fun2, java.lang.Object args3) {
  return ((java.lang.Object)((clojure.lang.Ref)ref1).commute((clojure.lang.IFn)((clojure.lang.IFn)fun2), (clojure.lang.ISeq)((clojure.lang.ISeq)args3)));
 }
 public int getRequiredArity() {
  return 2;
 }
}
