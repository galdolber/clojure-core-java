package clojure;

import clojure.lang.*;

public final class core_into_array extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
 }
 public core_into_array() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object type1, java.lang.Object aseq2) {
  return ((java.lang.Object)clojure.lang.RT.seqToTypedArray((java.lang.Class)((java.lang.Class)type1), (clojure.lang.ISeq)((clojure.lang.ISeq)((IFn)const__0.getRawRoot()).invoke(aseq2))));
 }
 public java.lang.Object invoke(java.lang.Object aseq1) {
  return ((java.lang.Object)clojure.lang.RT.seqToTypedArray((clojure.lang.ISeq)((clojure.lang.ISeq)((IFn)const__0.getRawRoot()).invoke(aseq1))));
 }
}
