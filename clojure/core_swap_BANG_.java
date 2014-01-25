package clojure;

import clojure.lang.*;

public final class core_swap_BANG_ extends clojure.lang.RestFn {
 static {
 }
 public core_swap_BANG_() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object atom1, java.lang.Object f2, java.lang.Object x3, java.lang.Object y4, java.lang.Object args5) {
  return ((java.lang.Object)((clojure.lang.Atom)atom1).swap((clojure.lang.IFn)((clojure.lang.IFn)f2), ((java.lang.Object)x3), ((java.lang.Object)y4), (clojure.lang.ISeq)((clojure.lang.ISeq)args5)));
 }
 public java.lang.Object invoke(java.lang.Object atom1, java.lang.Object f2, java.lang.Object x3, java.lang.Object y4) {
  return ((java.lang.Object)((clojure.lang.Atom)atom1).swap((clojure.lang.IFn)((clojure.lang.IFn)f2), ((java.lang.Object)x3), ((java.lang.Object)y4)));
 }
 public java.lang.Object invoke(java.lang.Object atom1, java.lang.Object f2, java.lang.Object x3) {
  return ((java.lang.Object)((clojure.lang.Atom)atom1).swap((clojure.lang.IFn)((clojure.lang.IFn)f2), ((java.lang.Object)x3)));
 }
 public java.lang.Object invoke(java.lang.Object atom1, java.lang.Object f2) {
  return ((java.lang.Object)((clojure.lang.Atom)atom1).swap((clojure.lang.IFn)((clojure.lang.IFn)f2)));
 }
 public int getRequiredArity() {
  return 4;
 }
}
