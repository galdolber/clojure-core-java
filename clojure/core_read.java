package clojure;

import clojure.lang.*;

public final class core_read extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "read");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "*in*");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "boolean");
 }
 public core_read() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object stream1, java.lang.Object eof_error_QMARK_2, java.lang.Object eof_value3, java.lang.Object recursive_QMARK_4) {
  return ((java.lang.Object)clojure.lang.LispReader.read((java.io.PushbackReader)((java.io.PushbackReader)stream1), (boolean)clojure.lang.RT.booleanCast(((java.lang.Object)eof_error_QMARK_2)), ((java.lang.Object)eof_value3), (boolean)((Boolean)recursive_QMARK_4).booleanValue()));
 }
 public java.lang.Object invoke(java.lang.Object stream1, java.lang.Object eof_error_QMARK_2, java.lang.Object eof_value3) {
  return ((IFn)const__0.getRawRoot()).invoke(stream1, eof_error_QMARK_2, eof_value3, Boolean.FALSE);
 }
 public java.lang.Object invoke(java.lang.Object stream1) {
  return ((IFn)const__0.getRawRoot()).invoke(stream1, Boolean.TRUE, null);
 }
 public java.lang.Object invoke() {
  return ((IFn)const__0.getRawRoot()).invoke(const__1.get());
 }
}
