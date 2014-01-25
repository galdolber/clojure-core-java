package clojure;

import clojure.lang.*;

public final class core_apply extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "list*");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "spread");
 }
 public core_apply() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object f1, java.lang.Object a2, java.lang.Object b3, java.lang.Object c4, java.lang.Object d5, java.lang.Object args6) {
  return ((java.lang.Object)((clojure.lang.IFn)f1).applyTo((clojure.lang.ISeq)((clojure.lang.ISeq)((IFn)const__2.getRawRoot()).invoke(a2, ((IFn)const__2.getRawRoot()).invoke(b3, ((IFn)const__2.getRawRoot()).invoke(c4, ((IFn)const__2.getRawRoot()).invoke(d5, ((IFn)const__3.getRawRoot()).invoke(args6))))))));
 }
 public java.lang.Object invoke(java.lang.Object f1, java.lang.Object x2, java.lang.Object y3, java.lang.Object z4, java.lang.Object args5) {
  return ((java.lang.Object)((clojure.lang.IFn)f1).applyTo((clojure.lang.ISeq)((clojure.lang.ISeq)((IFn)const__1.getRawRoot()).invoke(x2, y3, z4, args5))));
 }
 public java.lang.Object invoke(java.lang.Object f1, java.lang.Object x2, java.lang.Object y3, java.lang.Object args4) {
  return ((java.lang.Object)((clojure.lang.IFn)f1).applyTo((clojure.lang.ISeq)((clojure.lang.ISeq)((IFn)const__1.getRawRoot()).invoke(x2, y3, args4))));
 }
 public java.lang.Object invoke(java.lang.Object f1, java.lang.Object x2, java.lang.Object args3) {
  return ((java.lang.Object)((clojure.lang.IFn)f1).applyTo((clojure.lang.ISeq)((clojure.lang.ISeq)((IFn)const__1.getRawRoot()).invoke(x2, args3))));
 }
 public java.lang.Object invoke(java.lang.Object f1, java.lang.Object args2) {
  return ((java.lang.Object)((clojure.lang.IFn)f1).applyTo((clojure.lang.ISeq)((clojure.lang.ISeq)((IFn)const__0.getRawRoot()).invoke(args2))));
 }
 public int getRequiredArity() {
  return 5;
 }
}
