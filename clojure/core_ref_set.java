package clojure;

import clojure.lang.*;

public final class core_ref_set extends clojure.lang.AFunction {
 static {
 }
 public core_ref_set() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object ref1, java.lang.Object val2) {
  return ((java.lang.Object)((clojure.lang.Ref)ref1).set(((java.lang.Object)val2)));
 }
}
