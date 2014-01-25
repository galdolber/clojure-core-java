package clojure;

import clojure.lang.*;

public final class core_int_array extends clojure.lang.AFunction {
 static {
 }
 public core_int_array() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object size1, java.lang.Object init_val_or_seq2) {
  return ((int[])clojure.lang.Numbers.int_array((int)RT.intCast(size1), ((java.lang.Object)init_val_or_seq2)));
 }
 public java.lang.Object invoke(java.lang.Object size_or_seq1) {
  return ((int[])clojure.lang.Numbers.int_array(((java.lang.Object)size_or_seq1)));
 }
}
