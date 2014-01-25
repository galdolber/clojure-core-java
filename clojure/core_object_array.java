package clojure;

import clojure.lang.*;

public final class core_object_array extends clojure.lang.AFunction {
 static {
 }
 public core_object_array() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object size_or_seq1) {
  return ((java.lang.Object[])clojure.lang.RT.object_array(((java.lang.Object)size_or_seq1)));
 }
}
