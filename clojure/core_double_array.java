package clojure;

import clojure.lang.*;

public final class core_double_array extends clojure.lang.AFunction {
 static {
 }
 public core_double_array() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object size1, java.lang.Object init_val_or_seq2) {
  return ((double[])clojure.lang.Numbers.double_array((int)RT.intCast(size1), ((java.lang.Object)init_val_or_seq2)));
 }
 public java.lang.Object invoke(java.lang.Object size_or_seq1) {
  return ((double[])clojure.lang.Numbers.double_array(((java.lang.Object)size_or_seq1)));
 }
}
