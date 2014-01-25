package clojure;

import clojure.lang.*;

public final class core_ensure extends clojure.lang.AFunction {
 static {
 }
 public core_ensure() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object ref1) {
  ((clojure.lang.Ref)ref1).touch();
  return ((java.lang.Object)((clojure.lang.Ref)ref1).deref());
 }
}
