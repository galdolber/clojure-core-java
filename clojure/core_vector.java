package clojure;

import clojure.lang.*;

public final class core_vector extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "cons");
 }
 public core_vector() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object a1, java.lang.Object b2, java.lang.Object c3, java.lang.Object d4, java.lang.Object args5) {
  return ((clojure.lang.IPersistentVector)clojure.lang.LazilyPersistentVector.create((java.util.Collection)((java.util.Collection)((IFn)const__0.getRawRoot()).invoke(a1, ((IFn)const__0.getRawRoot()).invoke(b2, ((IFn)const__0.getRawRoot()).invoke(c3, ((IFn)const__0.getRawRoot()).invoke(d4, args5)))))));
 }
 public java.lang.Object invoke(java.lang.Object a1, java.lang.Object b2, java.lang.Object c3, java.lang.Object d4) {
  return RT.vector(a1, b2, c3, d4);
 }
 public java.lang.Object invoke(java.lang.Object a1, java.lang.Object b2, java.lang.Object c3) {
  return RT.vector(a1, b2, c3);
 }
 public java.lang.Object invoke(java.lang.Object a1, java.lang.Object b2) {
  return RT.vector(a1, b2);
 }
 public java.lang.Object invoke(java.lang.Object a1) {
  return RT.vector(a1);
 }
 public java.lang.Object invoke() {
  return clojure.lang.PersistentVector.EMPTY;
 }
 public int getRequiredArity() {
  return 4;
 }
}
