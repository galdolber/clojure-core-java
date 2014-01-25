package clojure;

import clojure.lang.*;

public final class core_compare_and_set_BANG_ extends clojure.lang.AFunction {
 static {
 }
 public core_compare_and_set_BANG_() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object atom1, java.lang.Object oldval2, java.lang.Object newval3) {
  return (((clojure.lang.Atom)atom1).compareAndSet(((java.lang.Object)oldval2), ((java.lang.Object)newval3)) ? Boolean.TRUE : Boolean.FALSE);
 }
}
