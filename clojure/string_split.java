package clojure;

import clojure.lang.*;

public final class string_split extends clojure.lang.AFunction {
 static {
 }
 public string_split() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object s1, java.lang.Object re2, java.lang.Object limit3) {
  return ((clojure.lang.IPersistentVector)clojure.lang.LazilyPersistentVector.createOwning((java.lang.Object[])((java.lang.Object[])((java.lang.String[])((java.util.regex.Pattern)re2).split((java.lang.CharSequence)((java.lang.CharSequence)s1), (int)RT.intCast(limit3))))));
 }
 public java.lang.Object invoke(java.lang.Object s1, java.lang.Object re2) {
  return ((clojure.lang.IPersistentVector)clojure.lang.LazilyPersistentVector.createOwning((java.lang.Object[])((java.lang.Object[])((java.lang.String[])((java.util.regex.Pattern)re2).split((java.lang.CharSequence)((java.lang.CharSequence)s1))))));
 }
}
