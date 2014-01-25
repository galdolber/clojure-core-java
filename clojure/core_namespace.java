package clojure;

import clojure.lang.*;

public final class core_namespace extends clojure.lang.AFunction {
 static {
 }
 public core_namespace() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  return ((java.lang.String)((clojure.lang.Named)x1).getNamespace());
 }
}
